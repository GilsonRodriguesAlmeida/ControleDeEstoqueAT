package br.edu.infnet.controleDeEstoque.model.domain;

import br.edu.infnet.controleDeEstoque.model.exceptions.ModeloVeiculoNaoPreenchidoException;

public class Disco extends Produto {

	private String marca;
	private String modeloVeiculo;
	private int ano;
	
	public Disco(int codProduto, int quantidade, String nomeProduto, float precoProduto, String descricao) {
		super(codProduto, quantidade, nomeProduto, precoProduto, descricao);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("Marca: " + this.marca);
		sb.append(";");
		sb.append("Modelo: " + this.modeloVeiculo);
		sb.append(";");
		sb.append("Ano:" + this.ano);
		
		return sb.toString();

	}

	@Override
	public float calcularValorVenda() throws ModeloVeiculoNaoPreenchidoException {
		
		if(this.modeloVeiculo == null) {
			throw new ModeloVeiculoNaoPreenchidoException("É preciso informar o ano para calcular valor!");
		}
		
		float resultado = 0;
		if(this.getQuantidade() != 0) {
			resultado = this.getPrecoProduto() * this.getQuantidade();
		}
		
		return resultado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
