<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <HEAD>
        <SCRIPT type= "text/JavaScript" src= "js/jquery.js"> </SCRIPT>
	<SCRIPT type= "text/JavaScript" src= "js/acciones.js"> </SCRIPT>
        <link rel="stylesheet" href="Styles/default.css" type="text/css" />
    </HEAD>

    <BODY>
	<H1> CO-EVALUACION </H1>
	<TABLE border=0 width=1100>
            <TR><TD> EVALUADOR: </TD> <TD> <B>GIANNINA WENDOLYNE CAJERO RODRIGUEZ</B> </TD> <TD> EVALUADO: </TD> <TD> <B>KARLA GALVEZ FLORES</B> </TD> </TR>
            <TR><TD> MATERIA: </TD> <TD> <B>PROGRAMACION VI</B> </TD> <TD> PROFESOR </TD> <TD> <B>ROCÍO TERAN</B> </TD> </TR>
	</TABLE>
            <CENTER>
            <BR>
            <form id="forma" action="servlet.do" method="post">
                <TABLE 	border=0 width=1100>
                    <TR> <TD colspan=3>
                            <DIV>
                                <TABLE width=1100 id= "Tabla_Contenido">
                                    <tr> <td align="center" colspan="3"> <input type="button" value="Competencia #1" id="Comp_1_Boton"/>
                                            <label id="Status_1" class="incomplete"> Evaluacion Incompleta </label> </td></tr>
                                    <table width="1000" id="Comp_1_Area" class="competencia">
				<TR>
                                    <TD align=right> IDENTIFICAR LAS CLASES
                                    </TD>
                                    <TD align= "right">
                                        <SELECT id="criterio11">
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
                                    <TD align= "right" rowspan=3>
                                        <textarea name="comentario1" rows="10" cols="40"></textarea>
                                    </TD>
				</TR>
				<TR>
                                    <TD align=right> ESTABLECER LAS REGLAS DE NEGOCIOS
                                    </TD>
                                    <TD align= "right">
                                        <SELECT id="criterio12">
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
				</TR>
				<TR>
                                    <TD align=right valign= "top">
                                        DEPURAR EL PROGRAMA
                                    </TD>
                                    <TD align= "right" valign= "top">
                                        <SELECT id="criterio13">
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
				</TR>
                                <tr>
                                    <td colspan="3" align="right"><input type="submit" value="Guardar Evaluacion" id="Guardar_1"/></td>
                                </tr>
                                 </table>
                                     <tr> <td align="center" colspan="3"> <input type="button" value="Competencia #2" id="Comp_2_Boton"/>
                                         <label id="Status_2" class="incomplete"> Evaluacion Incompleta </label></td>
                                     </tr>
                                    <table width="1000" id="Comp_2_Area" class="competencia">
				<TR>
                                    <TD align=right>
                                        IDENTIFICAR LAS CLASES
                                    </TD>
                                    <TD align= "right">
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
                                    <TD align= "right" rowspan=3> <textarea name="comentario2" rows="10" cols="40"></textarea>
                                    </TD>
				</TR>
				<TR>
                                    <TD align=right>
                                        ESTABLECER LAS REGLAS DE NEGOCIOS
                                    </TD>
                                    <TD align= "right">
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
				</TR>
				<TR>
                                    <TD align=right valign= "top">
                                        DEPURAR EL PROGRAMA
                                    </TD>
                                    <TD align= "right" valign= "top">
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
				</TR>
                                <tr>
                                    <td colspan="3" align="right"><input type="button" value="Guardar Evaluacion" id="Guardar_2"/></td>
                                </tr>
                                 </table>
                                      <tr> <td align="center" colspan="3"> <input type="button" value="Competencia #3" id="Comp_3_Boton"/>
                                            <label id="Status_3" class="incomplete"> Evaluacion Incompleta </label>
                                          </td>
                                      </tr>
                                    <table width="1000" id="Comp_3_Area" class="competencia">
				<TR>
                                    <TD align=right> IDENTIFICAR LAS CLASES
                                    </TD>
                                    <TD align= "right">
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
                                    <TD align= "right" rowspan=3> <textarea name="comentario3" rows="10" cols="40"></textarea>
                                    </TD>
				</TR>
				<TR>
                                    <TD align=right> ESTABLECER LAS REGLAS DE NEGOCIOS
                                    </TD>
                                    <TD align= "right">
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
				</TR>
				<TR>
                                    <TD align=right valign= "top"> DEPURAR EL PROGRAMA
                                    </TD>
                                    <TD align= "right" valign= "top">
                                        <SELECT>
                                            <OPTION> COMPETENTE </OPTION>
                                            <OPTION> INDEPENDIENTE </OPTION>
                                            <OPTION> NO SE </OPTION>
                                            <OPTION> BASICO </OPTION>
                                            <OPTION> INCOMPETENTE </OPTION>
					</SELECT>
                                    </TD>
				</TR>
                                <tr>
                                    <td colspan="3" align="right"><input type="button" value="Guardar Evaluacion" id="Guardar_3"/></td>
                                </tr>
                                 </table>
				</TABLE>
				</DIV>
				</TD>
				</TR>
<!-- AQUI TERMINA LA MATERIA DE PROGRA -->
			</TABLE>
                </form>
		</CENTER>
	</BODY>
</html>
