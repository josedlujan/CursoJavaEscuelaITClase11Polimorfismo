
public class Vaca extends Mamifero{

	public Vaca(){

			this.vivo=true;
			this.numPatas=4;
			this.TPelo="largo";
			this.edad=1;
		}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("La vaca come pasto");
	}
	
}
