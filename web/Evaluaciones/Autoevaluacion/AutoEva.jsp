<%-- 
    Document   : AutoEva
    Created on : Nov 2, 2010, 10:09:25 PM
    Author     : sands
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>Favor de ingresar la calificacion deseada al criterio/competencia a evaluar:</h1>
<form action="Evaluaciones/Autoevaluacion/guardarEvaluacion.do" method="POST" id="formItem">
    Criterio:${Criterio.des_Criterio}<br/>
    <select name="seleccionNivel">
        <c:forEach items="${Niveles}" var="nivel">
            <option value="${nivel.evaluacion_Nivel_ID}">${nivel.des_Evaluacion}</option>
        </c:forEach>
    </select>
    <input type="hidden" name="idEvaluacion" value="${Evaluacion.evaluacion_parcial_ID}"/>
    <input type="image" src="images/botones/siguiente.gif"/>
</form>
