package edu.exemplos.gof.strategy;

//Padr�o de projeto Strategy consiste em simplificar a varia��o
//de algoritmos para a resolu��o de um mesmo problema.
/*
 * permite que voc� defina uma fam�lia de algoritmos, encapsule cada um deles e os torne intercambi�veis. 
 * Isso significa que voc� pode escolher o algoritmo a ser usado em tempo de execu��o, sem ter que modificar o 
 * c�digo cliente.
 * Padr�o de Projeto Strategy: Uma Abordagem Flex�vel para Algoritmos
O padr�o de projeto Strategy (Estrat�gia em portugu�s) � um dos padr�es de projeto comportamentais mais utilizados em 
programa��o orientada a objetos. Ele permite que voc� defina uma fam�lia de algoritmos, encapsule cada um deles e 
os torne intercambi�veis. Isso significa que voc� pode escolher o algoritmo a ser usado em tempo de execu��o, 
sem ter que modificar o c�digo cliente.

Por que usar o padr�o Strategy?

Flexibilidade: Permite trocar algoritmos facilmente sem alterar o c�digo cliente.
Reutiliza��o: Algoritmos podem ser reutilizados em diferentes contextos.
Testes unit�rios: Facilita a cria��o de testes unit�rios para cada algoritmo isoladamente.
Melhora a coes�o do c�digo: Separa as responsabilidades de um objeto, tornando o c�digo mais organizado e f�cil de entender.
Estrutura do padr�o:

O padr�o Strategy envolve tr�s componentes principais:

Interface Estrat�gia: Define uma interface comum para todos os algoritmos concretos.
Classes Concretas: Implementam a interface Estrat�gia, cada uma com sua pr�pria implementa��o do algoritmo.
Contexto: Mant�m uma refer�ncia a uma inst�ncia da interface Estrat�gia e delega a execu��o do algoritmo para ela.


Quando usar o padr�o Strategy:

-M�ltiplas varia��es de um algoritmo: Quando voc� precisa implementar um algoritmo de v�rias maneiras diferentes.
-Algoritmos complexos: Quando os algoritmos s�o complexos e voc� deseja isol�-los do resto do c�digo.
-Algoritmos que mudam com frequ�ncia: Se os algoritmos precisam ser alterados com frequ�ncia, o padr�o Strategy facilita essa tarefa.
Outras aplica��es:

-Ordena��o: Diferentes algoritmos de ordena��o (bubble sort, quicksort, merge sort).
-Valida��o: Diferentes regras de valida��o para diferentes tipos de dados.
-Formata��o: Diferentes formatos de sa�da (JSON, XML, CSV).
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
