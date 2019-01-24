
package herencia2;


public class Operario extends Empleado{
    int sueldo;
    int bono;
    public Operario(String nombre,int sueldo,int bono) {
        super(nombre);
        this.sueldo=sueldo;
        this.bono=bono;
    }
    public void mostrarOperario()
    {
        int totalOperario;
        
      
        System.out.println("Ingrese el sueldo:");
        sueldo=teclado.nextInt();
        System.out.println("Ingrese el bono:");
        bono=teclado.nextInt();
        totalOperario=sueldo+bono;
        System.out.println("El Sueldo total es:"+totalOperario);
        
    }
    
}
