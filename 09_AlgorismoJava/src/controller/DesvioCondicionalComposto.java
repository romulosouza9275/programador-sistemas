package controller;
import util.Teclado;
public class DesvioCondicionalComposto {
 public static void main(String[] args) {
	 
	 int a,b,x;
	 a = Teclado.lerINt("Informe o primeiro número:");
	 b = Teclado.lerINt("Informe o segundo número:");
	 x = a + b;
	 if (x >=10){
		System.out.println("O resultado acresido de 5 é" + (x + 5)); 
	 }else{
		 System.out.println("O resultado subtraído de 7 é " + (x-7));
	 }
   }
}
