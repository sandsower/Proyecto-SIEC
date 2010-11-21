<%
    HttpSession objSesion = request.getSession(true);
    MovimientosBD.ObtenerIndividuo obin = new MovimientosBD.ObtenerIndividuo();
    clases.TrUsuario u = null;
    try {
     u = obin.Login(request.getParameter("user"), request.getParameter("password"));
        objSesion.setAttribute("usuario", u);
    } catch(NullPointerException ex) {
        //out.println("SQL Exception: "+ ex.toString());
        objSesion.setAttribute("usuario", null);
        response.sendRedirect("index.jsp?error=es");
    }

    if(u == null)
        response.sendRedirect("index.jsp?error=1");
    else
        response.sendRedirect("systemIndex.jsp");
%>