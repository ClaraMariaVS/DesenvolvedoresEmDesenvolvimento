package exemploAula02;

public class teste {
	
	public static void main(String[] args) {
		
		//System.out.println("Olá, humano!");
		
		Livro meuLivro = new Livro();
		meuLivro.nome = "É assim que acaba";
		meuLivro.autor = "Collen Hover";
		
		//System.out.println(meuLivro.nome);
		
		meuLivro.exibeFichaLiteraria();
	}

}
