package br.edu.infnet.controleDeEstoque.model.domain;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private String endereco;
	
	public Empresa(String nome, String cnpj, String telefone, String email, String endereco) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.cnpj);
		sb.append(";");
		sb.append(this.telefone);
		sb.append(";");
		sb.append(this.email);
		sb.append(";");
		sb.append(this.endereco);
		sb.append(";");
		
		return sb.toString();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
