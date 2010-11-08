<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="clases.TrUsuario" %>
<%
      HttpSession objSesion = request.getSession(true);
      TrUsuario usuario = null;
       if(objSesion.getAttribute("usuario") == null){
           response.sendRedirect("index.jsp");
           objSesion.setAttribute("usuario", null);
       } else
           usuario = (TrUsuario)objSesion.getAttribute("usuario");
%>

<%@page import="clases.TcGrupo" %>
<%@page import="clases.TcMaterias" %>
<%@page import="MovimientosBD.ObtenerIndividuo" %>
<%
    ObtenerIndividuo obin = new ObtenerIndividuo();
    TcGrupo g = null;
    TcMaterias m = null;
    try{
        g = obin.obtenerGrupo(Integer.parseInt(request.getParameter("grupo")));
        m = obin.obtenerMateria(Integer.parseInt(request.getParameter("id")));
    }catch(NullPointerException e){
    }
%>
<script type="text/javascript" >
    $("document").ready(function(){

        $(".menuItem").click(function(e){
            e.preventDefault();
            //alert(this.href);
            $("#mitte").load(this.href);
        });
    });
</script>
<div class="theader"><a href="competencias/Asignar/grupos.jsp" class="menuItem">Grupos</a> >> <a href="competencias/Asignar/materias.jsp?id=<%=g.getGrupo_ID()%>" class="menuItem"><%=g.getDes_Grupo()%> - <%=g.getGrado()%></a> >> <%=m.getDes_Materias()%></div><br>
<div class="cuadro cuadromarg">
    <div class="theader">Competencias</div>
    <div class="cuadcont">
        <table>
            <tr>
                <td><strong>Materias</strong></td>
            </tr><c:forEach items="${cg}" var="gr">
            <tr>
                <td width="300px" bgcolor="" style="" class="gruposList"><a href="competencias/Asignar/competencias.jsp?id=${gr.materias_ID}&grupo=" class="menuItem">${gr.des_Materias}</a></td>
            </tr></c:forEach>
        </table>
        <img alt="Agregar Nueva Competencia"  src="images/botones/agregarNueva.gif" height="22px" />
    </div>
</div>