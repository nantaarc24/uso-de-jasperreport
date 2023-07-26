/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Administrador
 */
public class Conexion {
    
    public static SqlSessionFactory conectar(){
        SqlSessionFactory ssf = null;
        try {
            String ruta = "mybatis-config.xml";
            InputStream archivo = Resources.getResourceAsStream(ruta);
            ssf = new SqlSessionFactoryBuilder().build(archivo);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ssf;
    }
    
}
