<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" >
    $("document").ready(function(){
        $(".linkItem").click(function(e){
            e.preventDefault();
            $("#mitte").load(this.href);
        });
    });
</script>
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
                                        <c:forEach items="${Competencias}" var="Competencias">
                                        <tr>
                                            <td><input type="checkbox" disabled/></td>
                                            <td>${Competencias.nombre}</td>
                                            <td>${Competencias.descripcion}</td>
                                            <td>${Competencias.idCategoria}</td>
                                            <td><a href="competencias/eliminarCompetencia?id=${Competencias.idCompetencia}" class="linkItem"><img src="images/delete.png" alt="Borrar competencia"/></td>
                                            <td><a href="competencias/modificarCompetencia?idCompetencia=${Competencias.idCompetencia}" class="linkItem"><img src="images/page_edit.png" alt="Modificar Competencia"/></td>
                                            <td><a href="competencias/agregarCriterios?idCompetencia=${Competencias.idCompetencia}&nombre=${Competencias.nombre}" class="linkItem"><img src="images/add.png" alt="Agregar Criterios"/></td>
                                            </tr>
                                        </c:forEach>
                                       </tr>
                                    </tbody>
                                </table>


   </div><!-- Contenido -->
