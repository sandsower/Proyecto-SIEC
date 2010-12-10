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
<h1>Crear Criterio</h1>
<form  method="post" action="competencias/criterios/crearCriterio" id="formItem">
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
            <td>Ponderacion</td>
            <td><input type="text" name="ponderacion"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Crear"/></td>
        </tr>
    </table>
</form>

