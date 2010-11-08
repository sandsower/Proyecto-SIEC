<%-- 
    Document   : SeleccionProfesor
    Created on : Nov 1, 2010, 7:15:41 PM
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
        <h1>Por favor selecciona el grupo:</h1>
        <form action="llenarCompetencias.do" method="POST">
            <select name="IDGrupo">
                <c:forEach items="${Grupos}" var="grupo">
                    <option value="${grupo.grupo_ID}">${grupo.des_Grupo}${grupo.grado}</option>
                </c:forEach>
            </select>
            <input type="hidden" name="IDMaestro" value="${IDMaestro}" />
            <input type="hidden" name="IDMateria" value="${IDMateria}"/>
            <input type="submit" value="Aceptar"/>
        </form>
    </body>
</html>
