<script type="text/javascript" >
    $("document").ready(function(){
        //alert("hola");
        $(".gruposList").mouseover(function(){
            this.bgColor="#D3D3D3";
        }).mouseout(function(){
            this.bgColor="";
        });
        $(".menuItem2").click(function(e){
            e.preventDefault();
            //alert(this.href);
            $("#menur").load(this.href);
        });
    });
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
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
<%@page import="clases.TcCategorias" %>
<%@page import="MovimientosBD.ObtenerConjunto" %>
<%@page import="clases.CompetenciasCategorias" %>
<%
    ObtenerConjunto obco = new ObtenerConjunto();
    ArrayList cc = new ArrayList();

    try{
        cc = obco.obtenerCategoriasCompetencias();
    }catch(NullPointerException e){
        out.print("no hay categorias disponibles");
    }
request.setAttribute("cc", cc);
%>
<div class="cuadro cuadromarg">
    <div class="theader">Agregar competencia</div>
    <div class="cuadcont">
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