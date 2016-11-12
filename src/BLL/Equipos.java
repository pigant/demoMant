/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author ferna
 */
import DAL.EquiposDAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import static java.util.concurrent.TimeUnit.DAYS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
public class Equipos {
private String info;
private String nombre;
private String imagen;
    public Equipos(String nombre) {
    this.nombre = nombre.toLowerCase();
    }

    public Equipos() {
    }
    
    public Map<String,String> readInfo(){
        EquiposDAL ed = new EquiposDAL();
        Map<String,String> info = new HashMap();
    try {
        info = ed.readInfo(nombre);
        
    } catch (SQLException ex) {
        Logger.getLogger(Equipos.class.getName()).log(Level.SEVERE, null, ex);
    }
        return info;
    }

    public String getImagen() {
        return imagen;
    }

    public String getInfo() {
        return info;
    }
    
    public ArrayList busquedaEquipos(ArrayList<JButton> b){
    Date date = new java.util.Date();
    Calendar cal = Calendar.getInstance();
    Calendar calendar =Calendar.getInstance(); 
            calendar.add(Calendar.DATE, -3); 
    date = calendar.getTime();
        System.out.println(date);
    ArrayList<String> al = new ArrayList();
    boolean r = false;
    EquiposDAL eq = new EquiposDAL();
    try {
        al = eq.aviso();
    } catch (SQLException ex) {
        Logger.getLogger(Equipos.class.getName()).log(Level.SEVERE, null, ex);
    }
    for (JButton x :b){
            try {
            Map d = eq.busquedasEquipos(x.getName().toLowerCase());
                //System.out.println(d.keySet());
            if(d.get("fecha")!= null){
                
            Date fecha = (Date) d.get("fecha");
           r = (Boolean) d.get("realizada");
                System.out.println(fecha+" "+r+" "+d.get("nombre").toString());
            if(r && fecha.before(date)){
                System.out.println(r);
                al.add(d.get("nombre").toString());
                System.out.println(d.get("nombre").toString());
            }
            }
            
            
            
            
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Equipos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    return al;
    }
}
