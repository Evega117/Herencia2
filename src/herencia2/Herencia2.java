package herencia2;
import java.util.Scanner;
public class Herencia2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
      String nombre;
       int horasextras = 0;
       int sueldo = 0;
       int bono = 0;
       int bono1 = 10;
       int op;
       System.out.println("Ingrese el nombre");
        nombre=teclado.next();         
        System.out.println("\tMENU");
        System.out.println("1. Operario");
        System.out.println("2. Directivo");
        System.out.println("3. Oficial");
        System.out.println("4. Tecnico");
        System.out.println("Elija una Opcion:");
        op=teclado.nextInt();
       switch(op)
       {
           case 1:
               System.out.println("\t Operario");
               System.out.println("Nombre:"+nombre);
               Operario obj2;
               obj2=new Operario(nombre,sueldo,bono);
               obj2.mostrarOperario();
               break;
           case 2:
               System.out.println("\t Directivo");
               System.out.println("Nombre:"+nombre);
               Directivo obj3;
               obj3=new Directivo(nombre,sueldo,bono);
               obj3.mostrarDirectivo();
               break;
           case 3:
               System.out.println("\t Oficial");
               System.out.println("Nombre:"+nombre);
               Oficial obj4;
               obj4=new Oficial(nombre,sueldo,bono,horasextras);
               obj4.mostrarOficial();
               break;
           case 4:
               System.out.println("\t Tecnico");
               System.out.println("Nombre:"+nombre);
               Tecnico obj5;
               obj5=new Tecnico(nombre,sueldo,bono,horasextras,bono1);
               obj5.mostrarTecnico();
               break;
       }
    }
    
}
