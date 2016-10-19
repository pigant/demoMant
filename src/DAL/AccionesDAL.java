/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CARR
 */
public class AccionesDAL {
    
    public boolean create(String accion,int mantKey, java.sql.Date fecha, 
            String responsable){
     
        try { 
            PreparedStatement ps = new Conector().getConn().prepareStatement(              
                "update acciones set fecha_accion = ?, acciones = ?, responsable = ?, "
                        + "realizada = 1 where fk_mantencion = '"+mantKey+"'");
            ps.setDate(1,fecha);
            ps.setString(2,accion);
            ps.setString(3, responsable);
            ps.executeUpdate();
            PreparedStatement pps = new Conector().getConn().prepareStatement(              
                "update mantenciones set realizada = 1 where k_mantencion = '"+mantKey+"'");
            pps.executeUpdate();
            return true;
         
        } catch (SQLException ex) {
                             if (ex.getErrorCode()==1062) {
                                 System.out.println("2");
                                 return false;
                                 
                             }else{
                                 System.out.println(ex.getMessage());
                        return false;         
                    }   
               //Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public java.sql.Date buscarUltimaRealizada(String equipo){
        try { 
            PreparedStatement ps = new Conector().getConn().prepareStatement(              
                "select acciones.fecha_accion as ultFecha"
                        + " from mantenciones"
                        + " inner join acciones"
                        + " on k_mantencion = fk_mantencion"
                        + " where mantenciones.fk_equipo = '"+equipo+"'"
                        + " and mantenciones.realizada = 1"
                        + " order by acciones.fecha_accion desc");
            
            ResultSet rs = ps.executeQuery();
            rs.next();
                return rs.getDate("ultFecha");
            
           
         
        } catch (SQLException ex) {
                             if (ex.getErrorCode()==1062) {
                                 System.out.println("2");
                                 return null;
                                 
                             }else{
                                 System.out.println(ex.getMessage());
                                 return null;
                             }   
               //Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    
}
