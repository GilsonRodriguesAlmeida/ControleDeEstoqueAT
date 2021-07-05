package br.edu.infnet.controleDeEstoque.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estoque {
	
	private Empresa empresa;
	private String descricao;
	private int codProduto;
	private int quantidade;
	private LocalDateTime data;
	
	public Estoque() {
		data = LocalDateTime.now();
	}
	
	public Estoque(String descricao, int codProduto, int quantidade) {
		
		this();
		this.descricao = descricao;
		this.codProduto = codProduto;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm dd/MM/yyyy");
		return String.format("cod:%d;Qtde:%d;%s;%s;%s", 
				this.codProduto, this.quantidade, this.descricao, 
				this.data.format(formato), this.empresa);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
