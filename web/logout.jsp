<%
    HttpSession objSesion = request.getSession(true);
    objSesion.setAttribute("usuario", null);
    response.sendRedirect("index.jsp");
%>