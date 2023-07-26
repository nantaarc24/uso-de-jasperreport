<%-- 
    Document   : verCargos
    Created on : 19-mar-2018, 21:10:20
    Author     : Administrador
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Turnos</title>
    </head>
    <body>
       
        <div class="principal">
            <div class="encabezado"></div>
            <div class="menu">
                <ul class="lista">
                    <li><a href="agregarProducto.jsp">Agregar Producto</a></li>
                    <li><a href="mostrarProductos">Mostrar Productos</a></li>
                    <li><a href="Reporte1.jsp">Reporte 1</a></li>
                    <li><a href="Reporte2.jsp">Reporte 2</a></li>
                    
                </ul>
            </div>
            <div class="contenido">
                <div class="contenedor">
                    <div class="titulo">Lista de Productos</div>
                    
                    <table class="tablaDatos">
                        <tr>
                            <th>Código</th>
                            <th>Descripcion</th>
                            <th>Marca</th>
                            <th>Precio</th>
                            <th>Stock</th>
                        </tr>
                        
                        <s:iterator value="lstProductos">
                            <tr>
                                <td><s:property value="codigo"></s:property></td>
                                <td><s:property value="descripcion"></s:property></td>
                                <td><s:property value="marca"></s:property></td>
                                <td><s:property value="precio"></s:property></td>
                                <td><s:property value="stock"></s:property></td>
                            </tr>
                        </s:iterator>
                        
                    </table>
                    
                </div>
            </div>
        </div>
        
    </body>
</html>
