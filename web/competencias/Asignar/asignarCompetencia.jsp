<%
MovimientosBD.InsertarNuevo in = new MovimientosBD.InsertarNuevo();
in.insertarSesion(in.insertarPresesion(Integer.parseInt(request.getParameter("id"))),Integer.parseInt(request.getParameter("idMgm")));
%>