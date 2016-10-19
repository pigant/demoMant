/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Manteciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CARR
 */
public class MantencionesDAL {
    private int mantk;
    private java.util.Date fecha;
    private int nOt;
    /*
    CRUD
    */
    public boolean create(String name, String causa, java.sql.Date fecha, 
            String user, String solicitante, int ot, String correo){
          
        try { 
            PreparedStatement ps = new Conector().getConn().prepareStatement(              
                "insert into mantenciones (fk_equipo, causa, fecha, fk_usuario,"
                        + " solicitante, n_ot, correo_solicitante) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,causa);
            ps.setDate(3, fecha);
            ps.setString(4, user);
            ps.setString(5, solicitante);
            ps.setInt(6, ot);
            ps.setString(7, correo);
            ps.executeUpdate();
            
            PreparedStatement psA = new Conector().getConn().prepareStatement(              
                "insert into acciones (fk_mantencion, fecha_accion, acciones,"
                        + " responsable) VALUES (?,?,?,?)");
            psA.setInt(1,new BLL.Manteciones(name).buscarUltimaKey());
            psA.setDate(2,fecha);
            psA.setString(3,"Aun no realizada" );
            psA.setString(4, "BKB");
            psA.executeUpdate();
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
    public String buscarUltima(String equipo, int mantFk){
        
        String causa = "nada";
        try {
            
            PreparedStatement ps = new Conector().getConn().prepareStatement(
            "select causa from mantenciones where fk_equipo = '"+equipo+"'"
                    + " and k_mantencion = "+mantFk+" "
                    + " order by k_mantencion desc");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                causa = rs.getString("causa");
            }
            
            return causa;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return causa;
        }
        
    }
    
    public int buscarUltimaKey(String equipo){
        int mantK = 0;
        
        try {
            PreparedStatement ps = new Conector().getConn().prepareStatement(
            "select k_mantencion from mantenciones where fk_equipo = '"+equipo+"'"
                +" and realizada = 0"
                    + " order by k_mantencion desc");
        
            ResultSet rs = ps.executeQuery();
            rs.next(); 
             
               mantK = rs.getInt("k_mantencion");
            
            this.mantk = mantk;
            return mantK;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            this.mantk = mantk;
            return mantK;
        }
    }
    public int buscarUltimaNoRealizada(String equipo){
        int mantK = 0;
        
        try {
            PreparedStatement ps = new Conector().getConn().prepareStatement(
            "select k_mantencion,fecha, n_ot from mantenciones where fk_equipo = '"+equipo+"'"
                +" and realizada = 0"
                    + " order by fecha asc");
        
            ResultSet rs = ps.executeQuery();
                rs.next();
        
                mantK = rs.getInt("k_mantencion");
                this.fecha = rs.getDate("fecha");
                this.nOt = rs.getInt("n_ot");
                this.mantk = mantk;
            return mantK;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            this.mantk = mantk;
            return mantK;
        }
        
    
    }

    public Date getFecha() {
        return fecha;
    }

    public int getnOt() {
        return nOt;
    }
    
}