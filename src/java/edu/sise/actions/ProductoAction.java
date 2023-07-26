/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.actions;

import com.opensymphony.xwork2.ActionSupport;
import edu.sise.dao.ProductoDAO;
import edu.sise.entity.Producto;
import java.util.List;

/**
 *
 * @author fclou
 */
public class ProductoAction extends ActionSupport{
    
    private Producto producto;
    private List<Producto> lstProductos;
    
    ProductoDAO productodao = new ProductoDAO();
    
    public String agregarProducto(){
        if( productodao.agregar(producto) ){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
    
    public String mostrarProductos(){
        lstProductos = productodao.listar();
        return SUCCESS;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(List<Producto> lstProductos) {
        this.lstProductos = lstProductos;
    }

    
    
}
