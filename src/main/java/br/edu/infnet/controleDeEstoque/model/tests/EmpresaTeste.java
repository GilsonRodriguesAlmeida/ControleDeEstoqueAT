package br.edu.infnet.controleDeEstoque.model.tests;

import br.edu.infnet.controleDeEstoque.model.domain.Empresa;

public class EmpresaTeste {
	
	public static void main(String[] args) {
			
			Empresa emp1 = new Empresa("Auto Peças","83-190.0001/10","3020-4950","autopeca@gmail.com","Alameda nº115");
			System.out.println("Empresa: " + emp1);
		
	}
}
