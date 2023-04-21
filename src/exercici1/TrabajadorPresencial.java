package exercici1;

import java.util.Scanner;

public class TrabajadorPresencial extends Trabajador{
    private static double gasolina = 50.0;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Deprecated
    public String presencial() {
        String mensaje = "Soy un trabajador de modalidad presencial";
        return mensaje;
    }

    @Override
    public double calcularSueldo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas");
        double horas = entrada.nextDouble();
        return (horas * super.getPrecioHora())+gasolina;
    }



}

