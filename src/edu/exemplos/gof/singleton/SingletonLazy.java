package edu.exemplos.gof.singleton;


/*
 * Padr�o de Projeto Singleton: Um Objeto �nico e Global
O padr�o de projeto Singleton � um padr�o de cria��o que garante que uma classe tenha apenas uma inst�ncia, 
fornecendo um ponto de acesso global a essa inst�ncia. � como ter uma �nica chave para uma porta: 
s� h� uma e todos que precisam entrar precisam usar essa mesma chave.

Por que usar o Singleton?

-Controle de acesso a recursos: Garante que apenas uma inst�ncia acesse um recurso compartilhado, como uma conex�o com um banco de dados ou um arquivo de configura��o.
-Gerenciamento de estado global: Permite manter um estado global que pode ser acessado por diferentes partes do sistema.
-Otimiza��o: Em alguns casos, a cria��o de um objeto pode ser uma opera��o cara. O Singleton evita a cria��o repetida de objetos.
Como funciona:

1. Construtor privado: O construtor da classe � privado, impedindo que inst�ncias sejam criadas diretamente de fora da classe.
2. Inst�ncia est�tica: Uma vari�vel est�tica do tipo da classe armazena a �nica inst�ncia.
3. M�todo est�tico para obter a inst�ncia: Um m�todo est�tico retorna a inst�ncia armazenada, criando-a se ainda n�o existir.
 
 Quando usar e quando evitar:

-Usar:
	-Quando voc� precisa de apenas uma inst�ncia de uma classe em todo o sistema.
	-Para gerenciar recursos compartilhados.
	-Para implementar um registro global.
-Evitar:
	-Teste: Torna os testes unit�rios mais dif�ceis, pois a classe est� acoplada a um estado global.
	-Flexibilidade: Dificulta a cria��o de diferentes vers�es do mesmo objeto.
	-Violando princ�pios SOLID: O Singleton pode violar o princ�pio da responsabilidade �nica (SRP).
 */

//Singleton pregui�oso
public class SingletonLazy {
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
