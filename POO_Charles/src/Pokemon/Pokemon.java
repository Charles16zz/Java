package Pokemon;

public class Pokemon {
//Atributos
		String nombre;
		Tipo tipo;
		int nivelVida;// 0 Nokeado, 1000 vida maxima
		int velocidad;// 0 mas lento, 100 mas rapido	
        int poderDaño;// 10 mas debil, 90 mas Daño
        int poderDefensa;// 50 mas sensible, 100 mas fuerte
		//constructor
		public Pokemon(Tipo t, String  n, int nv, int pda, int pde, int v ) {
        this.nombre = n;
        this.tipo = t;
        this.nivelVida = nv;
        this.velocidad = v;
        this.poderDaño = pda;
        this.poderDefensa = pde;
        
}
        //metodos
 public int atacar() {
	 int valor = (int) (Math.random()*100 % poderDaño) +1;
	 return valor;
	 
 }
 public boolean esquivar () {
	 int valor = (int) (Math.random()*100 % 2) -2;
	 if(valor == 0) {
		 return true;
	 }else {
		 return false;
	 }
 }
 public void setVida(int v) {
	 this.nivelVida = v;
 }
 public int getVida() {
	return this.nivelVida;
 }
	 public String pokedex() {
	  return "nombre " + nombre
			  + "Tipo" + tipo
			  + "nivel de Vida" + nivelVida
			  + "velocidad" + velocidad;
  }
			   
  }
