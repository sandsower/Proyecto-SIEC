<%--
    Document  : impresion
    Created on : 18-nov-2010, 12:45:48
    Author    : Maria.Teran
--%>

<%@page contentType="text/html" import="java.sql.*,java.util.*,net.sf.jasperreports.engine.*"  pageEncoding="UTF-8"%>
<jsp:useBean id="xScriptlet" class="clases.Scriplet" scope="page"/>
<jsp:useBean id="xZips" class="clases.CompactarArchivo" scope="page"/>
<jsp:useBean id="xUtil" class="clases.Funciones" scope="session"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reporte generado!</h1>

        <%
                Connection conection      = null;
                Statement statement        = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    //conection=DriverManager.getConnection("jdbc:mysql://localhost:8889/siec", "root","admin");
                    conection=DriverManager.getConnection("jdbc:mysql://localhost/siec", "root","13450811");
                        


                //String path = "c:/Ejemplos/web/Estrategias"; // ruta donde esta el jasper dentro de tu proyecto
                String path = "c://Proyecto-SIEC/web/ReporteCriterio"; // ruta donde esta el jasper dentro de tu proyecto
               // String path = "/Users/Garrison/Desktop/reporte/Reporte de Competencias";
                String ruta="";

                System.setProperty("jasper.reports.compile.class.path", application.getRealPath("/WEB-INF/lib/jasperreports-3.7.4.jar")+
                System.getProperty("path.separator")+ application.getRealPath("/WEB-INF/classes/"));
                System.setProperty("jasper.reports.compile.temp", application.getRealPath("/"));
                Map parameters = new HashMap();
                parameters.put("REPORTTITLE", "Criterios");
                parameters.put("CRITERIO_ID","3");



      xScriptlet.setSource(path);
      xScriptlet.setTarget(application.getRealPath(ruta)+ "/"+"ReporteCriterio");
      xScriptlet.setParameter(parameters);
      xScriptlet.setConnection(conection);
      xScriptlet.procesar("pdf", false);
      xZips.setDebug(false);
      xZips.setEliminar(true);


      xZips.compactar(application.getRealPath(ruta)+ "/ReporteCriterio.zip", application.getRealPath(ruta),"Reporte de Estrategias.pdf");

      %>
      <table>
      <tr class="general">
        <td class="general">Archivo de Competencias </td>

        <td class="general" align="center">

            <a href="<%=xUtil.getContexto(request)%>/ReporteCriterio.zip" target="_self">
                <img  src="images/pdf.png" border="0" style="cursor:hand" name="imgPdf"></a>



      </tr>
      </table>


    <%
      }
                catch(Exception e) {
                    e.printStackTrace(System.out);
                }
                finally {
                    if(statement!= null)
                        statement.close();
                    statement= null;

  }
          %>
    </body>
</html>