package controller;
import util.Teclado;
public class DesvioCondicionalEncadeado {
	void main(String[] args) {
	double sal, salNovo;
	sal= Teclado.lerDouble("Digite o Sal�rio: ");
	if (sal>500) {
		salNovo= sal* 1.15;
	}else{
	 if (sal<= 1000) {
		 salNovo = sal* 1.10;
	 }else{
		 salNovo = sal * 1.05;
	 }
   }
	System.out.println("O Sal�rio com reajuste �: " + salNovo);
	}
}
