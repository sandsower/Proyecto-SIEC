<%-- 
    Document   : AutoEva
    Created on : Nov 2, 2010, 10:09:25 PM
    Author     : sands
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Favor de ingresar la calificacion deseada al criterio/competencia a evaluar:</h1>
        <form action="guardarEvaluacion.do" method="POST">
        Criterio:${Criterio.des_Criterio}<br/>
        <select name="seleccionNivel">
            <c:forEach items="${Niveles}" var="nivel">
                <option value="${nivel.evaluacion_Nivel_ID}">${nivel.des_Evaluacion}</option>
            </c:forEach>
        </select>
        <input type="hidden" name="idEvaluacion" value="${Evaluacion.evaluacion_parcial_ID}"/>
        <input type="submit" value="Guardar"/>
        </form>
    </body>
</html>
