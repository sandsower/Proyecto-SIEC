package clases;

//import net.sf.jasperreports.engine.JRExporterParameter.PROGRESS_MONITOR;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.*;
import net.sf.jasperreports.engine.util.*;
import net.sf.jasperreports.view.*;
import java.util.*;
import java.sql.*;
import java.io.*;
import java.awt.*;

public class Scriplet implements Serializable {

        private int tiempo;
	private static final String TASK_COMPILE  = "compile";
	private static final String TASK_FILL     = "fill";
	private static final String TASK_PRINT    = "print";
	private static final String TASK_PDF      = "pdf";
	private static final String TASK_XML      = "xml";
	private static final String TASK_XML_EMBED= "xmlEmbed";
	private static final String TASK_HTML     = "html";
	private static final String TASK_XLS      = "xls";
	private static final String TASK_CSV      = "csv";
	private static final String TASK_RUN      = "run";

	private Map parameters       = null;
	private String source        = null;
	private String target        = null;
  private String extension     = null;
	private Connection connection= null;
	private boolean compile      = false;
	private boolean correcto     = false;
	private boolean debug        = false;

	public Scriplet() {

	}; // constructor

	public void setParameter(Map parameters) {
		this.parameters= parameters;
	}; // setparameters

  public void setSource(String source) {
		this.source= source;
	}; // setSource

	public void setTarget(String target) {
		this.target= target;
	}; // setTarget

  public String getTarget() {
		return getTarget();
	}; // getTarget

	public void setConnection(Connection connection) {
		this.connection= connection;
	}; // setConnection

	public void setCompile(boolean compile) {
		this.compile= compile;
	}; // setCompile

	public boolean procesar(String typeExport, boolean compile) {
    setExtension(typeExport);
		setCompile(compile);
		return procesar(typeExport);
	}; // procesar

	public boolean procesar(String typeExport) {
    setExtension(typeExport);
		if(compile)
			proceso("compile");
	  proceso("fill");
	  return proceso(typeExport);
	}; // setProcesar

	private boolean proceso(String taskName) {
		correcto= false;
		if(target==null || target.length()== 0)
			target= source;
		try	{
			long start = System.currentTimeMillis();
			if (TASK_COMPILE.equals(taskName)) {
				JasperCompileManager.compileReportToFile(source+ ".xml");
				if(debug)
  				System.out.println("Compile-tiempo: " + (System.currentTimeMillis() - start));
			}
			else
			if (TASK_FILL.equals(taskName)) {
				//Preparing parameters
				JasperFillManager.fillReportToFile(source+ ".jasper", parameters, connection);
				if(debug)
  				System.out.println("Filling-tiempo: " + (System.currentTimeMillis() - start));
			}
			else
			if (TASK_PRINT.equals(taskName))	{
  		  JasperPrintManager.printReport(source+ ".jrprint", true);
				if(debug)
  			  System.out.println("Printing -tiempo: " + (System.currentTimeMillis() - start));
		  }
		  else
	 		if (TASK_PDF.equals(taskName))	{
		    JasperExportManager.exportReportToPdfFile(source+ ".jrprint", target+ ".pdf");
                    setTiempo(((int)(System.currentTimeMillis() - start)));
				if(debug)
  		    System.out.println("PDF-Tiempo de creaciÃ³n: " + (System.currentTimeMillis() - start));
	    }
	    else
			if (TASK_XML.equals(taskName)) {
	      JasperExportManager.exportReportToXmlFile(source+ ".jrprint", target+ ".xml", false);
				if(debug)
  	      System.out.println("XML-Tiempo de creaciÃ³n: " + (System.currentTimeMillis() - start));
	    }
	    else
	    if (TASK_XML_EMBED.equals(taskName)) {
		    JasperExportManager.exportReportToXmlFile(source+ ".jrprint", target+ ".xmlEmbed", true);
				if(debug)
  		    System.out.println("XML-Tiempo de creaciÃ³n: " + (System.currentTimeMillis() - start));
			}
			else
			if (TASK_HTML.equals(taskName))	{
			  JasperExportManager.exportReportToHtmlFile(source+ ".jrprint", target+ ".html");
				if(debug)
  			  System.out.println("HTML-Tiempo de creaciÃ³n: " + (System.currentTimeMillis() - start));
			}
			else
			if (TASK_XLS.equals(taskName)) {
				File sourceFile = new File(source+ ".jrprint");
        JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);
        File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".xls");
        JRXlsExporter exporter = new JRXlsExporter();
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, target+ ".xls");
				exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE);
				//exporter.setParameter(JRExporterParameter.PROGRESS_MONITOR, new exportProgressMonitor());
        exporter.exportReport();
				if(debug)
  				System.out.println("XLS-Tiempo de creaciÃ³n: " + (System.currentTimeMillis() - start));
			}
			else
			if (TASK_CSV.equals(taskName))	{
				File sourceFile = new File(source+ ".jrprint");
				JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);
				File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".csv");
				JRCsvExporter exporter = new JRCsvExporter();
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, target+ ".csv");
				//exporter.setParameter(JRExporterParameter.PROGRESS_MONITOR, new exportProgressMonitor());
				exporter.exportReport();
				if(debug)
  				System.out.println("CSV-Tiempo de creaciÃ³n: " + (System.currentTimeMillis() - start));
			}
			else
			if (TASK_RUN.equals(taskName))	{
				//Preparing parameters
				JasperRunManager.runReportToPdfFile(source+ ".jrprint", parameters, connection);
				if(debug)
  				System.out.println("PDF running-tiempo: " + (System.currentTimeMillis() - start));
			}; // if
			correcto= true;
		}
		catch (JRException e)	{
			System.out.println("[scriptletBean.proceso] Error: "+ e);
                        e.printStackTrace();
		}
		catch (Exception e)	{
			System.out.println("[scriptletBean.proceso] Error: "+ e);
                        e.printStackTrace();
		}
		return correcto;
	}; // proceso

	private static void usage()	{
		System.out.println( "scriptletBean uso:" );
		System.out.println( "\tjava scriptletBean -Ttask -Ffile" );
		System.out.println( "\tTarea: compile | fill | print | pdf | xml | xmlEmbed | html | xls | csv | run" );
	}

	public void setDebug(boolean debug) {
	  this.debug= debug;
	}; // setDebug

  public java.lang.String getExtension() {
    return "."+ extension;
  }; // getExtension

  public void setExtension(java.lang.String extension) {
    this.extension = extension;
  }; // setExtension

	public static void main(String[] args)	{
		String source = null;
		String taskName = null;
    if(args.length == 0) {
			usage();
			return;
		}
		int k= 0;
		while(args.length > k) {
			if (args[k].startsWith("-T"))
				taskName = args[k].substring(2);
			if (args[k].startsWith("-F"))
				source = args[k].substring(2);
			k++;
		}

	}

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}; // scriptletBean
