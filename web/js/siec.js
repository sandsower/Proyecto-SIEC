$(function(){ // Función que se ejecuta al cargarse todos los elementos de una Página
    formfocus();
    //Columnas laterales
    $("#btnhidecols").bind("click",function(){
        if($(this).is('.btnhidecolsp')){
            $(this).removeClass("btnhidecolsp").addClass("btnhidecolsnp").html("Ocultar Columnas");
            $("#menur").css({"display":"block"});
            $("#wrapper").css({"marginLeft":"200px","marginBottom":"-41px","marginRight":"200px"});
            $("#header").css({"marginLeft":"-202px","marginRight":"-202px"});  
        }else{
            $(this).removeClass("btnhidecolsnp").addClass("btnhidecolsp").html("Mostrar Columnas");
            $("#menur").css({"display":"none"});
            $("#wrapper").css({"margin":"0"});
            $("#header").css({"margin":"0"});   
        }
      return 0;
    });
}); // Funcion que se ejecuta al cargarse todos los elementos de una Página

/*                      */
/* Funciones JavasScript*/
/*                      */

//Enfoca Usuario en el formulario
function formfocus(){
    $('#user_login').val("").focus();
}
