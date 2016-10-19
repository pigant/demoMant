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
public class Usuarios {
    private String nombre;
    private String empresa;

    public Usuarios() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    public int setAccesos(){
        if (this.empresa.equals("sopraval")){
            return 1;
        }else if (this.empresa.equals("bkb")){
        return 2;
        }else{
        return 0;        
        }
    }
    public boolean isBkb(){
        System.out.println(this.empresa);
        if (this.empresa.equals("bkb")){
        return true;
        
        }else{
        return false;
        }
    
    }
      
    public boolean readUser(String nombre, String pass){
        DAL.UsuarioDAL user = new DAL.UsuarioDAL();
        if (user.readUser(nombre.toLowerCase(), pass)){
            this.nombre = nombre;
            this.empresa = user.getEmpresa();
            
            return true;
        
        }else{
        return false;
        }
     }
    
}
