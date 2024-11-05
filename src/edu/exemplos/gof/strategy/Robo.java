package edu.exemplos.gof.strategy;

//Padrão de projeto Strategy consiste em simplificar a variação
//de algoritmos para a resolução de um mesmo problema.
/*
 * permite que você defina uma família de algoritmos, encapsule cada um deles e os torne intercambiáveis. 
 * Isso significa que você pode escolher o algoritmo a ser usado em tempo de execução, sem ter que modificar o 
 * código cliente.
 * Padrão de Projeto Strategy: Uma Abordagem Flexível para Algoritmos
O padrão de projeto Strategy (Estratégia em português) é um dos padrões de projeto comportamentais mais utilizados em 
programação orientada a objetos. Ele permite que você defina uma família de algoritmos, encapsule cada um deles e 
os torne intercambiáveis. Isso significa que você pode escolher o algoritmo a ser usado em tempo de execução, 
sem ter que modificar o código cliente.

Por que usar o padrão Strategy?

Flexibilidade: Permite trocar algoritmos facilmente sem alterar o código cliente.
Reutilização: Algoritmos podem ser reutilizados em diferentes contextos.
Testes unitários: Facilita a criação de testes unitários para cada algoritmo isoladamente.
Melhora a coesão do código: Separa as responsabilidades de um objeto, tornando o código mais organizado e fácil de entender.
Estrutura do padrão:

O padrão Strategy envolve três componentes principais:

Interface Estratégia: Define uma interface comum para todos os algoritmos concretos.
Classes Concretas: Implementam a interface Estratégia, cada uma com sua própria implementação do algoritmo.
Contexto: Mantém uma referência a uma instância da interface Estratégia e delega a execução do algoritmo para ela.


Quando usar o padrão Strategy:

-Múltiplas variações de um algoritmo: Quando você precisa implementar um algoritmo de várias maneiras diferentes.
-Algoritmos complexos: Quando os algoritmos são complexos e você deseja isolá-los do resto do código.
-Algoritmos que mudam com frequência: Se os algoritmos precisam ser alterados com frequência, o padrão Strategy facilita essa tarefa.
Outras aplicações:

-Ordenação: Diferentes algoritmos de ordenação (bubble sort, quicksort, merge sort).
-Validação: Diferentes regras de validação para diferentes tipos de dados.
-Formatação: Diferentes formatos de saída (JSON, XML, CSV).
(Google Gemini)

 */
public class Robo {

	private Comportamento comportamento; //strategy

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}
	
	public static void main(String[] args) {
		//Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
	
		
	}
}
