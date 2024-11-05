package edu.exemplos.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

//Criar uma interface mais simples para consumir as informações:
public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.migrarCliente("NomeExemploCliente", "12345678");
	}
}
