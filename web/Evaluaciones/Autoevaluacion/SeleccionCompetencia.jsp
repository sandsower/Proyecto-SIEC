<%-- 
    Document   : SeleccionarCompetencia
    Created on : Nov 1, 2010, 11:59:09 PM
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
<h1>Favor de seleccionar la competencia a evaluar:</h1>
<form action="Evaluaciones/Autoevaluacion/crearAE.do" method="POST" id="formItem">
    <select name="ID">
        <c:forEach items="${Competencias}" var="competencia">
            <option value="${competencia.competencia_ID}">${competencia.des_Competencia}</option>
        </c:forEach>
    </select>
    <input type="image" src="images/botones/siguiente.gif"/>
</form>
