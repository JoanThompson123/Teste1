import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		
		int matriz [] [] = new int [2][2];
		int x;
		int y;
		int valor;
		
		System.out.println("escreva matriz");
		
		for (x=0;x<2;x++) {
			for(y=0;y<2;y++) {
			matriz[x][y] = leia.nextInt();	
			}
		}
		
		System.out.println("Ecreva o valor para procurar");
		valor=leia.nextInt();
		
		for (x=0;x<2;x++) {
			for(y=0;y<2;y++) {
				if(matriz[x][y] == valor) {
					System.out.println("valor encontrado: ["+x+"]["+y+"]");
				}
			}
		}
	

	}

}
