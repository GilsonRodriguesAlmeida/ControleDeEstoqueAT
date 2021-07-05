package br.edu.infnet.controleDeEstoque.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.controleDeEstoque.model.domain.AnoInvalidoException;
import br.edu.infnet.controleDeEstoque.model.domain.Disco;
import br.edu.infnet.controleDeEstoque.model.domain.Empresa;
import br.edu.infnet.controleDeEstoque.model.domain.Estoque;
import br.edu.infnet.controleDeEstoque.model.domain.FiltroInvalidoException;
import br.edu.infnet.controleDeEstoque.model.domain.Fluido;
import br.edu.infnet.controleDeEstoque.model.domain.Pastilha;
import br.edu.infnet.controleDeEstoque.model.exceptions.ModeloVeiculoNaoPreenchidoException;

public class AppTeste {

	public static void main(String[] args) {
		
		try {
			String dir = "c:/dev/";
			String arq = "estoque.txt";
			
			try {
				FileWriter filew = new FileWriter(dir +"out_"+ arq);
				BufferedWriter escrito = new BufferedWriter(filew);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "0":
						Empresa empresa1 = new Empresa(campos[4], campos[5], campos[6],campos[7], campos[8]);
						
						Estoque est = new Estoque();
						est.setDescricao(campos[3]);
						est.setQuantidade(Integer.valueOf(campos[2]));
						est.setCodProduto(Integer.valueOf(campos[1]));
						est.setEmpresa(empresa1);
						System.out.println("Estoque: " + est + "\n");
						break;
						
					case "D":
						Disco disc1 = new Disco(Integer.valueOf(campos[1]), 
								Integer.valueOf(campos[2]), campos[3], Float.valueOf(campos[4]), campos[5]);
						disc1.setMarca(campos[5]);
						disc1.setModeloVeiculo(campos[6]);
						disc1.setAno(Integer.valueOf(campos[7]));
						
						escrito.write(disc1.buscarItem());
						
						break;
						
					case "P":
						Pastilha past1 = new Pastilha(Integer.valueOf(campos[1]), 
								Integer.valueOf(campos[2]), campos[3], Float.valueOf(campos[4]), campos[5]);
						past1.setMarca(campos[5]);
						past1.setModeloVeiculo(campos[6]);
						past1.setAno(Integer.valueOf(campos[7]));
						
						escrito.write(past1.buscarItem());
						
						break;
						
					case "F":
						Fluido flui1 = new Fluido(Integer.valueOf(campos[1]), 
								Integer.valueOf(campos[2]), campos[3], Float.valueOf(campos[4]), campos[5]);
						flui1.setMarca(campos[5]);
						flui1.setModeloFluido(campos[6]);
						flui1.setNumeroFluido(Integer.valueOf(campos[7]));
						
						escrito.write(flui1.buscarItem());
						
						break;
						
					default:
						System.out.println("Entrada inválida!");
						break;
					}
					
					
					linha = leitura.readLine();
				}
				
				file.close();
				leitura.close();
				escrito.close();
				filew.close();
				
			} catch (AnoInvalidoException | FiltroInvalidoException | ModeloVeiculoNaoPreenchidoException | IOException e) {
				System.out.println(e.getMessage());
			}
		} finally {
			System.out.println("Processamento finalizado!");
		}
	}
	
}
