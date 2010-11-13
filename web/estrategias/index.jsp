<%--
    Document   : index
    Created on : Oct 6, 2010, 8:42:22 AM
    Author     : Esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, clasesUsuarios.*, clasesEstrategias.*" %>
<%
       HttpSession objSesion = request.getSession(true);
       Usuarios usuario = (Usuarios)objSesion.getAttribute("user");

        Maestro miMaestro = new Maestro();
        miMaestro = miMaestro.ObtenerMaestro(usuario.getId());
        Materia miMateria = new Materia();

        List<Materia> misMaterias = miMateria.ObtenerMaterias(miMaestro.getIdMaestro());

        session.removeAttribute("idg");
        session.removeAttribute("idm");
        session.removeAttribute("alumnos");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Registro de estrategias</title>
<link rel="stylesheet" type="text/css" href="../css/siec.css" media="all">
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../js/siec.js"></script>
         <script type="text/javascript">
           function change(){
                document.getElementById('grupos').innerHTML ="<option value = null >Grupos</option>";

          <%
               out.print("id_materia = document.form1.materias.value;");
               for(int i=0; i< misMaterias.size(); i++)
               {
                   List<Grupo> grupos = misMaterias.get(i).getGrupos();
                   for(int j=0; j< grupos.size(); j++)
                    {

                        out.print(" if( id_materia == "+misMaterias.get(i).getId_materia()+" ) ");
                        out.print("{");
                        out.print("document.getElementById('grupos').innerHTML+= ");
                        out.print(" '<option");
                        out.print(" id="+grupos.get(j).getId_grupo()+" value = "+grupos.get(i).getId_grupo()+" ");
                        out.print(">"+grupos.get(j).getNumero()+" "+grupos.get(i).getLetra()+"</option>'; ");
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
                <li><a href="../systemIndex.jsp">Inicio de Sistema</a></li>
            </ul>
	</div>
    </div>
   </div><!-- Menu izquierdo -->
   <div id="mitte"><!-- Contenido -->
       <p>
        <%
            /*
            out.println("getServletContext().getRealPath(/)");
            out.println("<br/>");
            out.println(getServletContext().getRealPath("/"));
            out.println("<br/>");
            out.println("<br/>");

            out.println("request.getPathInfo())");
            out.println("<br/>");
            out.println(request.getPathInfo());
            out.println("<br/>");
            out.println("<br/>");

            out.println("request.getPathTranslated()");
            out.println("<br/>");
            out.println(request.getPathTranslated());
            out.println("<br/>");
            out.println("<br/>");

            out.println("request.getServletPath()");
            out.println("<br/>");
            out.println(request.getServletPath());
            out.println("<br/>");
            out.println("<br/>");
            */

        %>
       </p>
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
            <form name="form1" class="form" action="../AlumnosServ" method="post">
                <div class="select">
                    <label>Seleccione la Asignatura</label>
                        <select id="materias" name="materias" onchange="change()" >
                             <option value = null >Asignaturas</option>
                            <%
                                    for(int i=0; i< misMaterias.size(); i++)
                                    {
                                       StringBuilder op1 = new StringBuilder();
                                            op1.append("<option id ='"+misMaterias.get(i).getId_materia()+"'");
                                            op1.append(" value = '"+misMaterias.get(i).getId_materia()+"' ");
                                            op1.append( "name = '"+misMaterias.get(i).getId_materia()+"'>");
                                            op1.append(""+misMaterias.get(i).getNombre()+"</option>");
                                        out.print(op1);
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