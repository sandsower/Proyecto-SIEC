
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="clases.*" %>
<%@page import="MovimientosBD.*" %>
<%@page import="java.util.*" %>
<%
      HttpSession objSesion = request.getSession(true);
      TrUsuario usuario = (TrUsuario)objSesion.getAttribute("usuario");

      int idg = Integer.parseInt(session.getAttribute("idg").toString());
      int idm = Integer.parseInt(session.getAttribute("idm").toString());
      /* Crea objetos para obtener individuos o conjuntos */
      ObtenerIndividuo getIndividuo = new ObtenerIndividuo();
      ObtenerConjunto getGroup = new ObtenerConjunto();
      TrMaestros miMaestro = getIndividuo.obtenerMaestrobyUsuario_ID(usuario.getUsuario_ID()); // Obtiene Maestro
      getGroup = new ObtenerConjunto();
      ArrayList<TrEstrategiaAlumno> est = getGroup.obtenerEstrategiasAlumnos(idm, miMaestro.getMaestro_ID() , idg);
      ArrayList per = new ArrayList();
            try {
                per = getGroup.obtenerMenu(usuario.getPerfil_ID());
                }catch(NullPointerException e){
                    out.print("error, no hay menú disponible");
                }
            request.setAttribute("per", per);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Nombre de la Página</title>
<link rel="stylesheet" type="text/css" href="../css/siec.css" media="all">
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.jeditable.js"></script>
<script type="text/javascript" src="../js/siec.js"></script>
<script type="text/javascript" src="../js/estrategias.js"></script>
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
						<li><a href="../logout.jsp">Desconectarse</a></li>
                                                <li>Bienvenido <span class="nameuser"><%= usuario.getNombres()+" "+usuario.getApellidoPat() %></span></li>
					</ul>
				</div>
			</div>
           <div id="mprincipal">
              <ul>
		<c:forEach items="${per}" var="menu">
                        <li><a class="${menu.img}" href="../${menu.url}">${menu.menu}</a></li>
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
	<div class="theader">Cuadro 1</div>
	<div class="cuadcont">
            <p>Info de cuadro 1</p>
	</div>
    </div>
   </div><!-- Menu izquierdo -->
   <div id="mitte"><!-- Contenido -->
                            <div class ="content">
        <h2>Lista de Estrategias de Alumnos</h2>
        <p>Para editar la estrategia has doble click en el <strong>mensaje</strong> de la estrategia. Si deseas eliminiar has click en el icono de eliminar de su respectiva estrategia.</p>
        <div class="cuadro cuadromarg">
           <div class="cuadcont">
              <table class="tablaEstrategia">
                  <tr>
                        <th>Matricula</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th>Mensaje</th>
                        <th>Fecha</th>
                        <th>Ultima Actualizacion</th>
                    </tr>
                   
             <%
                
                for(TrEstrategiaAlumno i: est)
                {

                    TrUsuario us = getIndividuo.obtenerUsuario(i.getUsuario_id());
                    TrAlumnos al = getIndividuo.obtenerAlumnobyID(i.getAlumno_id());
                    TrEstrategias es = getIndividuo.obtenerEstrategia(i.getEstrategia_id());
                    out.print("<tr id='tr"+es.getEstrategia_ID()+"'>");
                    out.print("<td>"+al.getMatricula()+"</td>");
                    out.print("<td>"+us.getNombres()+"</td>");
                    out.print("<td>"+us.getApellidoPat()+"</td>");
                    out.print("<td>"+us.getApellidoMat()+"</td>");
                    out.print("<td><div class='edit_mensaje' id='0m"+es.getEstrategia_ID()+"'>"+es.getMensaje()+"</div></td>");
                    out.print("<td>"+es.getFecha_Inicio_Registro()+"</td>");
                    out.print("<td>"+es.getFecha_fin()+"<div class='btnnor'><div class='btndelete' id='0d"+es.getEstrategia_ID()+"'></div></div></td>");
                    out.print("</tr>");
                }
                    %>
                    </table>
           </div>
        </div>
      </div>

			</div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
           <ul>
                <li><a href="estrategias.jsp">Estrategias Grupales</a></li>
                <li><a href="estrategiasalumnos.jsp">Estrategias de los Alumnos</a></li>
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