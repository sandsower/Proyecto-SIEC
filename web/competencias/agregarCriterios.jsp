<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" >
    $("document").ready(function(){
        $(".linkItem").click(function(e){
            e.preventDefault();
            $("#mitte").load(this.href);
        });
    });
</script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Agregar Criterio a la competencia <br/><br/><u><% out.println(request.getParameter("nombre"));%></u></h1>

<form method="post" id="formItem">
    <br/>
    <table>
        <tr>Buscar<input type="text" name="nombre"/>&nbsp;</tr>
        <tr><input type="image" src="images/search2.gif"/></tr>
    </table>
</form>
<br/><br/>

<table>
    <thead>
        <tr>
            <th width="100">Nombre </th>
            <th width="100">Descripcion</th>
            <th width="100">Ponderacion</th>
            <th width="100" alt="Agregar">Agregar a la competencia</th>
        </tr>
    </thead>
    <tbody align="center">
        <tr>
            <c:forEach items="${Criterios}" var="Criterios">
            <tr>
                <td>${Criterios.nombre}</td>
                <td>${Criterios.descripcion}</td>
                <td>${Criterios.ponderacion}</td>
                <td><a href="competencias/crearCriterioCompetencia?idCriterio=${Criterios.id}&idCompetencia=${idCompetencia}&nombre=${nombre}" class="linkItem"><img src="images/add.png" alt="Agregar Criterio"/></a></td>

            </tr>
        </c:forEach>

        </tr>
    </tbody>
</table>





<div class="cuadro">
    <div class="theader">Criterios Seleccionados</div>
    <div class="cuadcont">
        <ul>
            <c:forEach items="${CriterioCompetencia}" var="CriterioCompetencia">
                <li>${CriterioCompetencia.idCriterio}&nbsp;
                    <a href="competencias/eliminarCriterioCompetencia?idCriterio=${CriterioCompetencia.idCriterio}&idCompetencia=${idCompetencia}&nombre=${nombre}" class="linkItem"><img src="images/delete.png"/></a>
                    </c:forEach>
        </ul>
    </div>
</div>
