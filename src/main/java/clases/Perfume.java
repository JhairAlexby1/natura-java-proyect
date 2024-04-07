package clases;

public class Perfume extends Producto {
    private int cantidad;

    public Perfume(int idProducto, String tipoProducto, String nombre, int cantidad) {
        super(idProducto, tipoProducto, nombre);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
public String toString() {
    return "Perfume{" +
            "idProducto=" + idProducto +
            ", tipoProducto='" + tipoProducto + '\'' +
            ", nombre='" + nombre + '\'' +
            ", cantidad=" + cantidad +
            '}';
}
}