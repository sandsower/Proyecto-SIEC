<%--
    Document   : impresionQuique
    Created on : 2/12/2010, 11:40:11 AM
    Author     : ENRIQUE
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
        <style type="text/css">
            /* Copiar todo el estilo */
            /* Estilo para el plugin barra progreso */
            .barraProgresoContenedor{
                margin:14em auto;
                display: block;
                width: 80%;
                overflow: hidden;
            }
            .barraPorcentaje{
                font-family: Arial;
            }
            .barraProgreso{
                border: solid 1px #0e59a1;
                height: 15px;
                padding: 1px;
            }
            /* Editar para color de barra contenido */
            .barraProgresoContenido{
                background: #c2d2db;
                height: 100%;
                width: 0;
            }
            /* Estilo de mensaje despues de carga */
            .barraok{
                text-align: center;
                font-style: italic;
                font-family: Arial, Helvetica;
            }
        </style>
    </head>
    <body>
        <h3>Su Reporte ha sido Generado!</h3>
        <%--<h3>Esta ubicado en: C:\Users\ENRIQUE\Documents\NetBeansProjects\ReportesIReport\build\web </h3>--%>

        <%
               clases.ReporteCompetencia r = (clases.ReporteCompetencia)
                       request.getAttribute("categoria");

                 Connection conection       = null;
                Statement statement        = null;
                try {
                    //ConnectorDb.Connect();
                    Class.forName("com.mysql.jdbc.Driver");
                    conection=DriverManager.getConnection("jdbc:mysql://localhost/siec","root","13450811");

                int competenciaId = Integer.parseInt(request.getParameter("idCompetencia"));

                StringBuffer sb = new StringBuffer();
                sb.append("SELECT b.COMPETENCIA_ID AS Clave, b.DES_COMPETENCIA AS Competencia, b.DESCRIPCION AS Descripcion, a.DES_CATEGORIA AS Categoria ");
                sb.append("FROM tc_competencias b,tc_categorias a ");
                if (competenciaId!=0)
                sb.append("WHERE b.COMPETENCIA_ID = ").append(r.getIdCompetencia());
                sb.append(" order by clave ");

                 String path = "C:/Proyecto-SIEC/web/ReporteCompetencias";
                 String ruta="";

                 System.setProperty("jasper.reports.compile.class.path", application.getRealPath("/WEB-INF/lib/jasperreports-3.7.4.jar")+
                 System.getProperty("path.separator")+ application.getRealPath("/WEB-INF/classes/"));
                 System.setProperty("jasper.reports.compile.temp", application.getRealPath("/"));
                 Map parameters = new HashMap();
                 parameters.put("REPORTTITLE", "ReporteCompetencias");
                 parameters.put("query",sb.toString());



      xScriptlet.setSource(path);
      xScriptlet.setTarget(application.getRealPath(ruta)+ "/"+"Reporte de Competencias");
      xScriptlet.setParameter(parameters);
      xScriptlet.setConnection(conection);
      xScriptlet.procesar("pdf", false);
      xZips.setDebug(false);
      xZips.setEliminar(true);


      xZips.compactar(application.getRealPath(ruta)+ "/ReporteCompetencias.zip", application.getRealPath(ruta),"Reporte de Competencias.pdf");


        ruta="/build/web/";
       String ruta1= xUtil.getContexto(request)+ruta+"Reporte de Competencias.zip";
      %>
             <a href="<%=xUtil.getContexto(request)%>/ReporteCompetencias.zip" target="_self">
                 <img  src="images/pdf.png" border="0" style="cursor:hand" name="imgPdf"></a>
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
