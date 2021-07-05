package br.edu.infnet.controleDeEstoque.model.tests;

import br.edu.infnet.controleDeEstoque.model.domain.Disco;
import br.edu.infnet.controleDeEstoque.model.domain.Fluido;
import br.edu.infnet.controleDeEstoque.model.domain.Pastilha;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Pastilha past1 = new Pastilha(03, 5,"Pastilha", 10, "Patilha de Freio / Par");
		past1.setMarca("Bosh");
		past1.setModeloVeiculo("Gol/Bolinha");
		past1.setAno(2020);
		System.out.println(past1 + "\n");
		
		Disco disc1 = new Disco(07, 5,"Disco", 240, "Disco de Freio / Par");
		disc1.setMarca("Bosh");
		disc1.setModeloVeiculo("Gol/Bolinha");
		disc1.setAno(2020);
		System.out.println(disc1 + "\n");
		
		Fluido flui1 = new Fluido(17, 5,"Fluido", 70, "Fluido de Freio");
		flui1.setMarca("Bosh");
		flui1.setModeloFluido("F100");
		flui1.setNumeroFluido(5);
		System.out.println(flui1 + "\n");
	}
}
 