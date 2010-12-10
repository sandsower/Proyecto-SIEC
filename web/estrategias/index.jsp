<%--
    Document   : index
    Created on : Oct 6, 2010, 8:42:22 AM
    Author     : Esteban
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.*,MovimientosBD.*" %>

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
           ArrayList<CarreraGrupo> car = new ArrayList<CarreraGrupo>();
           car = getGroup.getCarrerasGruposByIdMaestro(miMaestro.getMaestro_ID());


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
              id_carrera = document.form1.carreras.value;
            <%
                         for(CarreraGrupo i: car)
                         {
                           
                                ArrayList<TcGrupo> gr = getGroup.obtenerGruposByIDCarrera(i.getCarrera_ID());
                                for(TcGrupo j: gr)
                                {
                                    out.print(" if( id_carrera == "+i.getCarrera_ID()+" ) ");
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
          function change2()
          {
              document.getElementById('materias').innerHTML ="<option value = null >Materias</option>";
              id_carrera = document.form1.carreras.value;
              id_grupo = document.form1.grupos.value;
              var grupos = new Array();
              <%
              for(CarreraGrupo i: car)
              {
                    ArrayList<TcGrupo> gr = getGroup.obtenerGruposByIDCarrera(i.getCarrera_ID());
                    for(int j = 0; j < gr.size(); j++)
                    {
                        out.print(" if( id_carrera == "+i.getCarrera_ID()+" ) ");
                        out.print("{");
                        ArrayList<TcMaterias> ms = getGroup.obtenerMateriasbyIDGrupo(gr.get(j).getGrupo_ID());
                        for(int k = 0; k < ms.size(); k++)
                        {
                            out.print(" if( id_grupo == "+gr.get(j).getGrupo_ID()+" ) ");
                            out.print("{");

                                    out.print("document.getElementById('materias').innerHTML+= ");
                                    out.print(" '<option");
                                    out.print(" id="+ms.get(k).getMaterias_ID()+" value = "+ms.get(k).getMaterias_ID()+" ");
                                    out.print(">"+ms.get(k).getDes_Materias()+"</option>'; ");

                            out.print("}");
                        }
                        out.print("}");
                    }
              }
             
              %>
          }
        </script>

</head>
<body>
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
            <form name="form1" class="form" action="estrategias/alumnoserv.do" method="post">
                <div class="select">
                    <label>Seleccione la Carrera</label>
                    <select id="carreras" name="carrera" onchange="change()">
                             <option value = null >Carreras</option>
                             <%
                                 for(CarreraGrupo i: car)
                                 {
                                    out.print("<option value = '");
                                    out.print(i.getCarrera_ID());
                                    out.print("' >");
                                    out.print(i.getDes_Carrera());
                                    out.print("</option>");
                                 }
                             %>
                        </select>

                </div>
                <div class="selectmultiple">
                        <label>Seleccione el Grupo</label>
                        <select   name="grupos" id="grupos" onchange="change2()" >
                             <option value = null >Grupos</option>
                        </select>
                </div>
                <div class="selectmultiple">
                        <label>Seleccione la Materia</label>
                        <select multiple  name="materias" id="materias">
                             <option value = null >Materias</option>
                        </select>
                </div>
            <div class="submit"><input type="submit" value="Aceptar" /></div>
           </form>
	</div>
    </div>
</body>
</html>