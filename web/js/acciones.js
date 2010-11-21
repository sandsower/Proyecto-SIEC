var D= $(document);
D.ready(iniciar);

function iniciar()
{        
        $("#Comp_1_Boton").click(function(){
            $("#Comp_1_Area").toggle("slow");
        });

        $("#Comp_2_Boton").click(function(){
            $("#Comp_2_Area").toggle("slow");
        });

        $("#Comp_3_Boton").click(function(){
            $("#Comp_3_Area").toggle("slow");
        });

        $("#Guardar_1").click(function(){
            $("#Comp_1_Area").hide("slow",function(){
                $("#Status_1").text("Evaluacion Completa").removeClass().addClass("complete");
            });
        });

        $("#Guardar_2").click(function(){
            $("#Comp_2_Area").hide("slow",function(){
                $("#Status_2").text("Evaluacion Completa").removeClass().addClass("complete");
            });
        });

        $("#Guardar_3").click(function(){
            $("#Comp_3_Area").slideUp("slow",function(){
                $("#Status_3").text("Evaluacion Completa").removeClass().addClass("complete");
            });
        });
}
