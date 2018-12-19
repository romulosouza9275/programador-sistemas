package model;

public class CadastrarUsuario {
	public void cadastrarUsuario() {
		System.out.println("==================================================");
		String cep = Teclado.lerTexto("CEP: ");
		if (senha.equals("") || senha == null){
		senha = GerarSenha.gerarSenha();
		System.out.println("Senha gerada: " + senha);
		
		if (senha.equals("") || senha == null){
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada: " + senha);
			}
	}
