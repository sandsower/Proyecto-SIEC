<%-- 
    Document   : SeleccionProfesor
    Created on : Nov 1, 2010, 7:15:41 PM
    Author     : sands
--%>
<script type="text/javascript" >
    $("document").ready(function(){

        $("#formItem").submit(function(e){
            e.preventDefault();
            //alert(this.href);
            $.post(this.action, $("#formItem").serialize(), function(data){
                $("#mitte").html(data);
            });
            //$("#mitte").load(this.action);
        });
    });
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Por favor selecciona el grupo:</h1>
<form action="Evaluaciones/EvaluacionF/llenarCompetencias.do" method="POST" class="formItem" id="formItem">
    <select name="IDGrupo">
        <c:forEach items="${Grupos}" var="grupo">
            <option value="${grupo.grupo_ID}">${grupo.des_Grupo}${grupo.grado}</option>
        </c:forEach>
    </select>
    <input type="hidden" name="IDMaestro" value="${IDMaestro}" />
    <input type="hidden" name="IDMateria" value="${IDMateria}"/>
    <input type="image" src="images/botones/siguiente.gif"/>
</form>
