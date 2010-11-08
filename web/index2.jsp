<%
       HttpSession objSesion = request.getSession(true);
       if(objSesion.getAttribute("usuario") != null)
       {
           response.sendRedirect("systemIndex.jsp");
       }else{
           objSesion.setAttribute("usuario", null);
           //response.sendRedirect("index.jsp");
       }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Nombre de la Página</title>
<link rel="stylesheet" type="text/css" href="css/siec.css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/siec.js"></script>
<SCRIPT type="text/JavaScript" src="js/Eventos.js"> </SCRIPT>

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
                                                <li>Bienvenido <span class="nameuser"> Usuario </span></li>
					</ul>
				</div>
			</div>
           <div id="mprincipal">
              <ul>
		<li><a id="Opcion1">AutoEvaluacion</a></li>
		<li><a id="Opcion2">CoEvaluacion</a></li>
		<li><a id="Opcion3">EvaluacionAcumulativa</a></li>
		<li><a id="Opcion4">EvaluacionFormativa</a></li>
		<li><a id="Opcion5">Integrantes</a></li>
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
                        <div class="col1" id="PARRAFO1" width="200" height="200">
                            <iframe id="PARRAFO1" width="1200" height="900" src="Evaluaciones/Autoevaluacion/BienvenidoAE.jsp" align="left"></iframe>
                        </div>
                        <div class="col1" id="PARRAFO2">
                            <iframe width="1200" height="900" src="Evaluaciones/CoEva.jsp" ></iframe>
                	</div>
                        <div class="col1" id="PARRAFO3">
                            <iframe width="1200" height="900" src="Evaluaciones/EvaAcumulativa.jsp" ></iframe>
                	</div>
			<div class="col1" id="PARRAFO4">
                            <iframe width="1200" height="900" src="Evaluaciones/EvaFormativa.jsp" ></iframe>
                        </div>
                        <div class="col1" id="PARRAFO5"><!-- COLUMNA DE CONTENIDO -->
                            <H1> Integrantes </H1>
                        </div>


<P><P><P>
<!--
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
   </div>--><!-- Contenido -->
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