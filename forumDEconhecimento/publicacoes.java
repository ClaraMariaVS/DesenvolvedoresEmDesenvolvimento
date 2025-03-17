package forumDEconhecimento;

public class publicacoes {

	private String titulo;
	private String conteudo;
	private String autor;
	private int likes;
	private int comentarios;
	
	
	private String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComentarios() {
		return comentarios;
	}
	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}
	
}
