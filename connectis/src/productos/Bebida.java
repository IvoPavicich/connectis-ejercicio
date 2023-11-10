package productos;

public class Bebida extends Producto{

    private double litros;


    public Bebida(String nombre,double litros ,int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    @Override
    public String toString(){
        return   super.toString() +"Litros: " + litros + " /// " +"Precio:  $" + precio;
    }

   

    
    
    
}
