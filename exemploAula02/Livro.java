package exemploAula02;

public class Livro {
	
	String nome;
	String autor;
	String editora;
	int numeroDePaginas;
	String bibliografia;
	String dataDeLancamento;
	String sinopse;
	boolean lido;
	double avaliacao;
	int anoPublicacao;
	
	void exibeFichaLiteraria() {
		System.out.println("Nome do livro: " + nome);
		System.out.println("Nome do (a) autor (a): " + autor);
	}

}
