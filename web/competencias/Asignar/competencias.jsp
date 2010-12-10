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
<%@page import="clases.TrMaestroMateriaGrupo" %>
<%@page import="MovimientosBD.ObtenerIndividuo" %>
<%@page import="MovimientosBD.ObtenerConjunto" %>
<%
    ObtenerIndividuo obin = new ObtenerIndividuo();
    ObtenerConjunto obco = new ObtenerConjunto();
    TcGrupo g = null;
    TcMaterias m = null;
    TrMaestroMateriaGrupo mgm = null;
    ArrayList cc = null;
    try{
        g = obin.obtenerGrupo(Integer.parseInt(request.getParameter("grupo")));
        m = obin.obtenerMateria(Integer.parseInt(request.getParameter("id")));
        mgm = obin.obtenerMaestroGrupoMateria(obin.obtenerMaestrobyUsuario_ID(usuario.getUsuario_ID()).getMaestro_ID(), g.getGrupo_ID(), m.getMaterias_ID());
        cc = obco.obtenerCompetenciasByMgmID(mgm.getMaestroMateriaGrupo_ID());
    }catch(NullPointerException e){
    }
request.setAttribute("cc", cc);
%>
<script type="text/javascript" >
    $("document").ready(function(){

        $(".menuItem").click(function(e){
            e.preventDefault();
            //alert(this.href);
            $("#btnhidecols").removeClass("btnhidecolsnp").addClass("btnhidecolsp").html("Mostrar Columnas");
            $("#menur").css({"display":"none"});
            $("#wrapper").css({"margin":"0"});
            $("#header").css({"margin":"0"});

            $("#mitte").load(this.href);
        });
        if($("#btnhidecols").is('.btnhidecolsp')){
            $(this).removeClass("btnhidecolsp").addClass("btnhidecolsnp").html("Ocultar Columnas");
            $("#menur").css({"display":"block"});
            $("#wrapper").css({"marginLeft":"200px","marginBottom":"-41px","marginRight":"200px"});
            $("#header").css({"marginLeft":"-202px","marginRight":"-202px"});
        }

        $("#menur").load("competencias/Asignar/nuevas.jsp?idMgm=<%= mgm.getMaestroMateriaGrupo_ID() %>&idMateria=<%=request.getParameter("id")%>&idGrupo=<%=g.getGrupo_ID()%>");
    });
</script>
<div class="theader"><a href="competencias/Asignar/grupos.jsp" class="menuItem">Grupos</a> >> <a href="competencias/Asignar/materias.jsp?id=<%=g.getGrupo_ID()%>" class="menuItem"><%=g.getDes_Grupo()%> - <%=g.getGrado()%></a> >> <%=m.getDes_Materias()%></div><br>
<div class="cuadro cuadromarg">
    <div class="theader">Competencias</div>
    <div class="cuadcont">
        <div id="competenciasAsignadas">
            <fieldset>
                <legend>Competencias asignadas</legend>
                    <table><c:forEach items="${cc}" var="gr">
                        <tr>
                            <td width="300px" bgcolor="" style="" class="gruposList">${gr.des_Competencia}</td>
                        </tr></c:forEach>
                    </table>
            </fieldset>
        </div>
    </div>

</div>