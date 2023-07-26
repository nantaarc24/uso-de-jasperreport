/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.entity;

/**
 *
 * @author fclou
 */
public class Producto {
    
    private int codigo;
    private String descripcion;
    private String marca;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, String marca, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    


    
    
}
