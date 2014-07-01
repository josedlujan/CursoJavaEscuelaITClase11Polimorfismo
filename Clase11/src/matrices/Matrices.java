package matrices;

public class Matrices {

	public static void main(String[] argumentos){
		int [][] edades = new int [4][4];
		
		
		int i,j;
		
		for(i=0;i<4;i++){//FILAS
			for(j=0;j<4;j++){//COLUMNAS
				edades[i][j]=i+j;
			}
		}
		
		
		for(i=0;i<4;i++){//FILAS
			for(j=0;j<4;j++){//COLUMNAS
				System.out.println(edades[i][j]);
			}
		}
	}
	
}
