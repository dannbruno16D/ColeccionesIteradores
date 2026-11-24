import java.util.ArrayList;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        // Se define el parámetro de tipo <String> para hacer genérica la lista
        List<String> listaDeCompras = new ArrayList<>(); 
        
        // Agregamos elementos a la lista (tienen que ser String)
        listaDeCompras.add("Leche");
        listaDeCompras.add("Huevos");
        listaDeCompras.add("Pan");
        
        // listaDeCompras.add(5); 
        // ^ Si intentamos agregar un número (Integer), el compilador marcará error.

        // Al recuperar los datos, Java ya sabe que son String.
        // No hay necesidad de hacer conversiones manuales (casts).
        String primerArticulo = listaDeCompras.get(0);
        
        System.out.println("El primer artículo a comprar es: " + primerArticulo);
    }
}