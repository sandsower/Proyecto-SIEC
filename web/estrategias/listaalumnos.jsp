<%--
    Document   : index
    Created on : Oct 6, 2010, 8:42:22 AM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clasesUsuarios.*" %>
<%@page import="java.util.*" %>
<%
      HttpSession objSesion = request.getSession(true);
      Usuarios usuario = (Usuarios)objSesion.getAttribute("user");
      List<Alumno> alumnos = (List<Alumno>)request.getAttribute("alumnos");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Estrategias, lista de Alumnos</title>
<link rel="stylesheet" type="text/css" href="css/siec.css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/siec.js"></script>
</head>
<body>
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
	<div class="cuadro">
	<div class="theader">Navegación</div>
	<div class="cuadcont">
            <ul>
                <li><a href="systemIndex.jsp">Inicio de Sistema</a></li>
            </ul>
	</div>
        </div>
    </div>
   </div><!-- Menu izquierdo -->
   <div id="mitte"><!-- Contenido -->
        <h2>Lista de Alumnos</h2>
        <p>Asigna la estrategia por alumno o de forma grupal. Preciona click en el alumno para asignar.</p>  
                <%
                for(Alumno i: alumnos)
                {
                    Usuarios utem = new Usuarios();
                    utem = utem.obtenerUsuario(i.getUsuario_id());
                %>

                    <div class="cuadro cuadromarg">
                        <div class="theader cpointer einf" id="einf<%= i.getIdAlumno() %>"><%= i.getMatricula() %> : <%= utem.toString() %></div>
                        <div class="cuadcont hidden einf<%= i.getIdAlumno() %>c">
                        <div class="infoeal">
                            <div class="fl avataral">
                                <img class="imgal" alt="<%= utem.getNombre() %>"  src="images/avatares/<%= utem.getImg() %>" height="100px" width="100px" >
                            </div>
                            <div class="fl infoal">
                                <ul>
                                    <li class="grayrow"><span class="lile">Matricula:</span> <%= i.getMatricula() %></li>
                                    <li><span class="lile">Carrera:</span> <%= i.getCarrera() %></li>
                                    <li class="grayrow"><span class="lile">Nombre:</span> <%= utem.getNombre() %></li>
                                    <li><span class="lile">Apellido Paterno:</span> <%= utem.getAppaterno() %></li>
                                    <li class="grayrow"><span class="lile">Apellido Materno:</span> <%= utem.getApmaterno() %></li>
                                </ul>
                            </div>
                            <p  class="cl"></p>
                        </div>
                        <p>Agregar Estrategia al Alumno</p>
                    
                    <form name="form<%= i.getIdAlumno() %>" class="form" action="estrategias/EstrategiaServ" method="post">
                        <div class="textarea"><textarea name = "mensaje" rows="10"  cols="50"></textarea></div>
                        <input type="hidden" name="ida" value="<%= i.getIdAlumno() %>">
                        <input type="hidden" name="button" value="1">
                        <div class="submit"><input type="submit" value="Guardar Estrategia Individual" /></div>
                    </form>
                       </div>
                   </div>

               <%
                }
               %>
              
             <h2>Agregar una Estrategia Grupal</h2>
             <div class="cuadro cuadromarg">
                        <div class="cuadcont">
                            <form name="formg" class="form" action="estrategias/EstrategiaServ" method="post">
                                <div class="textarea"><textarea  class="input"  id="mensaje"  name ="mensaje" rows="10"  cols="50"></textarea></div>
                                <input type="hidden" name="button" value="0" />
                                <div class="submit"><input type='submit' value="Guardar Estrategia Grupal" /></div>
                           </form>
                        </div>
             </div>

			</div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Navegación Estrategias</div>
	<div class="cuadcont">
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