var D= $(document);
D.ready(iniciar);

function iniciar()
{        
        $("#Alumno1").click(function(){
            $("#Evaluacion1").toggle("slow");
        });

        $("#Alumno2").click(function(){
            $("#Evaluacion2").toggle("slow");
        });

        $("#Alumno3").click(function(){
            $("#Evaluacion3").toggle("slow");
        });

        $("#Guardar_1").click(function(){
            $("#Evaluacion1").hide("slow",function(){
                $("#Status_1").text("Evaluacion Completa").removeClass().addClass("complete");
            });
        });

        $("#Guardar_2").click(function(){
            $("#Evaluacion2").hide("slow",function(){
                $("#Status_2").text("Evaluacion Completa").removeClass().addClass("complete");
            });
        });

        $("#Guardar_3").click(function(){
            $("#Evaluacion3").slideUp("slow",function(){
                $("#Status_3").text("Evaluacion Completa").removeClass().addClass("complete");
            });
        });
}
