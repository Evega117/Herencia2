
package herencia2;


public class Tecnico extends Operario{
    int horasextras;
    int bono1=10;
    public Tecnico(String nombre, int sueldo, int bono,int horasextras,int bono1) {
        super(nombre, sueldo, bono);
        this.horasextras=horasextras;
        this.bono1=bono1;
    }
    public void mostrarTecnico()
    {
    int horasOficial;
    int totalOficial;
        System.out.println("Tiene un bono de:"+bono1);
        System.out.println("Ingrese el sueldo:");
        sueldo=teclado.nextInt();
        System.out.println("Ingrese las horas extras:");
        horasextras=teclado.nextInt();
        System.out.println("Ingrese el valor de las horas:");
        bono=teclado.nextInt();
        horasOficial=horasextras*bono;
        totalOficial=sueldo+horasOficial+bono1;
        System.out.println("El Sueldo total es:"+totalOficial);
    }
}
