package clases;

public class Perfumeria extends Producto{
    private int cantidad;

    public Perfumeria(int idProducto, String tipoProducto, String nombre, int cantidad) {
        super(idProducto, tipoProducto, nombre);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
