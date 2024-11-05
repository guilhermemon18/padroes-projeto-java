package edu.exemplos.gof.singleton;


/*
 * Padrão de Projeto Singleton: Um Objeto Único e Global
O padrão de projeto Singleton é um padrão de criação que garante que uma classe tenha apenas uma instância, 
fornecendo um ponto de acesso global a essa instância. É como ter uma única chave para uma porta: 
só há uma e todos que precisam entrar precisam usar essa mesma chave.

Por que usar o Singleton?

-Controle de acesso a recursos: Garante que apenas uma instância acesse um recurso compartilhado, como uma conexão com um banco de dados ou um arquivo de configuração.
-Gerenciamento de estado global: Permite manter um estado global que pode ser acessado por diferentes partes do sistema.
-Otimização: Em alguns casos, a criação de um objeto pode ser uma operação cara. O Singleton evita a criação repetida de objetos.
Como funciona:

1. Construtor privado: O construtor da classe é privado, impedindo que instâncias sejam criadas diretamente de fora da classe.
2. Instância estática: Uma variável estática do tipo da classe armazena a única instância.
3. Método estático para obter a instância: Um método estático retorna a instância armazenada, criando-a se ainda não existir.
 
 Quando usar e quando evitar:

-Usar:
	-Quando você precisa de apenas uma instância de uma classe em todo o sistema.
	-Para gerenciar recursos compartilhados.
	-Para implementar um registro global.
-Evitar:
	-Teste: Torna os testes unitários mais difíceis, pois a classe está acoplada a um estado global.
	-Flexibilidade: Dificulta a criação de diferentes versões do mesmo objeto.
	-Violando princípios SOLID: O Singleton pode violar o princípio da responsabilidade única (SRP).
 */

//Singleton preguiçoso
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
