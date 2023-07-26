<%-- 
    Document   : 
    Created on : 12-mar-2018, 21:11:04
    Author     : Administrador
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Producto</title>
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
                    <div class="titulo">Nuevo Producto</div>
                    <div class="tablaFrm">
                        
                        <s:form action="agregarProducto">
                            <s:textfield label="Descripcion" name="producto.descripcion" cssClass="campotexto"></s:textfield>
                            <s:textfield label="Marca" name="producto.marca" cssClass="campotexto"></s:textfield>
                            <s:textfield label="Precio" name="producto.precio" cssClass="campotexto"></s:textfield>
                            <s:textfield label="Stock" name="producto.stock" cssClass="campotexto"></s:textfield>
                            <s:submit value="Agregar" cssClass="boton"></s:submit>
                        </s:form>
                        
                    </div>
                </div>
            </div>
        </div>
        
        
    </body>
</html>
