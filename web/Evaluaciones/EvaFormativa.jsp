<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

        <SCRIPT type= "text/JavaScript" src= "js/jquery.js"> </SCRIPT>
	<SCRIPT type= "text/JavaScript" src= "js/acciones.js"> </SCRIPT>
        <link rel="stylesheet" href="Styles/default.css" type="text/css" />




    </head>
    <body >
        <h1>Evaluación Fomativa</h1>

        Seleccione el alumno a evaluar:<br/><br/>

                    <select>
                    <option id="1">GIANNINA WENDOLYNE CAJERO RODRIGUEZ</option><BR>
                    <option id="2">CARLOS JAVIER AREVALO GONZALEZ</option><BR>
                    <option id="3">LUIS GIOVANNI RAMIREZ FRANCO</option><BR>
                    </select>
                    <p>




        <table id="Tabla_Contenido" width=1100>
            <tr>
                <td>
                    <input type="button" value="Competencia #1" id="Comp_1_Boton"/>
                    <label id="Status_1" class="incomplete"> Evaluacion Incompleta </label></b><p>
                    

                        <tr>
                            <td>
                               IDENTIFICAR LAS CLASES:::::::::::::::::::::::::::::::::::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>

                               ESTABLECER LAS REGLAS DE NEGOCIOS::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>


                                DEPURAR EL PROGRAMA::::::::::::::::::::::::::::::::::::::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>

                            </td>
                        </tr>

                        <tr>
   			  <td align="left">

                            <input type="button" value="Guardar Evaluacion" id="Guardar_1" align="left"/>

                            <textarea name="comentario" rows="5" cols="20"></textarea><p>

                          </td>
                        </tr>


                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="button" value="Competencia #2" id="Comp_2_Boton"/>
                    <label id="Status_2" class="incomplete"> Evaluacion Incompleta </label></b>
                    <table  id="Comp_2_Area" class="competencia">
                        <tr>
                            <td>
                                IDENTIFICAR LAS CLASES:::::::::::::::::::::::::::::::::::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>

                               ESTABLECER LAS REGLAS DE NEGOCIOS::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>


                                DEPURAR EL PROGRAMA::::::::::::::::::::::::::::::::::::::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>
                            </td>

                        </tr>
                         <tr>
   			  <td align="left">

                           <p> <input type="button" value="Guardar Evaluacion" id="Guardar_2"/>

                               <textarea name="comentario" rows="5" cols="20"></textarea><p>

		          </td>
			</tr>



                    </table>
                </td>
            </tr>
            <tr>
                <td>
                     <td align="center" colspan="3"> <input type="button" value="Competencia #3" id="Comp_3_Boton"/>
                     <label id="Status_3" class="incomplete"> Evaluacion Incompleta </label></b>
                     <table width="1000" id="Comp_3_Area" class="competencia">
                        <tr>
                            <td>
                                 IDENTIFICAR LAS CLASES:::::::::::::::::::::::::::::::::::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>

                               ESTABLECER LAS REGLAS DE NEGOCIOS::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>


                                DEPURAR EL RPOGRAMA::::::::::::::::::::::::::::::::::::::::
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT><br/>
                            </td>
                        </tr>
 			<tr>
   			  <td align="left">

                           <p>  <input type="button" value="Guardar Evaluacion" id="Guardar_3"/>

                               <textarea name="comentario" rows="5" cols="20"></textarea><p>

                          </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
