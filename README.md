# Projeto: Padrões de Projeto em Java

## Sobre

Este projeto demonstra a implementação dos seguintes padrões de projeto em Java:

* **Singleton:** Garante que uma classe tenha apenas uma instância, fornecendo um ponto de acesso global.
* **Strategy:** Permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis.
* **Facade:** Fornece uma interface unificada para um conjunto de interfaces em um subsistema.

**Inspiração:**

Este projeto foi desenvolvido com base em pesquisas e exemplos encontrados no Google Gemini.

## Implementação

### Singleton
* **Objetivo:** Garantir que apenas uma instância da classe exista.
* **Implementação:** O algoritmo foi implementado em três variações conhecidas: Lazy, Eager e LazyHolder.

### Strategy
* **Objetivo:** Permitir a troca de algoritmos em tempo de execução.
* **Implementação:** Foi implementada uma classe "Robo" que seria o Contexto que mantém uma referência a uma instância da interface Estratégia e delega a execução do algoritmo para si.
Foi criada uma interface "Comportamento" que equivale a Interface Estratégia que define uma interface comum para todos os algoritmos concretos. Por fim, foram criadas três classes concretas "ComportamentoNormal",
"ComportamentoDefensivo" e "ComportamentoAgressivo", estas Implementam a interface Estratégia, cada uma com sua própria implementação do algoritmo.

### Facade
* **Objetivo:** Simplificar a interface de um subsistema.
* **Implementação:** Foi criada uma classe "Facade" com o objetivo de migrar clientes pelo nome e CEP, onde simplifca a interface para consumir os serviços de CEP e atualização de cliente,
   permitindo uma comunicação mais limpa com outros serviços.

## Referências

* Google Gemini

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um issue ou um pull request.
