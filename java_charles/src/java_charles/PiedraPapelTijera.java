package java_charles;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
public static void main(String[] args) {
	int aleatorio, opcion;
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	do {
	//piedra 1, papel 2, tijera 3
		System.out.println("Elige:");
		System.out.println("1. Piedra\n2.Papel\n3.Tijeras\n0. Salir\nOpcion:");
		opcion = sc.nextInt();
		aleatorio = rand.nextInt(1,4);
	switch(opcion) {
	case 1:
		System.out.println("Elegiste PIEDRA");
break;
	case 2:
		System.out.println("Elegist PAPEL");
break;
	case 3:
		System.out.println("Elegiste TIJERA");
break;
 default:
	 System.out.println("Veo que ya no quieres jugar ;(");
	}
switch(aleatorio)  {
case 1: 
	System.out.println("Yo Elegi PIEDRA");
	break;
case 2:
	System.out.println("Yo Elegi PAPEL");
    break;
case 3:
	System.out.println("Yo Elegi PIEDRA");
	break;
default:
	System.out.println("Yo Elegi PIEDRA");

}
	
if(opcion == 2 && aleatorio == 1) {
	System.out.println("Haz ganado (°-°) ");
}else if (opcion == 3 && aleatorio == 2) {
	System.out.println("Haz ganado (°-°)");
}else if (opcion == 1 && aleatorio == 3) {
	System.out.println("Haz ganado (°-°)");
}else if(opcion == 1 && aleatorio == 2) {
	System.out.println("You Louse :( ");
}else if (opcion == 3 && aleatorio == 1) {
	System.out.println("You Louse :(");
}else if (opcion == 2 && aleatorio == 3) {
	System.out.println("You Louse :(");
}else if(opcion == aleatorio) {
	System.out.println("Opa Empate UwU");
}
	}while (opcion != 0);
}
}
	

	
	
	
	