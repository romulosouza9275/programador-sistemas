package controller;
import util.Teclado;
public class DesvioCondicionalComposto {
 public static void main(String[] args) {
	 
	 int a,b,x;
	 a = Teclado.lerINt("Informe o primeiro n�mero:");
	 b = Teclado.lerINt("Informe o segundo n�mero:");
	 x = a + b;
	 if (x >=10){
		System.out.println("O resultado acresido de 5 �" + (x + 5)); 
	 }else{
		 System.out.println("O resultado subtra�do de 7 � " + (x-7));
	 }
   }
}
