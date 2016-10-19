/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CARR
 */
public class ReporteDAL {
    
    public void create(String equipo,int mantFk){
        try {
            Map parameters = new HashMap();
            parameters.put("equipo", equipo);
            parameters.put("fkMant", mantFk);
            Conector cx =   new Conector();
            cx.getConexion();
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportEquiUlt.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte,false);
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    public void porFecha(java.sql.Date desde,java.sql.Date hasta,String equipo){
            try {
            Map parameters = new HashMap();
            parameters.put("desde", desde);
            parameters.put("hasta", hasta);
            parameters.put("equipo", equipo);
            Conector cx =   new Conector();
            cx.getConexion();
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportEquiDate.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte, false);
            
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
     public void ultMant(String equipo ){
            try {
            Map parameters = new HashMap();
            parameters.put("equipo", equipo);
            parameters.put("fecha", new AccionesDAL().buscarUltimaRealizada(equipo));
            Conector cx =   new Conector();
            cx.getConexion();
                      
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportEquiUltRea.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte, false);
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
     public void reportePorAreaDate(int kArea, int kTipo, java.sql.Date desde,
     java.sql.Date hasta){
            try {
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);
            
            parameters.put("desde", desde);
            parameters.put("hasta", hasta);
            
            
            Conector cx =   new Conector();
            cx.getConexion();
                      
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportAreaDate.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte, false);
            
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
     public void reportePorAreaDateNoRealizada(int kArea, int kTipo, java.sql.Date desde,
     java.sql.Date hasta){
            try {
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);
            
            parameters.put("desde", desde);
            parameters.put("hasta", hasta);
            
            
            Conector cx =   new Conector();
            cx.getConexion();
                      
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportAreaDate_1.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte, false);
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
     public void reportePorAreaDateRealizada(int kArea, int kTipo, java.sql.Date desde,
     java.sql.Date hasta){
            try {
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);
            
            parameters.put("desde", desde);
            parameters.put("hasta", hasta);
            
            
            Conector cx =   new Conector();
            cx.getConexion();
                      
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportAreaDate_2.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte , false);
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
     public void reportePorCantidadOt(int kArea, int kTipo, java.sql.Date desde,
     java.sql.Date hasta){
            try {
                
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);
            
            parameters.put("desde", desde);
            parameters.put("hasta", hasta);
            
            
            Conector cx =   new Conector();
            cx.getConexion();
                      
            String dir = "C:\\Users\\CARR\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportResumenCantOts.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters ,cx.getConn());
            JasperViewer.viewReport(mostrarReporte , false);
            
        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
     
    }

