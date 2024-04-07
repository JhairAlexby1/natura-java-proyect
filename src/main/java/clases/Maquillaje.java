package clases;

public class Maquillaje extends Producto {
    private int cantidad;

    public Maquillaje(int idProducto, String tipoProducto, String nombre, int cantidad) {
        super(idProducto, tipoProducto, nombre);
        this.cantidad = cantidad;
    }

    @Override
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "id=" + getId() +
                ", tipo='" + getTipo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}