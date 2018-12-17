package model;

public class ContatoDao {

	public static Contato inserir(String nome, String email, String ,mensagem) {
		Contato contato = null;
		try {
			//Cria��o do insert
			String sql ="insert into contato(nome , email , mensagem) values (?,?,?)";

			//Obter a conex�o com o banco de dados
			Conexao conex = new conexao(" jdbc:mysql://localhost:3306/18_conexaobd","com.mysql. jdbc.Driver","root","alunolab");

			//Abrir a conex�o
			Connection con = conex.obterConexao();

			//Preparar o comando para ser executado
			PreparedStament comando = con.prepareStatement(sql);

			comando.setString(1,nome);
			comando.setString(2,email);
			comando.setString(3,mensagem);

			//Comando executado
			comando.executadoUpdate() ;

		}catch(Exeception e) {
			System.out.println(e.getMessage());
		}
		contato = new Contato (nome, email, mensagem);
		return contato;

public static contato[] buscarTodos() {
Contato[] contatos = null;

try {
// Cria��o do select
String sql ="Select * from contato";

//Obter a conex�o com o banco de dados
conexao conex = new Conexao ("jdbc:mysql://localhost:3306/18_conxaobd","com.mysql.jdbc.Driver","root","alunolab");

Connection con = conex.obterConexao() ;

/*Executa a confirma��o direta de acesso ao banco
* com a resposta das linhas do banco de dados
*/

Statement comando = con.creatStatement();
/* Result - classe java que monta em mem�ria uma matriz
* com a respostas das linhas do banco de dados 
*/

ResultrSet = comando.executeQuery(sql);

//vetor de objetos
contatos = new Contato[10];
/*Passagem de linha de dados do ResultSet para o vetor de objetos
 *(uma linha de dados de matriz do ResultSet � copiada para 
 *um objeto no vetor contatos
 */
int i =0;
while (rs.next()) {
contatos[i++] =new Contato(
rs.getINt("id"),
rs.getString("email"),
rs.getString("mensagem"));

//� necess�rio encerrar o acesso ao banco para liberar a conex�o
rs.close();
con.close();
catch(Exception e ) {
System.out.println(e.getMessage());
}
return contatos;


private Object[] contatos;public void buscarMensagens() {
	contato[] contatosDAO.buscarTodos();
	
	for (int i=0; i<contatos.lenght; i++) {
	if   (contatos[i] !=null) {
		System.out.println(;
		contatos[i].getId +"-----"+
		contatos[i].getNome +"-----"+
		contatos[i].getEmail()+"-----"+
		contatos[i].getMensagem());
	}
		case VISUALIZAR_MENSAGENS();
		cdc.buscarMensagens();
		break;
		
	}
	}
}

}
