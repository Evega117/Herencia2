
package herencia2;

import java.util.Scanner;

public class Empleado {
    Scanner teclado=new Scanner(System.in);
   String nombre;

    public Empleado(String nombre) {
           
        this.nombre = nombre;
    }
   public void mostrarEmpleado()
   {
  
        System.out.println("Nombre:"+nombre);
   }
}
