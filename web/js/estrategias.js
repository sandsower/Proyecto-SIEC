$(function(){ // Función que se ejecuta al cargarse todos los elementos de una Página
    $("tr:odd").addClass("grayrow");
    //Estrategias/Alumnos
     $(".einf").bind("click",function(){
        if($(this).data("p") != true){
            $(this).data("p", true);
            $("."+$(this).attr("id")+"c").slideDown(300);
        }else{
            $(this).data("p", false);
            $("."+$(this).attr("id")+"c").slideUp(300);
        }
    });
    
   $(".edit_mensaje").editable("../saveEstrategias", {
      indicator : "Guardando...",
      type   : 'textarea',
      tooltip   : 'Doble click para editar...',
      event     : "dblclick",
      select : true,
      submit : 'Guardar',
      cancel : 'Cancelar'
  });
  $("tr:not(:first)").hover(function(){
    tr = $(this);
    tr.addClass("hover");
    $("#0d"+tr.attr("id").substring(2)).show().bind("click",function(){
        $.post("../saveEstrategias", {"id":$(this).attr("id")}, function(data){
            tr.remove();
        });
    });
  }, 
  function () {
    $(this).removeClass("hover");
    $("#0d"+$(this).attr("id").substring(2)).hide().unbind("click");
  });

}); // Funcion que se ejecuta al cargarse todos los elementos de una Página

/*                      */
/* Funciones JavasScript*/
/*                      */