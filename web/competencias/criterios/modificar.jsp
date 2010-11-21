
       <h1>Modificar Criterio</h1>
       <form  method="post" action="competencias/criterios/modificarCriterio">
           <table>
               <input type="hidden" name="id" value="${Criterio.id}"/>
               <tr>
                   <td>Nombre:</td>
                   <td><input type="text" name="nombre" value="${Criterio.nombre}"/></td>
               </tr>
               <tr>
                   <td>Descripcion</td>
                   <td><textarea cols="20" rows="4" name="descripcion">${Criterio.descripcion}</textarea></td>
               </tr>
               <tr>
                   <td>Ponderacion</td>
                   <td><input type="text" name="ponderacion" value="${Criterio.ponderacion}"/></td>
               </tr>
               <tr>
                   <td><input type="submit" value="Modificar"/></td>
               </tr>
           </table>


       </form>
  