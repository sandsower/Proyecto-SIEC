<%-- 
    Document   : BienvenidoCE
    Created on : Nov 1, 2010, 7:21:12 PM
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
<h1>Bienvenido al modulo de CoEvaluacion</h1>
Sigue las instrucciones que apareceran en las siguientes paginas para completar el registro de la autoevaluacion.
<form action="Evaluaciones/Coevaluacion/llenarMaterias.do" method="GET"  class="formItem" id="formItem">
    <input type="hidden" value="7" name="ID"/>
    <input type="image" src="images/botones/siguiente.gif"/>
</form>