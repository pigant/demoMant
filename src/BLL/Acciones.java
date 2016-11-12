/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.Date;

/**
 *
 * @author CARR
 */
public class Acciones {
    private String accion;
    private int accionKey;
    private int mantencionFk;
    private java.util.Date fecha;
    private String mantFecha;
    private int nOt;
    public Acciones() {
       
    }
    
    public boolean realizarMant(String accion, java.util.Date fecha, 
            String responsable){
        try{
        if (this.mantencionFk > 0 && !responsable.isEmpty()){
            
            return new DAL.AccionesDAL().create(accion, this.mantencionFk,
                        new Manteciones().setSqlFecha(fecha),responsable);
         }else{
            return false;
        }
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public String buscarUltimaMant(String equipo){
        
        Manteciones mant = new Manteciones(equipo);
                
        this.mantencionFk = mant.buscarUltimaNoRealizada();
                
        this.mantFecha = mant.getFecha().toString();
        this.nOt = mant.getnOt();
        return mant.buscarUltima(this.mantencionFk);

    }

    public int getMantencionFk() {
        return mantencionFk;
    }
    
    public String getMantFecha() {
        return mantFecha;
    }
       
    public void buscarUltimaRealizada(String equipo){
            new DAL.AccionesDAL().buscarUltimaRealizada(equipo);
}

    public int getnOt() {
        return nOt;
    }
    
}
