<%@page import="clases.Competencias.Criterios"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String idCompetencia=request.getParameter("idCompetencia");
   String nombre= request.getParameter("nombre");
   
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Registro de estrategias</title>
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
                                                <li>Bienvenido <span class="nameuser">Usuario</span></li>
					</ul>
				</div>
			</div>
           <div id="mprincipal">

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
   <div id="mitte" align="center"><!-- Contenido -->

       <h1>Agregar Criterio a la competencia <br/><br/><u><% out.println(request.getParameter("nombre")); %></u></h1>

       <form method="post">
           <br/>
           <table>
               <tr>Buscar<input type="text" name="nombre"/>&nbsp;</tr>
               <tr><input type="image" src="../images/search2.gif"/></tr>
           </table>
      </form>
           <br/><br/>

           <table>
                   <thead>
                        <tr>
                          <th width="100">Nombre </th>
                          <th width="100">Descripcion</th>
                          <th width="100">Ponderacion</th>
                          <th width="100" alt="Agregar">Agregar a la competencia</th>
                          
                       </tr>
                   </thead>
                       <tbody align="center">
                                        <tr>
                                        <%
                                         Criterios cri = new Criterios();
                                         List<Criterios> criterios = cri.obtenerCriterios();
                                         for(Criterios i: criterios)
                                         {
                                             out.print("<tr>");                                             
                                             out.print("<td>"+i.getNombre()+"</td>");
                                             out.print("<td>"+i.getDescripcion()+"</td>");
                                             out.print("<td>"+i.getPonderacion()+"</td>");
                                             out.print("<td><a href='crearCriterioCompetencia?idCriterio="+i.getId()+"&idCompetencia="+idCompetencia+"&nombre="+nombre+" ' onClick='javascript: if(confirm('¿Esta seguro que desa borrar el registro?')){ return true; } else { return false;}'><img src='../images/add.png'/></a></td>");
                                             
                                        }

                                        %>
                   </tr>
              </tbody>
          </table>
                   
           
   </div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
            <ul>
		<li><a href="obtenerCompetencias">Competencias</a>
                    <ul>
                        <li><a href="crear.jsp">Crear Competencia</a></li>
                    </ul>
                </li>
                <li><a href="criterios/criterios.jsp">Criterios</a>
                    <ul>
                        <li><a href="criterios/crear.jsp">Crear Criterio</a></li>
                    </ul>
                </li>
            </ul>
	</div>
    </div>
       <div class="cuadro">
	<div class="theader">Criterios Seleccionados</div>
	<div class="cuadcont">
            <ul>
           <c:forEach items="${CriterioCompetencia}" var="CriterioCompetencia">
               <li>${CriterioCompetencia.nombre}&nbsp;
                   <a href="eliminarCriterioCompetencia?idCriterio=${CriterioCompetencia.idCriterio}&idCompetencia=${idCompetencia}&nombre=${nombre}"><img src="../images/delete.png"/></a>
                </c:forEach>
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