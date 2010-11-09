<%-- 
    Document   : SeleccionarCompetencia
    Created on : Nov 1, 2010, 11:59:09 PM
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
<h1>Favor de seleccionar la competencia y el alumno a evaluar:</h1>
<form action="Evaluaciones/Coevaluacion/crearCE.do" method="POST" class="formItem" id="formItem">
    <select name="IDEvaluacion">
        <c:forEach items="${Competencias}" var="competencia">
            <option value="${competencia.competencia_ID}">${competencia.des_Competencia}</option>
        </c:forEach>
    </select>
    <select name="IDAlumno">
        <c:forEach items="${Alumnos}" var="alumno">
            <option value="${alumno.alumnos_ID}">${alumno.matricula}</option>
        </c:forEach>
    </select>
    <input type="image" src="images/botones/siguiente.gif"/>
</form>