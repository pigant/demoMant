/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Manteciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            String user, String solicitante, int ot, String correo) throws SQLException{
          PreparedStatement ps = null;
          Connection dbCon = null;
          PreparedStatement psA = null;
          boolean r = false;
          Connection dbCont = null;
        try { 
               dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(            
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
            
            dbCont = new Conector().getConn();
            psA = dbCon.prepareStatement(               
                "insert into acciones (fk_mantencion, fecha_accion, acciones,"
                        + " responsable) VALUES (?,?,?,?)");
            psA.setInt(1,new BLL.Manteciones(name).buscarUltimaKey());
            psA.setDate(2,fecha);
            psA.setString(3,"Aun no realizada" );
            psA.setString(4, "BKB");
            psA.executeUpdate();
            
             
             
            r = true;
            
        } catch (SQLException ex) {
                             if (ex.getErrorCode()==1062) {
                                 System.out.println("2");
                                 return false;
                                 
                             }else{
                                 System.out.println(ex.getMessage());
                        r =  false;         
                    }   
               //Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

			if (ps!= null) {
				ps.close();
			}

			if (dbCon != null) {
				dbCon.close();
			}

		}
        return r;
            
    }
    public String buscarUltima(String equipo, int mantFk) throws SQLException{
        
        String causa = "nada";
        PreparedStatement ps = null;
        Connection dbCon = null;
        try {
            
            dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement( 
            "select causa from mantenciones where fk_equipo = '"+equipo+"'"
                    + " and k_mantencion = "+mantFk+" "
                    + " order by k_mantencion desc");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                causa = rs.getString("causa");
            }
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
           
        }finally {

			if (ps!= null) {
				ps.close();
			}

			if (dbCon != null) {
				dbCon.close();
			}

		}
        return causa;
        
    }
    
    public int buscarUltimaKey(String equipo) throws SQLException{
        int mantK = 0;
        PreparedStatement ps = null;
        Connection dbCon = null;
        try {
            
            dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(
            "select k_mantencion from mantenciones where fk_equipo = '"+equipo+"'"
                +" and realizada = 0"
                    + " order by k_mantencion desc");
        
            ResultSet rs = ps.executeQuery();
            rs.next(); 
             
               mantK = rs.getInt("k_mantencion");
            
            this.mantk = mantk;
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            this.mantk = mantk;
            
        }finally {

			if (ps!= null) {
				ps.close();
			}

			if (dbCon != null) {
				dbCon.close();
			}

		}
        return mantK;
    }
    public int buscarUltimaNoRealizada(String equipo) throws SQLException{
        int mantK = 0;
        PreparedStatement ps = null;
        Connection dbCon = null;
        try {
            
            dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(
            "select k_mantencion,fecha, n_ot from mantenciones where fk_equipo = '"+equipo+"'"
                +" and realizada = 0"
                    + " order by fecha asc");
        
            ResultSet rs = ps.executeQuery();
                rs.next();
        
                mantK = rs.getInt("k_mantencion");
                this.fecha = rs.getDate("fecha");
                this.nOt = rs.getInt("n_ot");
                this.mantk = mantk;
              
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            this.mantk = mantk;
           
        }finally {

			if (ps!= null) {
				ps.close();
			}

			if (dbCon != null) {
				dbCon.close();
			}

		}
        return mantK;
        
    
    }
      public boolean update(String comentario,int kMant, java.sql.Date fecha, 
            String responsable) {
        boolean r = false;
          PreparedStatement ps = null;
        Connection dbCon = null;
        try {
            
            dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(
            "update mantenciones set comentario = ?,fecha = ?  where k_mantencion = "+kMant);
            ps.setString(1, comentario +" responsable: "+responsable);
            ps.setDate(2, fecha);
            ps.executeUpdate();
            
            PreparedStatement psa = new Conector().getConn().prepareStatement(
            "update acciones set fecha_accion = ?  where fk_mantencion = "+kMant);
            psa.setDate(1, fecha);
            psa.executeUpdate();
            r = true;  
        
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {

			if (ps!= null) {
                            try {
                                ps.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			if (dbCon != null) {
                            try {
                                dbCon.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

		}
        
        return r;
    }
      
    
    public ArrayList listNoRealizadas() {
        ArrayList<String> al = new ArrayList();
        
        PreparedStatement ps = null;
        Connection dbCon = null;
        try {
            
            dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(
                    "SELECT nombre FROM equipos "
                            + "INNER JOIN mantenciones "
                            + "on equipos.nombre = mantenciones.fk_equipo "
                            + "WHERE equipos.fk_area = 1 AND "
                            + "equipos.fk_tipo = 1 AND "
                            + "mantenciones.realizada = 0" );
            
            ResultSet rsa = ps.executeQuery();
            while (rsa.next()) {
                al.add(rsa.getString("nombre"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
            al = null;
           
        }finally {

			if (ps!= null) {
                            try {
                                ps.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			if (dbCon != null) {
                            try {
                                dbCon.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

		}
        return al;
    
    }
    public Date getFecha() {
        return fecha;
    }

    public int getnOt() {
        return nOt;
    }
    
}