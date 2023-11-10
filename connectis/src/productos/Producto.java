package productos;

public abstract class Producto implements Comparable<Producto> {

    protected String nombre;
    protected int precio;

    public Producto() {
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// ";
    }

    @Override
    public int compareTo(Producto producto) {
        return Integer.compare(this.getPrecio(), producto.getPrecio());
    }

}


