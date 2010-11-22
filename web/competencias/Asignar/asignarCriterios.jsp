<%@page import="clases.TrUsuario" %>
<%
      HttpSession objSesion = request.getSession(true);
      TrUsuario usuario = null;
       if(objSesion.getAttribute("usuario") == null){
           response.sendRedirect("index.jsp");
       } else
           usuario = (TrUsuario)objSesion.getAttribute("usuario");
%>
<%@page import="MovimientosBD.ObtenerIndividuo" %>
<%@page import="clases.TcCompetencias" %>
<%
    ObtenerIndividuo obin = new ObtenerIndividuo();
    TcCompetencias comp = obin.obtenerCompetencia(Integer.parseInt(request.getParameter("id")));
%>
<div class="cuadro cuadromarg">
    <div class="theader">Asignar Criterios</div>
    <div class="cuadcont">
        <h3><%= comp.getDes_Competencia() %></h3>
        <c:forEach items="${cc}" var="car">
        <table>
            <tr>
                <td colspan="2"><strong>${car.des_Categoria}</strong></td>
            </tr>
            <c:forEach items="${car.competencias}" var="gr">
            <tr>
                <td width="20px"></td>
                <td width="300px" bgcolor="" style="" class="gruposList"><a href="competencias/Asignar/asignarCriterios.jsp?id=${gr.competencia_ID}" class="menuItem2">- ${gr.des_Competencia}</a></td>
            </tr></c:forEach>
        </table>
        </c:forEach>
    </div>
</div>