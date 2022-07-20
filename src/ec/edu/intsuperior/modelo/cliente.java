package ec.edu.intsuperior.modelo;





public class cliente extends Persona{
    private String Telefonocontacto;
    
    public cliente (){
    }

    public cliente(String Telefonocontacto, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, int edad, String direccion) {
      super(nombre1, nombre2, apellido1, apellido2, correo, telefono, correo, direccion, Telefonocontacto, telefono);
        this.Telefonocontacto = Telefonocontacto;
    }

    public void setTelefonocontacto(String Telefonocontacto) {
        this.Telefonocontacto = Telefonocontacto;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }

   
     
    @Override
    public String toString() {
        return super.toString(); 
    
    }
}