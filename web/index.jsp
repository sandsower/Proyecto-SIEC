<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
            HttpSession objSesion = request.getSession(true);
            if (objSesion.getAttribute("usuario") != null) {
                response.sendRedirect("systemIndex.jsp");
            } else {
                objSesion.setAttribute("usuario", null);
            }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Evaluacion de Competencias SIEC</title>
        <link rel="stylesheet" type="text/css" href="css/siec.css" media="screen" />
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/siec.js"></script>
    </head>
    <body>
        <div class="h1login"><h1>Sistema de Evaluacion de Competencias SIEC</h1></div>
        <div id="login">
            <% //Imprime mensaje de error en caso de que el usuario no sea correcto
                        if (request.getParameter("error") != null) {
                            out.print("Error, usuario o contraseña incorrectos");
                        }
            %>
            <form name="loginform" id="loginform" action="login.jsp" method="post">
                <div>
                    <label>Nombre de usuario</label>
                    <input type="text" name="user" id="user_login" class="input" value="" size="20" tabindex="10" />
                </div>
                <div>
                    <label>Contraseña</label>
                    <input type="password" name="password" id="user_pass" class="input" value="" size="20" tabindex="20" />
                </div>
                <div class="submit subform"><input type="submit" value="Iniciar Sesión" /></div>
            </form>
        </div>
    </body>
</html>