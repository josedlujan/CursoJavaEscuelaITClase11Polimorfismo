
public abstract class Mamifero {

	protected boolean vivo;
	int edad;
	String TPelo;
	int numPatas;
	
	public abstract void comer();
	
	public void avanzar(){
		System.out.println("Estoy avanzando");
	}
	public void dormir(){
		System.out.println("Estoy durmiendo");
	}
	
	
	
}
