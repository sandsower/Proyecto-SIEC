
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clasesUsuarios.*, clasesEstrategias.*" %>
<%@page import="java.util.*" %>
<%
        HttpSession objSesion = request.getSession(true);
        Usuarios usuario = (Usuarios)objSesion.getAttribute("user");
        Maestro miMaestro = new Maestro();
        miMaestro = miMaestro.ObtenerMaestro(usuario.getId());
        int idg = Integer.parseInt(session.getAttribute("idg").toString());
        int idm = Integer.parseInt(session.getAttribute("idm").toString());
        Estrategia estr = new Estrategia();
        List<Estrategia> est = estr.ObtenerEstrategias(idg, idm, miMaestro.getIdMaestro());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Nombre de la Página</title>
<link rel="stylesheet" type="text/css" href="../css/siec.css" media="all">
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../js/siec.js"></script>

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
                                                <li>Bienvenido <span class="nameuser"><%= usuario.toString() %></span></li>
					</ul>
				</div>
			</div>
           <div id="mprincipal">
              <ul>
		<%
                usuario.setPerfil(Integer.parseInt(objSesion.getAttribute("perfil").toString()));
                    String [][] menu = usuario.getMenu();
                    for(int i = 0; i< menu.length; i++) { %>
                <li><a href="<%=menu[i][1]%>" class="<%=menu[i][2]%>"><%=menu[i][0]%></a></li>
                <% } %>
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
                <li><a href="systemIndex.jsp">Inicio de Sistema</a></li>
            </ul>
	</div>
    </div>
   </div><!-- Menu izquierdo -->
   <div id="mitte"><!-- Contenido -->
                            <div class ="content">
        <div class="box">
        <h1 align="center">Lista de Estrategias Grupales</h1><br/>
        </div>
            <div>
                <table>
                    <tr>
                        <th>Estrategia</th>
                        <th>Fecha</th>
                    </tr>
                <%
                for(Estrategia i: est)
                {
                    out.print("<tr>");
                    out.print("<td>"+i.getMensaje()+"</td>");
                    out.print("<td>"+i.getFecha()+"</td>");
                    out.print("</tr>");
                }
                    %>
                </table>
            </div>
                <a href="listaalumnos.jsp">regresar</a>
      </div>

			</div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
            <ul>
                <li><a href="Estrategias.jsp">Ver Estrategias al Grupo</a></li>
                <li><a href="EstrategiasAlumnos.jsp">Ver Estrategias de los alumnos</a></li>
                <li><a href="estrategias/estrategiasalumnos.jsp">Estrategias de Alumnos</a></li>
                <li><a href="estrategias/estrategias.jsp">Estrategias</a></li>
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