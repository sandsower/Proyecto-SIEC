<%--
    Document   : systemIndex
    Created on : 25/09/2010, 05:13:48 PM
    Author     : lugubrenator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.TrUsuario" %>
<%
      HttpSession objSesion = request.getSession(true);
      TrUsuario usuario = null;
       if(objSesion.getAttribute("usuario") == null){
           response.sendRedirect("index.jsp");
           objSesion.setAttribute("usuario", null);
       } else

      usuario = (TrUsuario)objSesion.getAttribute("usuario");
%>
<%@page import="clases.Tl_Menu" %>
<%@page import="MovimientosBD.ObtenerConjunto" %>
<%
ObtenerConjunto obco = null;
ArrayList per = new ArrayList();
try {
    obco = new ObtenerConjunto();
    per = obco.obtenerMenu(usuario.getPerfil_ID());
    }catch(NullPointerException e){
        out.print("error, no hay menú disponible");
    }
//out.print(obco.obtenerMenu(usuario.getPerfil_ID()));
request.setAttribute("per", per);
//out.print(request.getAttribute("per"));
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Registro de estrategias</title>
<link rel="stylesheet" type="text/css" href="css/siec.css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/siec.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
</head>
<body>
<div id="top"><a name="top"></a></div>

<div id="wrapper">
   <div id="header">

       <div id="desktopTitlebarWrapper">
			<div id="desktopTitlebar">
				<h1 class="hidden">SIEC</h1>
				<div class="fr topbar">
					<ul>
						<li><a href="logout.jsp">Desconectarse</a></li>
                                                <li>Bienvenido <span class="nameuser"><%= usuario.getNombres() + " " + usuario.getApellidoPat() %></span></li>
					</ul>
				</div>
			</div>
           <div id="mprincipal">
            <ul>
                    <c:forEach items="${per}" var="menu">
                        <li><a class="${menu.img} menuItem" href="${menu.url}">${menu.menu}</a></li>
                    </c:forEach>
            </ul>
	</div>
           <div id="mtopctrl">
              <ul>
                  <li><a id="btnhidecols" class="btnhidecolsnp" href="#">Ocultar Columnas</a></li>
             </ul>
           </div>
	</div>
   </div>

    <div id="menul"><!-- Menu izquierdo -->
    <div class="cuadro">
	<div class="theader">Navegación</div>
	<div class="cuadcont">
            <ul>
                <li><a href="./systemIndex.jsp">Inicio de Sistema</a></li>
            </ul>
	</div>
    </div>
   </div><!-- Menu izquierdo -->
   <div id="mitte"><!-- Contenido -->

       <h1>Este es un encabezado H1</h1>
    <p>Este es un parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus. Nunc condimentum erat a dui laoreet placerat. Quisque nisl elit, auctor id ultricies vel, molestie et sem. Cras id nibh augue, non semper diam. Fusce non odio vitae ipsum sagittis mollis. Praesent pharetra sollicitudin sollicitudin. Aliquam aliquet, urna mollis eleifend placerat, enim nisi aliquet lacus, a convallis nibh sem sed sem. Etiam et ultrices odio. Suspendisse potenti. Cras odio leo, laoreet sed vulputate ac, viverra a velit. Suspendisse vel mauris at magna sagittis faucibus. Pellentesque semper congue velit. Fusce condimentum nibh malesuada risus vestibulum sit amet aliquet velit varius. Duis eget urna enim, eget elementum magna. Sed malesuada sollicitudin malesuada.</p>
    <p>Este es otro parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus. Nunc condimentum erat a dui laoreet placerat. Quisque nisl elit, auctor id ultricies vel, molestie et sem. Cras id nibh augue, non semper diam. Fusce non odio vitae ipsum sagittis mollis. Praesent pharetra sollicitudin sollicitudin. Aliquam aliquet, urna mollis eleifend placerat, enim nisi aliquet lacus, a convallis nibh sem sed sem. Etiam et ultrices odio. Suspendisse potenti. Cras odio leo, laoreet sed vulputate ac, viverra a velit. Suspendisse vel mauris at magna sagittis faucibus. Pellentesque semper congue velit. Fusce condimentum nibh malesuada risus vestibulum sit amet aliquet velit varius. Duis eget urna enim, eget elementum magna. Sed malesuada sollicitudin malesuada. </p>

        <h2>Este es un encabezado H2</h2>
    <p>Este es otro parrafo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim porttitor scelerisque. In consequat turpis sit amet mi fermentum dapibus.</p>
    <form id="form1" class="form" name="form1" method="post" action="/action">
        <div class="input">
            <label>Input:</label> <input type="text" name="input1"/>
        </div>
        <div class="select">
            <label>Select:</label>
            <select name="select1">
                <option>Este es un option</option>
            </select>
        </div>
        <div class="selectmultiple">
            <label>Select multiple:</label>
            <select name="select1" multiple="true">
                <option>Esta es una opción 1</option>
                <option>Esta es una opción 2</option>
                <option>Esta es una opción 3</option>
            </select>
        </div>
        <div class="textarea">
            <label>Text area:</label>
            <textarea cols="30" rows="5">Este es un text area</textarea>
        </div>
        <div class="submit"><input type="submit" value="Este es un submit" /></div>
    </form>
    <div class="cuadro cuadromarg">
	<div class="theader">Cuadro 3 con formulario</div>
	<div class="cuadcont">
            <form id="form2" class="form" name="form2" method="post" action="/action2">
        <div class="input">
            <label>Input:</label> <input type="text" name="input1"/>
        </div>
        <div class="select">
            <label>Select:</label>
            <select name="select1">
                <option>Este es un option</option>
            </select>
        </div>
        <div class="selectmultiple">
            <label>Select multiple:</label>
            <select name="select1" multiple="true">
                <option>Esta es una opción 1</option>
                <option>Esta es una opción 2</option>
                <option>Esta es una opción 3</option>
            </select>
        </div>
        <div class="textarea">
            <label>Text area:</label>
            <textarea cols="30" rows="5">Este es un text area</textarea>
        </div>
        <div class="submit"><input type="submit" value="Este es un submit" /></div>
    </form>
	</div>
    </div>
   </div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
            <ul>
		<li>Lista 1</li>
                <li>Lista 2</li>
                <li><a href="#">Este es un link</a></li>
            </ul>
	</div>
    </div>
   </div><!-- Menu derecho -->
   <div id="footerbox"></div>
</div>
<div id="footer"><!-- Pie de página -->
    <hr>
    <p>&copy; 2010 <a href="#">ISEI UPA</a> -  <a href="#">SIEC</a></p>
</div><!-- Pie de página -->
</body>
</html>