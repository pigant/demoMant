/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class Conector {
    
    private Connection conn;

    public Conector() {
        this.getConexion();
    }

    public Connection getConn() {
        return conn;
    }

    public void getConexion() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/demo"
                   ,"root","");
             //Class.forName("com.mariadb.jdbc.Driver");
          // this.conn = DriverManager.getConnection("jdbc:mariadb://"
                   //+ "localhost:3306/demo?user=root&password=");
            //this.conn = DriverManager.getConnection("jdbc:mariadb://localhost3306/demo"
             //     ,"root","");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        //} catch (ClassNotFoundException ex) {
        //    Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
  
}
