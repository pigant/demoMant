/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.Color;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author CARR
 */
public class Manteciones {
    private String causa;
    private String name;
    private java.util.Date fecha;
    private String user;
    private String solicitante;
    private boolean ok;
    private int nOt;
    private String correo;
    public Manteciones() {
    }
    
    
    public Manteciones(String name) {
        this.name = name.toLowerCase();
    }
    
    public boolean Manteciones(String name, String causa, java.util.Date fecha, 
            String user, String solicitante, String ot, String correo) {
         this.causa = causa;
            if(this.causa.isEmpty()){
                return false;
            }
        
        this.name = name.toLowerCase();
        
        this.user = user;
        this.solicitante = solicitante;
            if(this.solicitante.isEmpty()){
                return false;
            }
        this.setFecha(fecha);
        
        this.correo = correo;
        
        try{
            this.nOt = Integer.parseInt(ot);
            return new DAL.MantencionesDAL().create(this.name, this.causa, 
                this.setSqlFecha(this.fecha), this.user, this.solicitante,
            this.nOt, this.correo);
           }catch(Exception ex){
               return false;
           }
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setCausa(String causa) {
        this.causa = causa;
    }

    public void setFecha(Date fecha) {
        System.out.println("la fehca" + fecha);
        this.fecha = fecha;
    
    }
    public java.sql.Date setSqlFecha(Date fecha){
        System.out.println(fecha);   
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        System.out.println(sqlDate);
     return sqlDate;
    }

    public String getName() {
        return name;
    }
    
    public String getCausa() {
        
        return causa;
    }
    public int buscarUltimaKey(){
        
        return new DAL.MantencionesDAL().buscarUltimaKey(this.name);
    }
    
    public String buscarUltima(int mantK){
        
        return new DAL.MantencionesDAL().buscarUltima(this.name, mantK);
    }
    
    public int buscarUltimaNoRealizada(){
        DAL.MantencionesDAL mantDal = new DAL.MantencionesDAL();
        
        int mK;
        mK = mantDal.buscarUltimaNoRealizada(this.name);
        this.fecha = mantDal.getFecha();
        this.nOt = mantDal.getnOt();
        return mK;
    }

    public Date getFecha() {
        return fecha;
    }
    public Color colorear(){
        int c = this.buscarUltimaNoRealizada();
        System.out.println(c);
       if(c == 0){
         
            return Color.GREEN;
       }else{
           return Color.RED;
       }
       
    }

    public int getnOt() {
        return nOt;
    }
            
    
         
    
    
     
}
