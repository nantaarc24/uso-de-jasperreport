/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.actions;

import com.opensymphony.xwork2.ActionSupport;
import edu.sise.dao.ReporteDAO;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class ReporteAction extends ActionSupport implements ServletResponseAware{

    
    private HttpServletResponse response;
    ReporteDAO reportedao=new ReporteDAO();
    
    public String verReporte1(){
        
        try {
            String nombre=ServletActionContext.getServletContext().getRealPath("/")+"/reportes/ReporteProductos.jasper";
            
            JasperPrint reporteLleno= reportedao.obtenerReporte(nombre, null);
            
            JRPdfExporter ex= new JRPdfExporter();
            ex.setParameter(JRExporterParameter.JASPER_PRINT, reporteLleno);
            ex.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
            ex.exportReport();
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        return null;
    }
    
     public String verReporte2(){
        
        try {
            String nombre=ServletActionContext.getServletContext().getRealPath("/")+"/reportes/ReporteProductosSinStock.jasper";
            
            JasperPrint reporteLleno= reportedao.obtenerReporte(nombre, null);
            
            JRPdfExporter ex= new JRPdfExporter();
            ex.setParameter(JRExporterParameter.JASPER_PRINT, reporteLleno);
            ex.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
            ex.exportReport();
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        return null;
    }
    @Override
    public void setServletResponse(HttpServletResponse hsr) {
        response= hsr;
    }
    
    
    
}
