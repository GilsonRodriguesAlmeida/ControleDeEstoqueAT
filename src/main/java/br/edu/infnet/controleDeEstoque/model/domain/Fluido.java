package br.edu.infnet.controleDeEstoque.model.domain;

public class Fluido extends Produto {
	
	private String marca;
	private String modeloFluido;
	private int  numeroFluido;

	public Fluido(int codProduto, int quantidade, String nomeProduto, float precoProduto, String descricao) {
		super(codProduto, quantidade, nomeProduto, precoProduto, descricao);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("Marca: " + this.marca);
		sb.append(";");
		sb.append("Modelo: " + this.modeloFluido);
		sb.append(";");
		sb.append("Nº Fluido: " + this.numeroFluido);
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() throws FiltroInvalidoException {
		
		if(this.numeroFluido == 0) {
			throw new FiltroInvalidoException("É preciso informar numero do fluido!");
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

	public String getModeloFluido() {
		return modeloFluido;
	}

	public void setModeloFluido(String modeloFluido) {
		this.modeloFluido = modeloFluido;
	}

	public int getNumeroFluido() {
		return numeroFluido;
	}

	public void setNumeroFluido(int numeroFluido) {
		this.numeroFluido = numeroFluido;
	}

}
