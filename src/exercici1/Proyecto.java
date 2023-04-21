package exercici1;

public class Proyecto {
    public static void main(String[] args) {

        TrabajadorPresencial trabajador1 = new TrabajadorPresencial("Martin", "Rueda", 10.0);
        double sueldo = trabajador1.calcularSueldo();
        System.out.println("El sueldo de " + trabajador1.getNombre() + " " + trabajador1.getApellido() + " es de " + sueldo + " euros.");

        TrabajadorPresencial presencial1 = new TrabajadorPresencial("Carlos", "Fernandez", 12);
        TrabajadorOnline online1 = new TrabajadorOnline("Carla", "Perez", 11);

        // Invocar métodos obsoletos con supresión de warnings



    }


}