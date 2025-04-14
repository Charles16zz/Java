package Pokemon;

public class Test {
 
	public static void main(String[] args) {
	Tipo telec = new Tipo("Electrico");
	Tipo tfuego = new Tipo("fuego");
	Pokemon Raikou = new Pokemon(telec, "Raiko",120,20,30,55);
	Pokemon Entei = new Pokemon(tfuego, "Entei",135,18,32,50);
	
	//arranca el torneo
	Combate mortalCombat = new Combate(Raikou, Entei);
	
	mortalCombat.iniciar();
	}
}