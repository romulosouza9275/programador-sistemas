package util;
import util.Teclado;
public class LacoTesteInicio {
 public static void main(String[] args) {
	 int r,x,i;
	 i = 1;
	 while (i<= 5) {
		x = Teclado.lerINt("Digite um N�mero:");
		r = x*3;
		System.out.println(r);
		i= i+1;
	 }
   }
}
