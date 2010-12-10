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
            $.get(this.action, $("#formItem").serialize(), function(data){
                $("#mitte").html(data);
            });
            //$("#mitte").load(this.action);
        });
    });
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Por favor selecciona la materia a evaluar:</h1>
<form action="Evaluaciones/Coevaluacion/llenarCompetencias.do" method="GET" class="formItem" id="formItem">
    <select name="ID">
        <c:forEach items="${Materias}" var="materia">
            <option value="${materia.materias_ID}">${materia.des_Materias}</option>
        </c:forEach>
    </select>
    <input type="image" src="images/botones/siguiente.gif"/>
</form>