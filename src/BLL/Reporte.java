/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARR
 */
public class Reporte {
private String equipo;

    public Reporte() {
    }

    public Reporte(java.util.Date desde, java.util.Date hasta, String nEquipo){
        
    try {
        new DAL.ReporteDAL().porFecha(new java.sql.Date(desde.getTime()),
                new java.sql.Date(hasta.getTime()), nEquipo);
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public Reporte(String equipo) {
    this.equipo = equipo.toLowerCase();
    }
    
    
    public void Reporte() {
        
    try { 
        new DAL.ReporteDAL().create(this.equipo,
                new Manteciones(this.equipo).buscarUltimaKey());
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
  
    
    
    public void ReporteU(){
    
    try {
        new DAL.ReporteDAL().ultMant(this.equipo);
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void ReportePorAreaDate(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
    try { 
        new DAL.ReporteDAL().reportePorAreaDate(kArea, kTipo,
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void ReportePorAreaDateNoRealizada(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
    try { 
        new DAL.ReporteDAL().reportePorAreaDateNoRealizada(kArea, kTipo,
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void ReportePorAreaDateRealizada(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
    try { 
        new DAL.ReporteDAL().reportePorAreaDateRealizada(kArea, kTipo,
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void ReportePorAreaCantidadOt(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
    try { 
        new DAL.ReporteDAL().reportePorCantidadOt(kArea, kTipo,
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
} 