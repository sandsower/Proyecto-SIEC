<%-- 
    Document   : AutoEva
    Created on : Nov 2, 2010, 10:09:25 PM
    Author     : sands
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Valores obtenidos:
        Calificacion: ${Evaluacion.calificacion}
        Parcial: ${Evaluacion.parcial}
        Evaluacion_Nivel: ${Evaluacion.evaluacion_nivel_ID}
        Tipo_Evaluacion_ID: ${Evaluacion.tipo_evaluacion_ID}
        Sesion_ID: ${Evaluacion.maestro_materia_grupo_sesion_ID}
        Alumnos_ID: ${Evaluacion.alumnos_ID}
    </body>
</html>
