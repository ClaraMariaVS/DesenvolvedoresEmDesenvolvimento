package forumDEconhecimento;

public class usuario {
    
	
	private String nome; 
	private String tipo;
	private int cpf;
	private String email;
	private String senha;
	private boolean ativo;
	
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private int getCpf() {
		return cpf;
	}
	private void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String getSenha() {
		return senha;
	}
	private void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	private void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

}
