/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARR
 */
public class UsuarioDAL {
    private String nombre;
    private String empresa;

    public UsuarioDAL() {
    }

    public String getEmpresa() {
        return empresa;
    }
    
    
    public boolean readUser(String nombre, String pass){
        
        try {
            PreparedStatement ps = new Conector().getConn().prepareStatement(
                    "select count(nombre) as c, nombre, empresa from usuario where nombre = '"+nombre+"'"
                            +" and contraseña = '"+pass+"' ");
            ResultSet rs = ps.executeQuery();
            rs.next();
            if (rs.getInt("c")== 1) {
                this.nombre = rs.getString("nombre");
                this.empresa = rs.getString("empresa");
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
}
