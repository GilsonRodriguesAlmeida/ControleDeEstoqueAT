package br.edu.infnet.controleDeEstoque.model.tests;

import br.edu.infnet.controleDeEstoque.model.domain.Empresa;
import br.edu.infnet.controleDeEstoque.model.domain.Estoque;

public class EstoqueTeste {
	
	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa("Auto Peças","83-190.0001/10","3020-4950","autopeca@gmail.com","Murici nº115");
		Empresa emp2 = new Empresa("Curitiba Peças","84-190.0001/20","2020-1970","curitibapeca@gmail.com","Alameda nº1925");
		Empresa emp3 = new Empresa("Parana Peças","85-190.0001/30","3120-4000","paranapeca@gmail.com","Visconde nº25");
		
		Estoque est2 = new Estoque("Disco", 01, 10);
		est2.setEmpresa(emp1);
		System.out.println("Estoque: " + est2);
		
		Estoque est3 = new Estoque("Pastilha", 02, 20);
		est3.setEmpresa(emp2);
		System.out.println("Estoque: " +est3);
		
		Estoque est4 = new Estoque("Fluido", 03, 30);
		est4.setEmpresa(emp3);
		System.out.println("Estoque: " +est4);
	}
}
