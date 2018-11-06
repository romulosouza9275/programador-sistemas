package model;

public class Aluno extends Usuario implements IUsuario{
public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
private String matricula;
private String nome;
private String turno;
private String turma;
private String matriculaAluno;



@Override
public void mostrar() {
System.out.println("Informações do aluno: ");
System.out.println("Login: " + super.getLogin());
System.out.println("Senha: *****");

System.out.println("Matricula: " + matriculaAluno);
System.out.println("Nome:" +nome);
System.out.println("Turno: " + turno);
System.out.println("turma: " + turma);
}


@Override
public boolean validarLogin (String login,String senha) {
	if (getLogin() .equals(login) && getSenha().equals(senha)) {
		return true;
	}
	return false;
	}
}

