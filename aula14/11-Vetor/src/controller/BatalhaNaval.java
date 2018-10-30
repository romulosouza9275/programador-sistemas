package controller;
import util.Teclado;
public class BatalhaNaval {

	public static void main(String[] args) {
	
	// primeiro indice da linha, depois o indice da coluna 
	String arena[] [] = new String[4][5];
	
	for(int i = 0;i < 4; i++) {
	for(int j = 0; j < 5; j++) {
	  arena[i] [j]= "água";
	   }
	 }
	arena[2][2]="Barco";
	arena[1][3]="submarino";
	arena[3][3]="Porta aviões ";
	arena[0][2]="Navio";
	
	int linha,coluna;
	
	linha = Teclado.lerINt("Digite a cooredenada da linha: ");
	coluna =Teclado.lerINt("Digite a coordenada da coluna: ");
	 System.out.println("Você acertou: "+arena[linha][coluna]);
  }
}
