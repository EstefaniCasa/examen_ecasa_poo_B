/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

public class empresa extends Persona{
   
    
 private String nombreempresa;
   
    public empresa() {
        
    }

    public empresa(String Nombreempresa, String nombre, String nombre2, String apellido1, String apellido2, String ci, String telefono, String correo, String direccion, String fechadenacimiento, String sueldomes) {
        super(nombre, nombre2, apellido1, apellido2, ci, telefono, correo, direccion, fechadenacimiento, sueldomes);
        this.nombreempresa = nombreempresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.nombreempresa = NombreEmpresa;
    }

    public String getnombreempresa() {
        return nombreempresa;
    }
    

    
    
    
    @Override
    public String toString() {
        return "nombre empresa: "
                + "el nombre de la empresa es: \n" +getnombreempresa();
       
  
    }
}
    


