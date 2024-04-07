package clases;

public class Perfume extends Producto {
    private int cantidad;

    public Perfume(int id, String tipo, String nombre, int cantidad) {
        super(id, tipo, nombre);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}