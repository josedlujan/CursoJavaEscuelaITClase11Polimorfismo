
public class Elefante extends Mamifero{


	public Elefante(){
		this.vivo=true;
		this.numPatas=4;
		this.TPelo="ninguno";
		this.edad=2;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("El elefante come plantas");
	}
}
