package exercici1;

import java.util.Scanner;

public class TrabajadorOnline extends Trabajador{

    private static final double TARIFAINTERNET = 30;

    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }


    @Override
    public double calcularSueldo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas");
        double horas = entrada.nextDouble();
        return (horas * super.getPrecioHora())+TARIFAINTERNET;
    }


}
