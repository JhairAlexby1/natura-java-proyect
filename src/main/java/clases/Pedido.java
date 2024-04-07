package clases;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
}