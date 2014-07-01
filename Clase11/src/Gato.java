
public class Gato extends Mamifero{

	public Gato(){
		this.vivo=true;
		this.numPatas=4;
		this.TPelo="corto";
		this.edad=1;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("El gato come ratones");
	}
}
