<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<h1>Crear Competencia</h1>
<form  method="post" action="competencias/crearCompetencia" id="formItem">
    <table>
        <tr>
            <td>Nombre:</td>
            <td><input type="text" name="nombre"/></td>
        </tr>
        <tr>
            <td>Descripcion</td>
            <td><textarea cols="20" rows="4" name="descripcion"></textarea></td>
        </tr>
        <tr>
            <td>Categoria</td>
            <td><select name="categoria">
                    <c:forEach items="${Categorias}" var="Categorias">
                        <option value="${Categorias.idCategoria}">${Categorias.nombre}</option>
                    </c:forEach>
                </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Crear"/></td>
        </tr>
    </table>


</form>