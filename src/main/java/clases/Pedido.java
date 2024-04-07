package clases;

import java.util.ArrayList;

public class Pedido {
    private static Pedido instance = null;
    private ArrayList<Producto> productos;

    private Pedido() {
        this.productos = new ArrayList<>();
    }

    public static Pedido getInstance() {
        if (instance == null) {
            instance = new Pedido();
        }
        return instance;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}