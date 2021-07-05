package br.edu.infnet.controleDeEstoque.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.controleDeEstoque.model.exceptions.ModeloVeiculoNaoPreenchidoException;

public abstract class Produto {
	
	private int codProduto;
	private int quantidade;
	private String nomeProduto;
	private float precoProduto;
	private String descricao;
	private LocalDateTime data;
	
	public Produto() {
		data = LocalDateTime.now();
	}
	
	public String buscarItem() throws ModeloVeiculoNaoPreenchidoException, FiltroInvalidoException, AnoInvalidoException {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nomeProduto);
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r\n");
		
		return sb.toString();
	}
	
	public Produto(int codProduto, int quantidade, String nomeProduto, float precoProduto, String descricao) {
		this();
		this.codProduto = codProduto;
		this.quantidade = quantidade;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm dd/MM/yyyy");
		
		sb.append("cod:" + this.codProduto);
		sb.append(";");
		sb.append("Qtde:" + this.quantidade);
		sb.append(";");
		sb.append("Nome:" + this.nomeProduto);
		sb.append(";");
		sb.append("R$:" + this.precoProduto);
		sb.append(";");
		sb.append(this.data.format(formato));
		return sb.toString();
	}

	public abstract float calcularValorVenda() throws ModeloVeiculoNaoPreenchidoException, FiltroInvalidoException, AnoInvalidoException;
	
	public int getCodProduto() {
		return codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public LocalDateTime getData() {
		return data;
	}
	
}
