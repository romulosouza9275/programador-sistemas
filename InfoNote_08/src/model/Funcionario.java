package model;

public class Funcionario 
}


package model;

public class Funcionario extends Usuario {


/**
 * @param matricula
 */


private String matricula;

/**
 * @return the matricula
 */
public String getMatricula() {
 return matricula;
}


/**
 * 
 */
public void setMatricula(String matricula) {
 this.matricula = matricula;
}

public Funcionario() {
 super();
 
}

public Funcionario(String login, String senha, int tipo, String matricula) {
 super(login, senha, tipo);
 this.matricula = matricula;
 // TODO Auto-generated constructor stub
}
}

