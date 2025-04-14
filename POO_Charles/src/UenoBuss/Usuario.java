package UenoBuss;

public class Usuario {
 //Atributos
 String nombre, telefono; 
 int cedula;
	
	public Usuario() {}
	//cargar = set, mostrar = get
public void setNombre(String n) {
	nombre = n;
}

public void setCedula(int c) {
	cedula = c;
}
public void settelefono(String t) {
	telefono = t;
}
public String getNombre() {
	return nombre;
}
public int getCedula() {
    return cedula;
}
public String getTelefono() {
    return telefono;
}
}
