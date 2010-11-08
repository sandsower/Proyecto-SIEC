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
       <h1>Modificar Competencia</h1>
       <form  method="post" action="modificarCompetencia">
           <table>
               <input type="hidden" name="idCompetencia" value="${Competencia.idCompetencia}"/>
               <tr>
                   <td>Nombre:</td>
                   <td><input type="text" name="nombre" value="${Competencia.nombre}"/></td>
               </tr>
               <tr>
                   <td>Descripcion</td>
                   <td><textarea cols="20" rows="4" name="descripcion">${Competencia.descripcion}</textarea></td>
               </tr>
               <tr>
                   <td>Categoria</td>
                   <td><select name="categoria">
                           <option value="${Competencia.idCategoria}">def: Categoria ${Competencia.idCategoria}</option>
                           <option value="1">Categoria 1</option>
                           <option value="2">Categoria 2</option>
                           <option value="3">Categoria 3</option>
                           <option value="4">Categoria 4</option>
                           <option value="5">Categoria 5</option>
                       </select></td>
               </tr>
               <tr>
                   <td><input type="submit" value="Modificar"/></td>
               </tr>
           </table>


       </form>
   </div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
            <ul>
		<li><a href="obtenerCompetencias">Competencias</a>
                    <ul>
                        <li><a href="crearCompetencia">Crear Criterio</a></li>
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