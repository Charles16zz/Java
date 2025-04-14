package java_charles;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args ) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al Sistema");
		System.out.println("1. Calculadora");
		System.out.println("2. Abrir google");
		System.out.println("3. off kape");
		System.out.println("0. Salir");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1 :
			System.out.println("Abriendo Calculadora"); 
			Runtime.getRuntime().exec("calc");
		break;
		case 2 :
			System.out.println("Abriendo Google");
			Runtime.getRuntime().exec("chrome");
		break;
		case 3 :
			System.out.println("Hasta Pronto...");
			Runtime.getRuntime().exec("shutdowm -s -t 600");
		break;
		case 0 :
				System.out.println("Sin dolor no hay gloria");

		break;
		default :
			System.out.println ("bye bye");
			break;
			
			
		}
	}


}
