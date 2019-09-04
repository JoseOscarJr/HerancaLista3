package heranca3;

public class Pessoa {
	private String nome;
	private String endereco;
	private int codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 1)
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.length() > 1)
		this.endereco = endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo > 0)
			this.codigo = codigo;
	}
	
	
}
