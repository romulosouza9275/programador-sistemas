package controller;
import util.Teclado;
import util.Teclado;
public class LacoVariavelControle {
  public static void main(String [] args) {
  int r,x,i;
  for (i=1; i<5; i++) {
  x = Teclado.lerINt("digite um número:");
  r=x*3;
  System.out.println(r);
    }
  }
}
