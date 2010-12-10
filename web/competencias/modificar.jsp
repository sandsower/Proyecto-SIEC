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
<h1>Modificar Competencia</h1>
<form  method="post" action="competencias/modificarCompetencia" id='formItem'>
    <table>
        <input type="hidden" name="idCompetencia" value="${Competencia.idCompetencia}"/>
        <tr>
            <td>Nombre:</td>
            <td><input type="text" name="nombre" value="${Competencia.nombre}"/></td>
        </tr>
        <tr>
            <td>Descripcion</td>
            <td><textarea cols="20" rows="4" name="descripcion">${Competencia.descripcion}</textarea></td>
        </tr>
        <tr>
            <td>Categoria</td>
            <td><select name="categoria">
                    <option value="${Competencia.idCategoria}">def: Categoria ${Competencia.idCategoria}</option>
                    <option value="1">Categoria 1</option>
                    <option value="2">Categoria 2</option>
                    <option value="3">Categoria 3</option>
                    <option value="4">Categoria 4</option>
                    <option value="5">Categoria 5</option>
                </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Modificar"/></td>
        </tr>
    </table>
</form>

