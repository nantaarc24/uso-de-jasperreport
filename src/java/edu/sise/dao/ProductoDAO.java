/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.dao;

import edu.sise.entity.Producto;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import edu.sise.util.Conexion;

/**
 *
 * @author fclou
 */
public class ProductoDAO {
    
    SqlSessionFactory ssf = Conexion.conectar();
    
    public boolean agregar(Producto producto){
        boolean resultado = false;
        SqlSession session = ssf.openSession();
        try {
            session.insert("guardarProducto", producto);
            session.commit();
            resultado = true;
            
        } catch (Exception e) {
            System.out.println(e);
            session.rollback();            
        }
        session.close();
        return resultado;
    }
    
    public List<Producto> listar(){
        List<Producto> lstProductos = null;
        SqlSession session = ssf.openSession();
        try {
            lstProductos = session.selectList("listarProductos");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return lstProductos;
    }

    
}
