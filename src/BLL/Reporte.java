/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author CARR
 */
public class Reporte {
private String equipo;

    public Reporte() {
    }

    public Reporte(java.util.Date desde, java.util.Date hasta, String nEquipo){
        
        new DAL.ReporteDAL().porFecha(new java.sql.Date(desde.getTime()),
                new java.sql.Date(hasta.getTime()), nEquipo);
    }
    
    public Reporte(String equipo) {
    this.equipo = equipo.toLowerCase();
    }
    
    
    public void Reporte() {
        
        new DAL.ReporteDAL().create(this.equipo, 
                new Manteciones(this.equipo).buscarUltimaKey());
    }
  
    
    
    public void ReporteU(){
    
        new DAL.ReporteDAL().ultMant(this.equipo);
    }
    
    public void ReportePorAreaDate(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
        new DAL.ReporteDAL().reportePorAreaDate(kArea, kTipo, 
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    }
    public void ReportePorAreaDateNoRealizada(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
        new DAL.ReporteDAL().reportePorAreaDateNoRealizada(kArea, kTipo, 
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    }
    public void ReportePorAreaDateRealizada(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
        new DAL.ReporteDAL().reportePorAreaDateRealizada(kArea, kTipo, 
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    }
    public void ReportePorAreaCantidadOt(int kArea, int kTipo, java.util.Date desde, 
            java.util.Date hasta){
    
        new DAL.ReporteDAL().reportePorCantidadOt(kArea, kTipo, 
                new java.sql.Date(desde.getTime()), new java.sql.Date(hasta.getTime()));
    }
    
} 