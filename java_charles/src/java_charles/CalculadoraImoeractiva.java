package java_charles;

import java.util.Scanner;

public class CalculadoraImoeractiva {
 public static void main(String[] args) {
	 float a, b;
	Scanner sc = new Scanner(System.in);
	 System.out.println("operaciones con dos números");
	 System.out.println("Primer Número");
	 a = sc.nextFloat();
	 System.out.println("Segundo Número");
	 b = sc.nextFloat();
	 System.out.println(a + " + " + b + " = "+ sumar(a,b));
	 System.out.println(a + " - " + b + " = "+ restar(a,b));
	 System.out.println(a + " * " + b + " = "+ multiplicar(a,b));
	 System.out.println(a + " / " + b + " = "+ dividir(a,b));
 }
 
 //función sumar
 public static double sumar(double x, double y) {
	 return x + y;
}
 public static double restar(double x, double y) {
	return x - y ;
}	
public static double multiplicar(double x, double y) {
	return x * y ;
}
public static double dividir(double x, double y) {	
	if(y != 0) {
	return x / y ;	
}else {
	System.out.println("division por cero");
	return 0;
}
}
}