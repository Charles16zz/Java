package java_charles;

import java.util.Scanner;

public class EntradaSalida {
 public static void main (String[] args){
//entrada estandar
Scanner sc; //declaracion
sc = new Scanner(System.in); 
float imc, estaturaMetros, pesokg;
System.out.println("calculadora de IMC");
System.out.println("ingrese su peso en kg");
pesokg = sc.nextFloat();
System.out.println("ingrese su estatura en metros");
estaturaMetros = sc.nextFloat();
//operacion aritmetica 
imc = pesokg / (estaturaMetros *estaturaMetros);
System.out.println ("Tu IMC es " + imc );
}
}