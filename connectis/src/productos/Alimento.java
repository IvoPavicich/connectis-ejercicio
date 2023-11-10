package productos;

public class Alimento extends Producto{
    
    private String unidad;

    public Alimento() {
    }
    
    
    public Alimento(String nombre, int precio, String unidad){
        super(nombre,precio);
        this.unidad = unidad;
    }
    
    @Override
    public String toString(){
        return super.toString()+"Precio:  $" + precio + " /// " +"Unidad de venta: " + unidad;
    }
}
