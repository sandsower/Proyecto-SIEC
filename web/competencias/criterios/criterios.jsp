<%--
    Document   : systemIndex
    Created on : 25/09/2010, 05:13:48 PM
    Author     : lugubrenator
--%>

<%@page import="clases.Competencias.Criterios"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
   

       <h1>Lista de Criterios</h1>
            <table>
                   <thead>
                        <tr>
                                        <th width="100">Nombre </th>
                                        <th width="100">Descripcion</th>
                                        <th width="100">Ponderacion</th>
                                        <th width="100" alt="Eliminar">Eliminar</th>
                                        <th width="100" alt="modificar">Modificar</th>
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
                                             out.print("<td><a href='eliminarCriterio?id="+i.getId()+"' onClick='javascript: if(confirm('¿Esta seguro que desa borrar el registro?')){ return true; } else { return false;}'><img src='../../images/delete.png'/></a></td>");
                                             out.print("<td><a href='modificarCriterio?id="+i.getId()+"'><img src='../../images/page_edit.png'/></a></td>");
                                        }

                                        %>
                                       </tr>
                                    </tbody>
                                </table>

   
   <div id="menur"><!-- Menu derecho -->
   <div class="cuadro">
	<div class="theader">Cuadro 2</div>
	<div class="cuadcont">
            <p>Info de cuadro 2</p>
            <ul>
		<li><a href="../obtenerCompetencias">Competencias</a>
                    <ul>
                        <li><a href="../crearCompetencia">Crear Competencia</a></li>
                    </ul>
                </li>
                <li><a href="criterios.jsp">Criterios</a>
                    <ul>
                        <li><a href="crear.jsp">Crear Criterio</a></li>
                    </ul>
                </li>
            </ul>
	</div>
    </div>
   </div><!-- Menu derecho -->
   