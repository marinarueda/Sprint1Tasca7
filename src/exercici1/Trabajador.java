package exercici1;

public abstract class Trabajador {
    private String nombre;
    private String apellido;
    private double precioHora;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public abstract double calcularSueldo();


}

