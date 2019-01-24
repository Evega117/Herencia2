
package herencia2;


public class Oficial extends Operario {
    int horasextras;
    public Oficial(String nombre, int sueldo, int bono,int horasextras) {
        super(nombre, sueldo, bono);
        this.horasextras=horasextras;
    }
    public void  mostrarOficial()
    {
        int horasOficial;
    int totalOficial;
        System.out.println("Ingrese el sueldo:");
        sueldo=teclado.nextInt();
        System.out.println("Ingrese las horas extras:");
        horasextras=teclado.nextInt();
        System.out.println("Ingrese el valor de las horas:");
        bono=teclado.nextInt();
        horasOficial=horasextras*bono;
        totalOficial=sueldo+horasOficial;
        System.out.println("El Sueldo total es:"+totalOficial);
    }
}
