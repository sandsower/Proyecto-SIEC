<%--
    Document   : index
    Created on : Oct 6, 2010, 8:42:22 AM
    Author     : Esteban
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.TrUsuario,clases.TrMaestros,clases.TcGrupo,clases.TcMaterias,clases.TrMaestroMateriaGrupo,MovimientosBD.ObtenerIndividuo, MovimientosBD.ObtenerConjunto" %>

<%
       /* Obtiene objeto usuario de variable de sesion usuario */
       HttpSession objSesion = request.getSession(true);

      TrUsuario  usuario = null;
       if(objSesion.getAttribute("usuario") == null){
           response.sendRedirect("index.jsp");
           objSesion.setAttribute("usuario", null);
       }else
           usuario = (TrUsuario)objSesion.getAttribute("usuario");
           objSesion.removeAttribute("idm");
           objSesion.removeAttribute("idg");
           session.removeAttribute("alumnos");
       /* Crea objetos para obtener individuos o conjuntos */
           ObtenerIndividuo getIndividuo = new ObtenerIndividuo();
           ObtenerConjunto getGroup = new ObtenerConjunto();


           TrMaestros miMaestro = getIndividuo.obtenerMaestrobyUsuario_ID(usuario.getUsuario_ID()); // Obtiene Maestro
           // Obtiene una lista de MaestrosMateriasGrupos y maestros a traves de la id de maestro         
           ArrayList<TcMaterias> mat = new ArrayList<TcMaterias>();// crear lista materias
           mat = getGroup.obtenerMateriasbyIDMaestro(miMaestro.getMaestro_ID());
         

           // Obtiene menu y lo ponee en per D:
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
	<title>SIEC &bull; Registro de estrategias</title>
<link rel="stylesheet" type="text/css" href="../css/siec.css" media="all">
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../js/siec.js"></script>
<script type="text/javascript" src="../js/estrategias.js"></script>
         <script type="text/javascript">
          function change()
          {
              document.getElementById('grupos').innerHTML ="<option value = null >Grupos</option>";
           <%
                    out.print("id_materia = document.form1.materias.value;");
                                        
                       
                         for(TcMaterias i: mat)
                         {
                           
                                ArrayList<TcGrupo> gr = getGroup.obtenerGruposByIDMateria(i.getMaterias_ID());
                                for(TcGrupo j: gr)
                                {
                                    out.print(" if( id_materia == "+i.getMaterias_ID()+" ) ");
                                    out.print("{"); 
                                    out.print("document.getElementById('grupos').innerHTML+= ");
                                    out.print(" '<option");
                                    out.print(" id="+j.getGrupo_ID()+" value = "+j.getGrupo_ID()+" ");
                                    out.print(">"+j.getDes_Grupo()+" "+j.getGrado()+"</option>'; ");
                                    out.print("}");
                                }
                                 
                        }
                     
            %>
                   
          }
        </script>

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
                                                <li>Bienvenido <span class="nameuser"><%= usuario.getNombres() + " " + usuario.getApellidoPat() %></span></li>
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
	<div class="theader">Navegación</div>
	<div class="cuadcont">
            <ul>
                <li><a href="../systemIndex.jsp">Inicio de Sistema</a></li>
            </ul>
	</div>
    </div>
   </div><!-- Menu izquierdo -->
 <div id="mitte"><!-- Contenido --> 
        <h1>Registro de Estrategias</h1>
        <p>Las estrategias son asdf...que se son asignadas de manera individual o grupal...Seleccione primero la materia, y posteriormente el grupo para asignar dicha estrategia.</p>

             <% //Imprime mensaje de error en caso de que el usuario no sea correcto
            if(request.getAttribute("message") != null)
            {
                out.print(request.getAttribute("message"));
            }else
            {

            }
        %>
        <div class="cuadro cuadromarg">
	<div class="theader">Búsqueda por Asignatura - Grupo</div>
	<div class="cuadcont">
            <form name="form1" class="form" action="alumnoserv.do" method="post">
                <div class="select">
                    <label>Seleccione la Asignatura</label>
                    <select id="materias" name="materias" onchange="change()">
                             <option value = null >Asignaturas</option>
                             <%
                             for(TcMaterias i: mat)
                             {
                                out.print("<option value = '");
                                out.print(i.getMaterias_ID());
                                out.print("' >");
                                out.print(i.getDes_Materias());
                                out.print("</option>");
                             }
                          %>
                        </select>

                </div>
                <div class="selectmultiple">
                        <label>Seleccione el Grupo</label>
                        <select  multiple  name="grupos" id="grupos">
                             <option value = null >Grupos</option>
                        </select>
                </div>
            <div class="submit"><input type="submit" value="Aceptar" /></div>
           </form>
	</div>
    </div>
            
			 </div><!-- Contenido -->
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <ul>
		<li>Lista 1</li>
                <li>Lista 2</li>
                
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