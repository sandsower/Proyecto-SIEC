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
        <h1>Por favor selecciona la materia a evaluar:</h1>
        <form action="SeleccionMateria.do" method="POST">
            <select name="ID">
                <c:forEach items="${Materias}" var="materia">
                    <option id="${materia.materias_ID}">${materia.des_Materias}</option>
                </c:forEach>
            </select>
        </form>
    </body>
</html>
