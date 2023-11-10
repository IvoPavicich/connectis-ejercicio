package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import productos.Alimento;
import productos.Bebida;
import productos.Producto;
import productos.Shampoo;

public class Main {

    private static List<Producto> cargarProductos() {
        
        List<Producto> productos = new ArrayList<>();

        productos.add(new Bebida("Coca-Cola Zero",1.5, 20));
        productos.add(new Bebida("Coca-Cola",1.5,18));
        productos.add(new Shampoo("Shampoo", 500,19));
        productos.add(new Alimento("Frutillas",64, "kilo"));
        
        return productos;
    }
    private static void imprimirProductos(List<Producto> productos) {
        for (Producto p : productos) {
            System.out.println(p.toString());
        }
        System.out.println("===============================");
    }
    private static void imprimirProductoMasCaroYMasBarato(List<Producto> productos) {
        Producto masCaro = productos.stream().max(Producto::compareTo).orElse(null);
        Producto masBarato = productos.stream().min(Producto::compareTo).orElse(null);

        if (masCaro != null && masBarato != null) {
            System.out.println("Producto más caro: " + masCaro.getNombre());
            System.out.println("Producto más barato: " + masBarato.getNombre());
        } else {
            System.out.println("No se encontró el producto más caro o más barato.");
        }
    }   
   
    
    public static void main(String[] args) {
        
        List<Producto> productos = cargarProductos();     
        imprimirProductos(productos);
        imprimirProductoMasCaroYMasBarato(productos);
    } 
}
