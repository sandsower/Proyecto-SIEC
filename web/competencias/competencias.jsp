<%@page import="java.util.List"%>
<%@page import="clases.Competencias.Competencias"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
   <div id="mitte"><!-- Contenido -->

      <h1>Lista de Competencias</h1>
      <table>
                   <thead>
                        <tr>
                                        <th width="100">Estado</th>
                                        <th width="100">Nombre </th>
                                        <th width="100">Descripcion</th>
                                        <th width="100">Categoria</th>
                                        <th width="100" alt="Eliminar">Eliminar</th>
                                        <th width="100" alt="modificar">Modificar</th>
                                        <th width="100" alt="Criterios">Criterios</th>
                       </tr>
                                    </thead>
                                    <tbody align="center">
                                        <tr>
                                        <%
                                         Competencias com = new Competencias();
                                         List<Competencias> competencia = com.obtenerCompetencias();
                                         for(Competencias i: competencia)
                                         {
                                             out.print("<tr>");
                                             out.print("<td><input type=\"checkbox\" disabled></td>");
                                             out.print("<td>"+i.getNombre()+"</td>");
                                             out.print("<td>"+i.getDescripcion()+"</td>");
                                             out.print("<td>"+i.getIdCategoria()+"</td>");
                                             out.print("<td><a href='eliminarCompetencia?id="+i.getIdCompetencia()+"' onClick='javascript: if(confirm('¿Esta seguro que desa borrar el registro?')){ return true; } else { return false;}'><img src='../images/delete.png'/></a></td>");
                                             out.print("<td><a href='modificarCompetencia?id="+i.getIdCompetencia()+"'><img src='../images/page_edit.png'/></a></td>");
                                             out.print("<td><a href='agregarCriterios?idCompetencia="+i.getIdCompetencia()+"&nombre="+i.getNombre()+"'><img src='../images/add.png'/></a></td>");
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
		<li><a href="competencias.jsp">Competencias</a>
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
   </div><!-- Menu derecho -->
   <div id="footerbox"></div>
</div>
<div id="footer"><!-- Pie de página -->
    <hr>
    <p>&copy; 2010 <a href="#">ISEI UPA</a> -  <a href="#">SIEC</a></p>
</div><!-- Pie de página -->
</body>
</html>