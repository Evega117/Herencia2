
package herencia2;

public class Directivo extends Empleado {
    int sueldo;
    int bono;
    public Directivo(String nombre,int sueldo,int bono) {
        super(nombre);
        this.sueldo=sueldo;
        this.bono=bono;
    }
    public void mostrarDirectivo()
    {
        int totalDirectivo;
        System.out.println("Ingrese el sueldo:");
        sueldo=teclado.nextInt();
        System.out.println("Ingrese el bono:");
        bono=teclado.nextInt();
        totalDirectivo=sueldo+bono;
        System.out.println("El Sueldo total es:"+totalDirectivo);
    }
    
}
