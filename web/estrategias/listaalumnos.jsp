<%--
    Document   : index
    Created on : Oct 6, 2010, 8:42:22 AM
    Author     : Esteban
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.*" %>
<%@page import="MovimientosBD.*" %>
<%@page import="java.util.*" %>
<%

      HttpSession objSesion = request.getSession(true);
      TrUsuario usuario = (TrUsuario)objSesion.getAttribute("usuario");
      ArrayList<TrAlumnos> alumnos = (ArrayList<TrAlumnos>)request.getAttribute("alumnos");
      
      ObtenerConjunto getGroup = new ObtenerConjunto();
      ArrayList per = new ArrayList();
            try {
                per = getGroup.obtenerMenu(usuario.getPerfil_ID());
                }catch(NullPointerException e){
                    out.print("error, no hay menú disponible");
                }
            request.setAttribute("per", per);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="es">
<head>
<meta http-equiv="content-type" content="text/html;charset=iso-8859-1">
	<title>SIEC &bull; Estrategias, lista de Alumnos</title>
<link rel="stylesheet" type="text/css" href="../css/siec.css" media="all">
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../js/siec.js"></script>
<script type="text/javascript" src="../js/estrategias.js"></script>
</head>
<body>
</head>
<body>
        <h2>Lista de Alumnos</h2>
        <p>Asigna la estrategia por alumno o de forma grupal. Preciona click en el alumno para asignar.</p>  
                <%
                 ObtenerIndividuo ind = new ObtenerIndividuo();
                for(TrAlumnos i: alumnos)
                {
                    TrUsuario utem = ind.obtenerUsuario(i.getUsuario_ID());
                    TcCarrera c = ind.obtenerCarrera(i.getCarrera_ID());
                %>

                    <div class="cuadro cuadromarg">
                        <div class="theader cpointer einf" id="einf<%= i.getAlumnos_ID() %>"><%= i.getMatricula() %> : <%= utem.getNombres()+" "+utem.getApellidoPat()+" "+utem.getApellidoMat() %></div>
                        <div class="cuadcont hidden einf<%= i.getAlumnos_ID() %>c">
                        <div class="infoeal">
                            <div class="fl avataral">
                                <img class="imgal" alt="<%= utem.getNombres() %>"  src="../images/avatares/<%= utem.getImg() %>" height="100px" width="100px" >
                            </div>
                            <div class="fl infoal">
                                <ul>
                                    <li class="grayrow"><span class="lile">Matricula:</span> <%= i.getMatricula() %></li>
                                    <li><span class="lile">Carrera:</span> <%= c.getDes_Carrera() %></li>
                                    <li class="grayrow"><span class="lile">Nombres:</span> <%= utem.getNombres() %></li>
                                    <li><span class="lile">Apellido Paterno:</span> <%= utem.getApellidoPat() %></li>
                                    <li class="grayrow"><span class="lile">Apellido Materno:</span> <%= utem.getApellidoMat() %></li>
                                </ul>
                            </div>
                            <p  class="cl"></p>
                        </div>
                        <p>Agregar Estrategia al Alumno</p>
                    
                    <form name="form<%= i.getAlumnos_ID() %>" class="form" action="estrategiaserv.do" method="post">
                        <div class="textarea"><textarea name = "mensaje" rows="10"  cols="50"></textarea></div>
                        <input type="hidden" name="ida" value="<%= i.getAlumnos_ID() %>">
                        <input type="hidden" name="button" value="1">
                        <div class="submit"><input type="submit" value="Guardar Estrategia Individual" /></div>
                    </form>
                       </div>
                   </div>

               <%
                }
               %>
              
             <h2>Agregar una Estrategia Grupal</h2>
             <div class="cuadro cuadromarg">
                        <div class="cuadcont">
                            <form name="formg" class="form" action="estrategiaserv.do" method="post">
                                <div class="textarea"><textarea  class="input"  id="mensaje"  name ="mensaje" rows="10"  cols="50"></textarea></div>
                                <input type="hidden" name="button" value="0" />
                                <div class="submit"><input type='submit' value="Guardar Estrategia Grupal" /></div>
                           </form>
                        </div>
             </div>

<ul>
                <li><a href="estrategias.jsp">Estrategias Grupales</a></li>
                <li><a href="estrategiasalumnos.jsp">Estrategias de los Alumnos</a></li>
            </ul>
</body>
</html>