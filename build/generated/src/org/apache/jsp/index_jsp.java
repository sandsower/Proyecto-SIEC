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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\" lang=\"es\">\n");
      out.write("<head profile=\"http://gmpg.org/xfn/11\">\n");
      out.write("\n");
      out.write("    <SCRIPT type=\"text/JavaScript\" src=\"Scripts/jquery.js\"> </SCRIPT>\n");
      out.write("    <SCRIPT type=\"text/JavaScript\" src=\"Scripts/Eventos.js\"> </SCRIPT>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\"  content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("\t<title>Tema 1, SIEC</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/siec.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <SCRIPT type= \"text/JavaScript\" src= \"Scripts/jquery.js\"> </SCRIPT>\n");
      out.write("\t<SCRIPT type= \"text/JavaScript\" src= \"Scripts/acciones.js\"> </SCRIPT>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/default.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"header\"><!-- Header -->\n");
      out.write("\t<div id=\"desktopHeader\">\n");
      out.write("\t\t<div id=\"desktopTitlebarWrapper\">\n");
      out.write("\t\t\t<div id=\"desktopTitlebar\">\n");
      out.write("\t\t\t\t<span class=\"hidden\"><h1>SIEC</h1></span>\n");
      out.write("\t\t\t\t<div class=\"fr topbar\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Desconectarse</a></li>\n");
      out.write("\t\t\t\t\t\t<li>Bienvenido <span class=\"nameuser\">anonimo</span>.</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div><!-- Header -->\n");
      out.write("<div id=\"menutop\"><!-- Menu Top -->\n");
      out.write("\t<p class=\"fixl\"></p>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a id=\"Opcion1\">AutoEvaluacion</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion2\">CoEvaluacion</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion3\">EvaluacionAcumulativa</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion4\">EvaluacionFormativa</a></li>\n");
      out.write("\t\t<li><a id=\"Opcion5\">Integrantes</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<p class=\"fixl\"></p>\n");
      out.write("</div><!-- Menu Top -->\n");
      out.write("<div class=\"colmask threecol\">\n");
      out.write("\t<div class=\"colmid\">\n");
      out.write("\t\t<div class=\"colleft\">\n");
      out.write("\t\t\t<div class=\"col2\"><!-- Columna Izquierda-->\n");
      out.write("\t\t\t\t<div class=\"fl\">\n");
      out.write("\t\t\t\t\t<div class=\"cuadro\">\n");
      out.write("\t\t\t\t\t\t<div class=\"theader\"><h2>Cuadro 1</h2></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"cuadcont\">\n");
      out.write("\t\t\t\t\t\t\tInfo de cuadro 1\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cuadro\">\n");
      out.write("\t\t\t\t\t\t<div class=\"theader\"><h2>Cuadro 2</h2></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"cuadcont\">\n");
      out.write("\t\t\t\t\t\t\tInfo de cuadro 2\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"columnHandle\"></div>\n");
      out.write("\t\t\t</div><!-- Columna Izquierda-->\n");
      out.write("\t\t\t<div class=\"col3\"><!-- Columna Derecha -->\n");
      out.write("\t\t\t<div class=\"columnHandle\"><div id=\"sideColumn1_handle_icon\" class=\"handleIcon\"></div></div>\n");
      out.write("\t\t\t\t<div class=\"cuadror\">\n");
      out.write("\t\t\t\t\t\t<div class=\"theader\"><h2>Cuadro 1, derecha</h2></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"cuadcont\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li>Lista 1</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>Lista 2</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>Lista 3</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cuadror\">\n");
      out.write("\t\t\t\t\t\t<div class=\"theader\"><h2>Cuadro 2, derecha</h2></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"cuadcont\">\n");
      out.write("\t\t\t\t\t\t\tInfo de cuadro 2\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div><!-- Columna Derecha -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<div id=\"desktopFooter\">\n");
      out.write("\t\t\t&copy; 2010 <a href=\"#\">ISEI UPA</a> -  <a href=\"#\">SIEC</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
