<%-- 
    Document   : BienvenidoCE
    Created on : Nov 1, 2010, 7:21:12 PM
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
        <h1>Bienvenido al modulo de Evaluacion Formativa</h1>
        Sigue las instrucciones que apareceran en las siguientes paginas para completar el registro de la autoevaluacion.
        <form action="llenarMaterias.do" method="POST">
            <input type="hidden" value="9" name="ID"/>
            <input type="submit" value="siguiente"/>
        </form>
    </body>
</html>
