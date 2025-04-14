package java_charles;

public class NumeroPar {
public static void main(String[] args) {
	for(int x = 1; x <= 100 ; x++ ) 
		if (x % 8 == 1) {
			System.out.print(" | " + x );
		}
}
}

