
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.cliente; 
import ec.edu.intsuperior.modelo.empleado;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class aplicacion {
    
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new cliente();
        
        
        p1.setCi(JOptionPane.showInputDialog("Ingresa numero de cedula"));
        p1.setNombre(JOptionPane.showInputDialog("Ingresa Nombre 1"));
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa nombre 2 "));
        p1.setApellido1(JOptionPane.showInputDialog("Ingresa apellido 1  "));
        p1.setApellido2(JOptionPane.showInputDialog("Ingresa apellido 2"));
        p1.setCorreo(JOptionPane.showInputDialog("Ingresa correo  "));
        p1.setDireccion(JOptionPane.showInputDialog("Ingresa direccion "));
        p1.setTelefono(JOptionPane.showInputDialog("Ingresa telefono  "));
        p1.setFechadenacimiento(JOptionPane.showInputDialog("Ingresa edad  "));
        {
        JOptionPane.showMessageDialog(null, p1.toString());
        }       
        
        
        
        
        
        
    String nombre=JOptionPane.showInputDialog("Nombre del trabajador");
    String profesion=JOptionPane.showInputDialog("Profesion");
int dt=Integer.parseInt(JOptionPane.showInputDialog("Dias trabajados"));
double pd=Double.parseDouble(JOptionPane.showInputDialog("Pago por dia"));
     
     double sb=0,aux;

 //Para conocer el salario bruto
        if(dt>30){
            double tn=15*pd;
           
            double sx=(pd*15);
            sb=sx+tn;
        }else{
            sb=dt*pd;
        }
     JOptionPane.showMessageDialog(null,"Trabajador: "+nombre+"\n"
             + "Profesion: "+profesion+"\n"
                     +"Dias trabajdos: "+dt+"\n"
             + "Sueldo bruto: "+sb+"\n");
        
    }

}

