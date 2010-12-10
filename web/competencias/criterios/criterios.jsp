<%@page import="clases.Competencias.Criterios"%>
<%@page import="java.util.List"%>
<script type="text/javascript" >
    $("document").ready(function(){
        $(".crit tr:odd").css('background','#ccc');
        $(".crit tr:even").css('background','#f4f5f6');
        $(".linkItem").click(function(e){
            e.preventDefault();
            $("#mitte").load(this.href);
        });
    });
</script>

       <h1>Lista de Criterios</h1>

       <center><a href="competencias/criterios/crear.jsp" class="linkItem"><img src="images/add.png"/>Crear Criterio</a></center>
            <table class="crit">
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
                                             out.print("<td><a href='competencias/criterios/eliminarCriterio?id="+i.getId()+"' class='linkItem'><img src='images/delete.png'/></a></td>");
                                             out.print("<td><a href='competencias/criterios/modificarCriterio?id="+i.getId()+"' class='linkItem'><img src='images/page_edit.png'/></a></td>");
                                             out.print("<td><a href='reportes/impresion5.jsp?idCriterio="+i.getId()+"' class='linkItem'>imprimir Criterios</a></td>");

                                             }
                                        %>
                                       </tr>
                                    </tbody>
                                </table>
