var D= $(Document);
D.ready(iniciar);

	function iniciar()
	{
		var Parrafito2= $("#PARRAFO2");
			Parrafito2.hide("fast");


		var Parrafito3= $("#PARRAFO3");
			Parrafito3.hide("fast");


		var Parrafito4= $("#PARRAFO4");
			Parrafito4.hide("fast");


		var Parrafito5= $("#PARRAFO5");
			Parrafito5.hide("fast");


		var Botoncito1= $("#Opcion1");
	                Botoncito1.click(mostrar1);

                var Botoncito2= $("#Opcion2");
	                Botoncito2.click(mostrar2);

                var Botoncito3= $("#Opcion3");
	                Botoncito3.click(mostrar3);

                var Botoncito4= $("#Opcion4");
	                Botoncito4.click(mostrar4);

		var Botoncito5= $("#Opcion5");
	                Botoncito5.click(mostrar5);
	}

	function mostrar1()
	{
		var Parrafito1= $("#PARRAFO1");
			Parrafito1.show("slow");


		var Parrafito2= $("#PARRAFO2");
			Parrafito2.hide("fast");


		var Parrafito3= $("#PARRAFO3");
			Parrafito3.hide("fast");


		var Parrafito4= $("#PARRAFO4");
			Parrafito4.hide("fast");


		var Parrafito5= $("#PARRAFO5");
			Parrafito5.hide("fast");
	}

	function mostrar2()
	{
		var Parrafito1= $("#PARRAFO1");
			Parrafito1.hide("fast");


		var Parrafito2= $("#PARRAFO2");
			Parrafito2.show("slow");


		var Parrafito3= $("#PARRAFO3");
			Parrafito3.hide("fast");


		var Parrafito4= $("#PARRAFO4");
			Parrafito4.hide("fast");


		var Parrafito5= $("#PARRAFO5");
			Parrafito5.hide("fast");
	}

	function mostrar3()
	{
		var Parrafito1= $("#PARRAFO1");
			Parrafito1.hide("fast");


		var Parrafito2= $("#PARRAFO2");
			Parrafito2.hide("fast");


		var Parrafito3= $("#PARRAFO3");
			Parrafito3.show("slow");


		var Parrafito4= $("#PARRAFO4");
			Parrafito4.hide("fast");


		var Parrafito5= $("#PARRAFO5");
			Parrafito5.hide("fast");
	}
	function mostrar4()
	{
		var Parrafito1= $("#PARRAFO1");
			Parrafito1.hide("fast");


		var Parrafito2= $("#PARRAFO2");
			Parrafito2.hide("fast");


		var Parrafito3= $("#PARRAFO3");
			Parrafito3.hide("fast");


		var Parrafito4= $("#PARRAFO4");
			Parrafito4.show("slow");


		var Parrafito5= $("#PARRAFO5");
			Parrafito5.hide("fast");
	}
	function mostrar5()
	{
		var Parrafito1= $("#PARRAFO1");
			Parrafito1.hide("fast");


		var Parrafito2= $("#PARRAFO2");
			Parrafito2.hide("fast");


		var Parrafito3= $("#PARRAFO3");
			Parrafito3.hide("fast");


		var Parrafito4= $("#PARRAFO4");
			Parrafito4.hide("fast");


		var Parrafito5= $("#PARRAFO5");
			Parrafito5.show("slow");
	}

