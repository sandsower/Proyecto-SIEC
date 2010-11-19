<script type="text/javascript" >
    $("document").ready(function(){
        //alert("hola");
        $(".gruposList").mouseover(function(){
            this.bgColor="#D3D3D3";
        }).mouseout(function(){
            this.bgColor="";
        });
        $(".menuItem").click(function(e){
            e.preventDefault();
            //alert(this.href);
            $("#mitte").load(this.href);
        });
    });
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%-- 
    Document   : grupos
    Created on : 06-nov-2010, 20:48:01
    Author     : lugubrenator
--%>
<%@page import="clases.TrUsuario" %>
<%
      HttpSession objSesion = request.getSession(true);
      TrUsuario usuario = null;
       if(objSesion.getAttribute("usuario") == null){
           response.sendRedirect("index.jsp");
       } else
           usuario = (TrUsuario)objSesion.getAttribute("usuario");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.CarreraGrupo" %>
<%@page import="MovimientosBD.ObtenerConjunto" %>
<%@page import="MovimientosBD.ObtenerIndividuo" %>
<%
    ObtenerConjunto obco = new ObtenerConjunto();
    ObtenerIndividuo obin = new ObtenerIndividuo();
    ArrayList cg = new ArrayList();
    try{
        int idm = obin.obtenerMaestrobyUsuario_ID(usuario.getUsuario_ID()).getMaestro_ID();
        cg = obco.getCarrerasGruposByIdMaestro(idm);
    }catch(NullPointerException e){
        out.print("no hay grupos disponibles");
    }
request.setAttribute("cg", cg);
%>
    <div class="cuadro cuadromarg">
	<div class="theader">Seleccione el grupo</div>
	<div class="cuadcont">
            <c:forEach items="${cg}" var="car">
            <table>
                <tr>
                    <td colspan="2"><strong>${car.carrera.des_Carrera}</strong></td>
                </tr>
                <c:forEach items="${car.grupos}" var="gr">
                <tr>
                    <td width="20px"></td>
                    <td width="300px" bgcolor="" style="" class="gruposList"><a href="competencias/Asignar/materias.jsp?id=${gr.grupo_ID}" class="menuItem">${gr.des_Grupo} - ${gr.grado}</a></td>
                </tr></c:forEach>
            </table>
            </c:forEach>
	</div>
    </div>