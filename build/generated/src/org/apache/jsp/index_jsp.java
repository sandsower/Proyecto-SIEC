package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=iso-8859-1\">\n");
      out.write("\t<title>SIEC &bull; Nombre de la Página</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/siec.css\" media=\"all\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/siec.js\"></script>\n");
      out.write("<SCRIPT type=\"text/JavaScript\" src=\"js/Eventos.js\"> </SCRIPT>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"top\"><a name=\"top\"></a></div>\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("   <div id=\"header\">\n");
      out.write("\n");
      out.write("       <div id=\"desktopTitlebarWrapper\">\n");
      out.write("\t\t\t<div id=\"desktopTitlebar\">\n");
      out.write("\t\t\t\t<h1 class=\"hidden\">SIEC</h1>\n");
      out.write("\t\t\t\t<div class=\"fr topbar\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"logout.jsp\">Desconectarse</a></li>\n");
      out.write("                                                <li>Bienvenido <span class=\"nameuser\"> Usuario </span></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("           <div id=\"mprincipal\">\n");
      out.write("              <ul>\n");
      out.write("\t\t<li><a id=\"Opcion1\">AutoEvaluacion</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion2\">CoEvaluacion</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion3\">EvaluacionAcumulativa</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion4\">EvaluacionFormativa</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion5\">Integrantes</a></li>\n");
      out.write("             </ul>\n");
      out.write("           </div>\n");
      out.write("           <div id=\"mtopctrl\">\n");
      out.write("              <ul>\n");
      out.write("                  <li><a id=\"btnhidecols\" class=\"btnhidecolsnp\" href=\"#\">Ocultar Columnas</a></li>\n");
      out.write("             </ul>\n");
      out.write("           </div>\n");
      out.write("\t</div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("    <div id=\"menul\"><!-- Menu izquierdo -->\n");
      out.write("    <div class=\"cuadro\">\n");
      out.write("\t<div class=\"theader\">Cuadro 1</div>\n");
      out.write("\t<div class=\"cuadcont\">\n");
      out.write("            <p>Info de cuadro 1</p>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("   </div><!-- Menu izquierdo -->\n");
      out.write("   <div id=\"mitte\"><!-- Contenido -->\n");
      out.write("\n");
      out.write("                        <div class=\"col1\" id=\"PARRAFO1\" width=\"200\" height=\"200\">\n");
      out.write("                            <iframe id=\"PARRAFO1\" width=\"1200\" height=\"900\" src=\"AutoEva.jsp\" align=\"left\"></iframe>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col1\" id=\"PARRAFO2\">\n");
      out.write("                            <iframe width=\"1200\" height=\"900\" src=\"CoEva.jsp\" ></iframe>\n");
      out.write("                \t</div>\n");
      out.write("\n");
      out.write("                        <div class=\"col1\" id=\"PARRAFO3\">\n");
      out.write("                            <iframe width=\"1200\" height=\"900\" src=\"EvaAcumulativa.jsp\" ></iframe>\n");
      out.write("                \t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col1\" id=\"PARRAFO4\">\n");
      out.write("                            <iframe width=\"1200\" height=\"900\" src=\"EvaFormativa.jsp\" ></iframe>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col1\" id=\"PARRAFO5\"><!-- COLUMNA DE CONTENIDO -->\n");
      out.write("                            <H1> Integrantes </H1>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<P><P><P>\n");
      out.write("\n");
      out.write("        <h2>Este es un encabezado H2</h2>\n");
      out.write("    <p>Este es otro parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus.</p>\n");
      out.write("    <form id=\"form1\" class=\"form\" name=\"form1\" method=\"post\" action=\"/action\">\n");
      out.write("        <div class=\"input\">\n");
      out.write("            <label>Input:</label> <input type=\"text\" name=\"input1\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"select\">\n");
      out.write("            <label>Select:</label>\n");
      out.write("            <select name=\"select1\">\n");
      out.write("                <option>Este es un option</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"selectmultiple\">\n");
      out.write("            <label>Select multiple:</label>\n");
      out.write("            <select name=\"select1\" multiple=\"true\">\n");
      out.write("                <option>Esta es una opción 1</option>\n");
      out.write("                <option>Esta es una opción 2</option>\n");
      out.write("                <option>Esta es una opción 3</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"textarea\">\n");
      out.write("            <label>Text area:</label>\n");
      out.write("            <textarea cols=\"30\" rows=\"5\">Este es un text area</textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"submit\"><input type=\"submit\" value=\"Este es un submit\" /></div>\n");
      out.write("    </form>\n");
      out.write("    <div class=\"cuadro cuadromarg\">\n");
      out.write("\t<div class=\"theader\">Cuadro 3 con formulario</div>\n");
      out.write("\t<div class=\"cuadcont\">\n");
      out.write("            <form id=\"form2\" class=\"form\" name=\"form2\" method=\"post\" action=\"/action2\">\n");
      out.write("        <div class=\"input\">\n");
      out.write("            <label>Input:</label> <input type=\"text\" name=\"input1\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"select\">\n");
      out.write("            <label>Select:</label>\n");
      out.write("            <select name=\"select1\">\n");
      out.write("                <option>Este es un option</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"selectmultiple\">\n");
      out.write("            <label>Select multiple:</label>\n");
      out.write("            <select name=\"select1\" multiple=\"true\">\n");
      out.write("                <option>Esta es una opción 1</option>\n");
      out.write("                <option>Esta es una opción 2</option>\n");
      out.write("                <option>Esta es una opción 3</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"textarea\">\n");
      out.write("            <label>Text area:</label>\n");
      out.write("            <textarea cols=\"30\" rows=\"5\">Este es un text area</textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"submit\"><input type=\"submit\" value=\"Este es un submit\" /></div>\n");
      out.write("    </form>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("   </div><!-- Contenido -->\n");
      out.write("   <div id=\"menur\"><!-- Menu derecho -->\n");
      out.write("   <div class=\"cuadro\">\n");
      out.write("\t<div class=\"theader\">Cuadro 2</div>\n");
      out.write("\t<div class=\"cuadcont\">\n");
      out.write("            <p>Info de cuadro 2</p>\n");
      out.write("            <ul>\n");
      out.write("\t\t<li>Lista 1</li>\n");
      out.write("                <li>Lista 2</li>\n");
      out.write("                <li><a href=\"#\">Este es un link</a></li>\n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("   </div><!-- Menu derecho -->\n");
      out.write("   <div id=\"footerbox\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\"><!-- Pie de página -->\n");
      out.write("    <hr>\n");
      out.write("    <p>&copy; 2010 <a href=\"#\">ISEI UPA</a> -  <a href=\"#\">SIEC</a></p>\n");
      out.write("</div><!-- Pie de página -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
