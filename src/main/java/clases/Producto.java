package clases;

public class Producto {
    protected int idProducto;
    protected String tipoProducto;
    protected String nombre;

    public Producto(int idProducto, String tipoProducto, String nombre) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
