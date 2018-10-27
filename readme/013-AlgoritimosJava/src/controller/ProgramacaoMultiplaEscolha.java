package controller;
import util.Teclado;
public class ProgramacaoMultiplaEscolha {
public static void main(String[] args)  { 
int matr, numFinal;
matr= Teclado.lerINt("informe matricula");
numFinal = matr*10;
switch (numFinal) {
  case 0:
	 System.out.println("Pagamento em Janeiro");
	 break;
case 1:
    System.out.println("Pagamento em Fevereiro");
    break;
case 2:
	System.out.println("Pagamento em Março");
case 3:
	System.out.println("Pagamento em Abril");
	break;
	default:
	 System.out.println("Pagamento em Maio");
     }
   }
 }