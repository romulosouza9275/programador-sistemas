package controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComTramentoDeErroGeneralizado {
  public static void main(String[] args) {
  int val1 = obtemNumero("primeiro");
  int val2 = obtemNumero("segundo");
  System.out.println("Número lidos: " + val1 + "e"+ val2);
 
  //Auto-Generated method stub

}
static int obtemNumero(String n) {
  System.out.println(" Digite o " + n + "numero:");
  return lerNumero();
}
static int lerNumero (){
  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
  int x = Integer.parseInt(teclado.readLine());
  return x;
}
}
