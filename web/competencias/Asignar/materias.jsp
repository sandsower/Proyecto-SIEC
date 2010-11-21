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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.TcGrupo" %>
<%@page import="MovimientosBD.ObtenerConjunto" %>
<%@page import="MovimientosBD.ObtenerIndividuo" %>
<%
    ObtenerConjunto obco = new ObtenerConjunto();
    ObtenerIndividuo obin = new ObtenerIndividuo();
    TcGrupo g = null;
    ArrayList cg = new ArrayList();
    try{
        int idm = obin.obtenerMaestrobyUsuario_ID(usuario.getUsuario_ID()).getMaestro_ID();
        cg = obco.getMateriasByMaestroIDGrupoID(idm, Integer.parseInt(request.getParameter("id")));
        if(request.getParameter("id") != null)
            g = obin.obtenerGrupo(Integer.parseInt(request.getParameter("id")));
        else
            out.print("Erro al obtener el grupo");
    }catch(NullPointerException e){
        out.print("no hay materias disponibles");
    }
request.setAttribute("cg", cg);
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
<div class="theader"><a href="competencias/Asignar/grupos.jsp" class="menuItem">Grupos</a> >> <%=g.getDes_Grupo()%> - <%=g.getGrado()%></div><br>
<div class="cuadro cuadromarg">
    <div class="theader">Seleccione la materia</div>
    <div class="cuadcont">
        <table>
            <tr>
                <td><strong>Materias</strong></td>
            </tr><c:forEach items="${cg}" var="gr">
            <tr>
                <td width="300px" bgcolor="" style="" class="gruposList"><a href="competencias/Asignar/competencias.jsp?id=${gr.materias_ID}&grupo=<%=g.getGrupo_ID()%>" class="menuItem">${gr.des_Materias}</a></td>
            </tr></c:forEach>
        </table>
    </div>
</div>