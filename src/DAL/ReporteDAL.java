/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.SQLException;
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

    public void create (String equipo, int mantFk) throws SQLException{
        Connection cx = null;

        try {
            Map parameters = new HashMap();
            parameters.put("equipo", equipo);
            parameters.put("fkMant", mantFk);
            cx = new Conector().getConn();

            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportEquiUlt.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

    public void porFecha(java.sql.Date desde, java.sql.Date hasta, String equipo) 
            throws SQLException {
        Connection cx = null;
        try {
            Map parameters = new HashMap();
            parameters.put("desde", desde);
            parameters.put("hasta", hasta);
            parameters.put("equipo", equipo);
            cx = new Conector().getConn();
            
            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportEquiDate.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

    public void ultMant(String equipo) throws SQLException {
        Connection cx = null;
        try {
            Map parameters = new HashMap();
            parameters.put("equipo", equipo);
            parameters.put("fecha", new AccionesDAL().buscarUltimaRealizada(equipo));
            
            cx = new Conector().getConn();

            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportEquiUltRea.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

    public void reportePorAreaDate(int kArea, int kTipo, java.sql.Date desde,
            java.sql.Date hasta) throws SQLException {
        Connection cx = null;
        try {
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);

            parameters.put("desde", desde);
            parameters.put("hasta", hasta);

            cx = new Conector().getConn();

            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportAreaDate.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

    public void reportePorAreaDateNoRealizada(int kArea, int kTipo, java.sql.Date desde,
            java.sql.Date hasta) throws SQLException {
        Connection cx = null;
        try {
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);

            parameters.put("desde", desde);
            parameters.put("hasta", hasta);

            cx = new Conector().getConn();

            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportAreaDate_1.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

    public void reportePorAreaDateRealizada(int kArea, int kTipo, java.sql.Date desde,
            java.sql.Date hasta) throws SQLException {
        Connection cx = null;
        try {
            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);

            parameters.put("desde", desde);
            parameters.put("hasta", hasta);

            cx = new Conector().getConn();

            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportAreaDate_2.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

    public void reportePorCantidadOt(int kArea, int kTipo, java.sql.Date desde,
            java.sql.Date hasta) throws SQLException {
        Connection cx = null;
        try {

            Map parameters = new HashMap();
            parameters.put("areaK", kArea);
            parameters.put("tipoK", kTipo);

            parameters.put("desde", desde);
            parameters.put("hasta", hasta);

             cx = new Conector().getConn();

            String dir = "C:\\Users\\ferna\\Documents\\NetBeansProjects\\Demov10\\src\\Report\\reportResumenCantOts.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parameters, cx);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

            if (cx != null) {
                cx.close();
            }

        }

    }

}
