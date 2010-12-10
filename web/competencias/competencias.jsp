<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" >
    $("document").ready(function(){
        $(".linkItem").click(function(e){
            e.preventDefault();
            $("#mitte").load(this.href);
        });
    });
</script>
<style>
    #box{
        background-color: #0e59a1;
        -moz-border-radius:1em;
        width:200px;
}
    #box a{
        color:#FFF;
}
</style>
<div id="mitte"><!-- Contenido -->
    <div id="box"><a href="reportes/impresion.jsp?idCompetencia=0" class="linkItem">Imprimir sin criterios</a></div>
    <div id="box"><a href="reportes/impresion2.jsp?idCompetencia=0" class="linkItem">Imprimir con criterios</a></div>
    <center><a href="competencias/crearCompetencia" class="linkItem"><img src="images/add.png"/>Crear Competencia</a></center>
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
                <th>Imprimir</th>
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
                    <td><a href="reportes/impresion.jsp?idCompetencia=${Competencias.idCompetencia}" class="linkItem">Imprimir</a></td>
                </tr>
            </c:forEach>
            </tr>
        </tbody>
    </table>


</div><!-- Contenido -->