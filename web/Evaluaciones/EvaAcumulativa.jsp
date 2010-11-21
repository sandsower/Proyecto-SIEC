
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evaluacion Acumulativa</title>
        <SCRIPT type= "text/JavaScript" src= "js/jquery.js"> </SCRIPT>
	<SCRIPT type= "text/JavaScript" src= "js/acciones_acum.js"> </SCRIPT>
        <link rel="stylesheet" href="Styles/default.css" type="text/css" />
    </head>
    <body>
        <h1>Evaluación acumulativa</h1>
        Seleccione el alumno a evaluar:<br/><br/>
        <table id="Tabla_Contenido" width=1100>
            <tr>
                <td>
                    Alumno Generico 1  <button id="Alumno1">Mostrar resultados evaluacion</button>
                    <b><label id="Status_1" class="incomplete"> Evaluacion Incompleta </label></b>
                    <table id="Evaluacion1" class="competencia">
                        <tr>
                            <td>
                                Competencia #1: <b>Competente</b><br/>
                                Competencia #2: <b>Competente</b><br/>
                                Competencia #3: <b>No Competente</b><br/>
                                Competencia #4: <b>Excelente</b><br/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">
                                Calificacion final:
                                <input type="text" size="2" id="Calificacion1"/>
                                <br/>
                                <input type="button" id="Guardar_1" value="Guardar"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    Alumno Generico 2  <button id="Alumno2">Mostrar resultados evaluacion</button>
                    <b><label id="Status_2" class="incomplete"> Evaluacion Incompleta </label></b>
                    <table id="Evaluacion2" class="competencia">
                        <tr>
                            <td>
                                Competencia #1: <b>No Competente</b><br/>
                                Competencia #2: <b>Excelente</b><br/>
                                Competencia #3: <b>No Competente</b><br/>
                                Competencia #4: <b>Excelente</b><br/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">
                                Calificacion final:
                                <input type="text" size="2" id="Calificacion2"/>
                                <br/>
                                <input type="button" id="Guardar_2" value="Guardar"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    Alumno Generico 3  <button id="Alumno3">Mostrar resultados evaluacion</button>
                    <b><label id="Status_3" class="incomplete"> Evaluacion Incompleta </label></b>
                    <table id="Evaluacion3" class="competencia">
                        <tr>
                            <td>
                                Competencia #1: <b>Competente</b><br/>
                                Competencia #2: <b>Competente</b><br/>
                                Competencia #3: <b>Competente</b><br/>
                                Competencia #4: <b>Incompetente</b><br/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">
                                Calificacion final:
                                <input type="text" size="2" id="Calificacion3"/>
                                <br/>
                                <input type="button" id="Guardar_3" value="Guardar"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
