package controller;
import model.Notebook;
import model.Usuario;
import sun.rmi.runtime.Log;
import util.Teclado;
public class InfoNote<logado, logado>{

	private static final String pedido = null;

	Usuario user;

	bollean logado = false;

public void mostrarMenu() {
 System.out.println("================================================================================");
 System.out.println("                    InfoNote - Se não é Info não Vendemos                       ");
 System.out.println("================================================================================");
 System.out.println("1 - Login");
 System.out.println("2 - Cadastrar Cliente");
 System.out.println("3 - Buscar Notebook");
 System.out.println("4 - Inserir Notebook no Carrinho");
 System.out.println("5 - Remover Notebook no Carrinho");
 System.out.println("6 - Ver Carrinho");
 System.out.println("7 - Efetuar Compra");
 System.out.println("8 - Sair");
}

public void efetuarLogin() {

 String login, senha;
 login = Teclado.LerTexto("Digite o Login : ");
 senha = Teclado.LerTexto("Digite a Senha : ");
 if (login.equals("admin") && senha.equals("1234")) {
  System.out.println("Login Efetuado com Sucesso !");
  Logado = true;
 } else {
  System.out.println("Login ou Senha Inválido!");
  efetuarLogin();

 }
}

public void cadastrarUsuario() {

 System.out.println("================================================================================");
 System.out.println("                    InfoNote - Cadastro de Usuarios                ");
 System.out.println("================================================================================");
 int matricula = Teclado.lerINt("Matricula : ");
 String login = Teclado.LerTexto("Login : ");
 String senha = Teclado.LerTexto("Senha : ");
 String nome = Teclado.LerTexto("Nome : ");
 String email = Teclado.LerTexto("Email : ");
 String telefone = Teclado.LerTexto("Telefone : ");

 user = new Usuario(matricula, login, senha, nome, email, telefone);

 System.out.println("================================================================================");
 System.out.println("     Usuario Cadastrado com Sucesso!                ");
 System.out.println("================================================================================");

 System.out.println(user);
}

@SuppressWarnings("unlikely-arg-type")
public void inserirNotebook();{
 // LÊ O NOTEBOOK ESCOLHIDO DO TECLADO
 String numeroNote = Teclado.LerTexto("Informe o número do notebook" + "para compra:");

 // CRIA PEDIDO
 if (pedido == null) {
  pedido = new Pedido();
 }
 // BUSCA NOTEBOOK SELECIONADO
 Notebook aux = null;
 for (int i = 0; i < notebooks.length; i++) {
  if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote())) {
   aux = notebooks[i];
  }
  // SE NÃO EXISTIR, INTERROMPE
  if (aux == null) {
   return;
  }
  // CRIA ITEM
  ItemDePedido item = new ItemDePedido(1, aux, aux.getPrecoUnitario());

  // INSERE ITEM NO PEDIDO
  pedido.inserirItem(item);
 }
}

public void buscarNotebook();{
 System.out.println(" buscarNotebook - Em Construção");
}

public void manterCarrinho();{
 System.out.println(" manterCarrinho - Em Construção");
}

public void efetuarCompra();{
 System.out.println(" efetuarCompra - Em Construção");

 public InfoNote () {
	 notebooks[0] = new Notebook(1, "Negativo N22BR",
	 "CPU Intel Core 2 Duo, Memória 2 GB, HD 250 GB",6 ,1200.00,
	 "img\\n22br.jpg","19/05/2011");

	 notebooks[1] = new Notebook(2, "Bell B55br"
	 "CPU Intel Core 2 Duo,Memória 4 GB", HD 500 GB,3, 1800.00, "img\\b55br.jpg","
	 "20/05/2011");

	 notebooks[2] = new Notebook(3, "Pompaq P41BR",
	 "CPU Intel I3, Memória 4 GB, HD 500 GB", 1, 1600.00,		
	 " img \\p41br.jpg","21/05/2011");"

	 notebook[3] = new Notebook(4, "CCF CR71CH",
	 "CPU Intel Dual Core, Memória 2 GB, HD 160 GB", 5, 1100.00,
	 "IMG\\BD22BR.JPG","10/06/2011");

	 notebook[4] = new Notebook(5, "BradescoTech BD22BR"
	 "CPU AMD Phenon II,Mémória 4 GB, HD 500 GB", 2, 1900.00,
	 "img\\bd22br,.jpg","10/06/2011");

public void  inserirNotebook() {

//lê o notebook escolhido do Teclado
String numeroNote = Teclado.LerTexto("Informe o número do notebook"+"para compra:");	

//cria pedido
if (pedido == null) {
	pedido = new Pedido();
}
// Busca notebook selecionado
Notebook aux = null;
for (int i=0; i< notebooks.length; i++) {
if (notebooks[i] != null &&
numeroNote.equals(notebooks[i].getNumeroNote())) {
aux = notebooks[i];

//se não existir, interrompe
if (aux== null) {
	return;

}
//cria item
ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);

//Insere item no pedido
pedido.inserirItem(item);
}
}
}







}


