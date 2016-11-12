/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferna
 */

public class EquiposDAL {
private String info;
private String imagen;

    public EquiposDAL() {
    }

    public Map<String,String> readInfo(String nombre) throws SQLException{
        Map<String,String> info = new HashMap();
        PreparedStatement ps = null;
        Connection dbCon = null;
         try {
             dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(              
                "select informacion,imagen from equipos where equipos.nombre = '"+nombre+"' ");
            ResultSet rs = ps.executeQuery();
            rs.next();
                info.put("informacion",rs.getString("informacion")) ;
                info.put("imagen",rs.getString("imagen"));
           
         
        } catch (SQLException ex) {
                           
                  Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);              
                                 
                             
                                 
                             }
         finally {

			if (ps!= null) {
				ps.close();
			}

			if (dbCon != null) {
				dbCon.close();
			}

		}
               //Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
               return info;
    }
    public Map busquedasEquipos(String equipo) throws SQLException{
        Map al = new HashMap(); 
        PreparedStatement ps = null;
        Connection dbCon = null;
         try {
             dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(              
                "SELECT e.nombre,a.realizada, a.fecha_accion from equipos e "+
                    "inner join mantenciones m on e.nombre = m.fk_equipo "+
                    "INNER JOIN acciones a on m.k_mantencion = a.fk_mantencion "+
                    "where e.nombre = '"+equipo+"' "+
                    "order by a.fecha_accion DESC " +
                    "limit 1");
            
            ResultSet rs = ps.executeQuery();
             rs.next();
             //System.out.println(rs.getString("nombre"));
                al.put("nombre",rs.getString("nombre"));
                al.put("fecha",rs.getDate("fecha_accion"));
                al.put("realizada",rs.getBoolean("realizada"));
         
        } catch (SQLException ex) {
                           //System.out.println(ex.getMessage());
                           al.put("fecha",null);
                                
                                 
                             
                                 
         }finally {

			if (ps!= null) {
				ps.close();
			}

			if (dbCon != null) {
				dbCon.close();
			}

		}
         return al;
               //Logger.getLogger(MantencionesDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    public String getImagen() {
        return imagen;
    }

    public String getInfo() {
        return info;
    }
    
    public ArrayList aviso() throws SQLException{
    ArrayList<String> al = new ArrayList();
  
    PreparedStatement ps = null;
    Connection dbCon = null;
        try {
              dbCon = new Conector().getConn();
            ps = dbCon.prepareStatement(
            "Select nombre from equipos "
                    + "left join mantenciones on "
                    + "equipos.nombre = mantenciones.fk_equipo "
                    + "where equipos.fk_area = 1 and "
                    + "equipos.fk_tipo = 1 "
                    + "and mantenciones.fk_equipo is null" );
        
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                al.add(rs.getString("nombre"));
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
          return al;
      
      }  
    
    }
