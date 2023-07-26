/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.dao;

import edu.sise.util.Conexion;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class ReporteDAO {
    SqlSessionFactory ssf=Conexion.conectar();
    
    public JasperPrint obtenerReporte(String nombre, Map parametros){
        JasperPrint reporteLleno = null;
        SqlSession session= ssf.openSession();
        
        try {
            
            JasperReport reporte= (JasperReport)JRLoader.loadObject(nombre);
            reporteLleno= JasperFillManager.fillReport(reporte, parametros, session.getConnection());
            
        } catch (Exception e) {
            System.out.println(e);
      
        }
        session.close();
        return reporteLleno;
    }
}
