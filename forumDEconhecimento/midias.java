package forumDEconhecimento;

public class midias {

	private String caminhoArquivo;
	private String formato;
	private String dataUpload;
	private int duracao;
	
	
	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	public String getFormato() {
		return formato;
	}
	private void setFormato(String formato) {
		this.formato = formato;
	}
	private String getDataUpload() {
		return dataUpload;
	}
	public void setDataUpload(String dataUpload) {
		this.dataUpload = dataUpload;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
