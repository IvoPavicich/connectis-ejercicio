
package productos;
public class Shampoo extends Producto{
    
    int contenido;
    
    public Shampoo(String nombre, int contenido, int precio){
        super(nombre,precio);
        this.contenido = contenido;
    }
    @Override
    public String toString(){
        return  super.toString()+"Contenido: " + contenido + "ml /// " +"Precio:  $" + precio;
    }
    
}
