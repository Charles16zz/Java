package coleccion;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<>();
		
		// Agregar productos
		productos.add(new Producto(1, "Laptop", 1200.99));
		productos.add(new Producto(2, "Mouse", 20.50));
		productos.add(new Producto(3, "Teclado", 45.00));
	
	   //Mostrar productos
		System.out.println("lista de Producto:");
		for (Producto p : productos) {
	        System.out.println(p);
		}
		//Buscar productopor código 
		int codigoBuscado =2;
		for(Producto p: productos) {
		   if (p.getCodigo() == codigoBuscado) {
			   System.out.println("\nProducto encontrado: " + p);
			   break;
		   }
		}
       //Eliminar un producto
		productos.removeIf(p -> p.getCodigo() == 1);
		System.out.println("\nLista después de eliminar producto con código 1:");
		for (Producto p : productos) {
			System.out.println(p);
		}
	}
		}
