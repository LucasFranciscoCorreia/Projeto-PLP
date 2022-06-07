<h1>Projeto de Paradigmas de Linguagens de Programação</h1>

 Este projeto tem como objetivo atender à disciplina de Paradigmas de Linguanges de Programação, ofertado pelo CIN na UFPE no semestre 2022.1

***
<h1>Probabilidade</h1>

*Probabilidade* é um ramo da matemática em que as chances de ocorrencia de experimentos são calculadas. Ela é uma razão, um numero positivo entre 0 e 1 (ou 0 e 100), referente a um evento qualquer, medido pela quantidade de vezes que esse evento ocorre numa sequencia de acontecimentos.

Entre os eventos da probabilidade, podemos citar:
 - a probabilidade de tirar cara em uma moeda
 - a probabilidade de tirar 6 em um dado de 6 faces
 - o numero mais provavel em uma rolagem de 2 dados de 6 faces
 - etc.

Probabilidade é bastante usado em simulações e analise de sistemas para medir e prever falhas, além de observar e analisar eventos.

Probabilidade não é uma questão de chance, é uma questão de **quando**.

***

<h1>Operador Probabilistico</h1>
Dado um evento **X**, existe **Y**% de chance de que ele ocorra. Caso não ocorra, o evento qualquer **Z** ocorre
 
- Jogar uma moeda tem **50**% de chance de **dar cara**. Se não for cara, então é **coroa**;
- Um dado de 6 faces tem **16.666...**% de chance de **dar 6**. Se não for 6, então é **um numero entre 1 e 5**;
- 2 dados de 6 faces tem **2.777...**% de chance de **dar 2**. Se não for 2, então é **um numero entre 3 e 12**;
  - 2 dados de 6 faces tem **16.666...**% de chance de **dar 7**. Se não for 7, então é **um numero entre 2 e 6 ou 8 e 12**;

Este projeto estende as linguagens **Funcional 2** e **Imperativa 2** com um operador de probabilidade e casas decimais para realizar operações com mais precisão.
***
<h1>BNF</h1>

<h3>Funcional 2</h3>

[Programa](src/lf2/plp/functional2/Programa.java) ::= [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)
###

[Expressao](src/lf2/plp/expressions2/expression/Expressao.java) ::= 
[Valor](src/lf2/plp/expressions2/expression/Valor.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ExpUnaria](src/lf2/plp/expressions2/expression/ExpUnaria.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ExpBinaria](src/lf2/plp/expressions2/expression/ExpBinaria.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ExpDeclaracao](src/lf2/plp/expressions2/expression/ExpDeclaracao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Id](src/lf2/plp/expressions2/expression/Id.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Aplicacao](src/lf2/plp/functional2/expression/Aplicacao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [IfThenElse](src/lf2/plp/functional1/expression/IfThenElse.java)
###
[Valor](src/lf2/plp/expressions2/expression/Valor.java) ::= 
[ValorConcreto](src/lf2/plp/expressions2/expression/ValorConcreto.java)
| [ValorAbstrato](src/lf2/plp/functional2/expression/ValorAbstrato.java)
###
[ValorAbstrato](src/lf2/plp/functional2/expression/ValorAbstrato.java) ::= [ValorFuncao](src/lf2/plp/functional2/expression/ValorFuncao.java)
###
[ValorConcreto](src/lf2/plp/expressions2/expression/ValorConcreto.java) ::= [ValorInteiro](src/lf2/plp/expressions2/expression/ValorInteiro.java) 
| [ValorBooleano](src/lf2/plp/expressions2/expression/ValorBooleano.java) 
| [ValorString](src/lf2/plp/expressions2/expression/ValorString.java) 
| [**Valor Decimal**](src/lf2/plp/expressions2/expression/ValorDecimal.java)
###
[ValorFuncao](src/lf2/plp/functional2/expression/ValorFuncao.java) ::= "fn" ListId "." [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)
###
[ExpUnaria](src/lf2/plp/expressions2/expression/ExpUnaria.java) ::= "-" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) 
| "not" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) 
| "length" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)
###
[ExpBinaria](src/lf2/plp/expressions2/expression/ExpBinaria.java) ::= [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) "+" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) "-" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) "and" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) "or" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) "==" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao](src/lf2/plp/expressions2/expression/Expressao.java) "++" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| **[Expressao](src/lf2/plp/expressions2/expression/Expressao.java) ::[Valor](src/lf2/plp/expressions2/expression/Valor.java):: [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)**

###          

[ExpDeclaracao](src/lf2/plp/functional2/expression/ExpDeclaracao.java) ::= "let" [DeclaracaoFuncional](src/lf2/plp/functional1/declaration/DeclaracaoFuncional.java) "in" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)
###
[DeclaracaoFuncional](src/lf2/plp/functional1/declaration/DeclaracaoFuncional.java) ::= [DecVariavel](src/lf2/plp/functional1/declaration/DecVariavel.java)
    | [DecFuncao](src/lf2/plp/functional2/declaration/DecFuncao.java)
    | [DecComposta](src/lf2/plp/functional1/declaration/DecComposta.java)
###
[DecVariavel](src/lf2/plp/functional1/declaration/DecVariavel.java) ::= "var" [Id](src/lf2/plp/expressions2/expression/Id.java) "=" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)
###
[DecFuncao](src/lf2/plp/functional2/declaration/DecFuncao.java) ::= "fun" ListId "=" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)
###
[DecComposta](src/lf2/plp/functional1/declaration/DecComposta.java) ::= [DeclaracaoFuncional](src/lf2/plp/functional1/declaration/DeclaracaoFuncional.java) "," [DeclaracaoFuncional](src/lf2/plp/functional1/declaration/DeclaracaoFuncional.java)
###
ListId ::= [Id](src/lf2/plp/expressions2/expression/Id.java)  |  [Id](src/lf2/plp/expressions2/expression/Id.java) ListId
###
[Aplicacao](src/lf2/plp/functional2/expression/Aplicacao.java):= [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)"(" ListExp ")"
###
ListExp ::= [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)  |  [Expressao](src/lf2/plp/expressions2/expression/Expressao.java), ListExp
###

<h3>Imperativa 2</h3>

[Programa](src/lf2/plp/imperative2/Programa.java) ::= [Comando](src/lf2/plp/imperative1/command/Comando.java)

Comando ::= [Atribuicao](src/lf2/plp/imperative1/command/Atribuicao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ComandoDeclaracao](src/lf2/plp/imperative1/command/ComandoDeclaracao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [While](src/lf2/plp/imperative1/command/While.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [IfThenElse](src/lf2/plp/imperative1/command/IfThenElse.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [IO](src/lf2/plp/imperative1/command/IO.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Comando ";" Comando](src/lf2/plp/imperative1/command/SequenciaComando.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Skip](src/lf2/plp/imperative1/command/Skip.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ChamadaProcedimento](src/lf2/plp/imperative2/command/ChamadaProcedimento.java)

Skip ::= 

Atribuicao ::= [Id](src/lf2/plp/expressions2/expression/Id.java) ":=" [Expressao](src/lf2/plp/expressions2/expression/Expressao.java)

Expressao ::= [Valor](src/lf2/plp/expressions2/expression/Valor.java) | [ExpUnaria](src/lf2/plp/expressions2/expression/ExpUnaria.java) | [ExpBinaria](src/lf2/plp/expressions2/expression/ExpBinaria.java) | Id

Valor ::= [ValorConcreto](src/lf2/plp/expressions2/expression/ValorConcreto.java)

ExpUnaria ::= ["-" Expressao](src/lf2/plp/expressions2/expression/ExpMenos.java) | ["not" Expressao](src/lf2/plp/expressions2/expression/ExpNot.java) | ["length" Expressao](src/lf2/plp/expressions2/expression/ExpLength.java)

ExpBinaria ::=  [Expressao "+" Expressao](src/lf2/plp/expressions2/expression/ExpSoma.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "-" Expressao](src/lf2/plp/expressions2/expression/ExpSub.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "and" Expressao](src/lf2/plp/expressions2/expression/ExpAnd.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "or" Expressao](src/lf2/plp/expressions2/expression/ExpOr.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "==" Expressao](src/lf2/plp/expressions2/expression/ExpEquals.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "++" Expressao](src/lf2/plp/expressions2/expression/ExpConcat.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "::Valor::" Expressao](src/lf2/plp/expressions2/expression/ExpProb.java)

ComandoDeclaracao :: = "{" [Declaracao](src/lf2/plp/imperative1/declaration/Declaracao.java) ";" Comando "}"

Declaracao ::= [DeclaracaoVariavel](src/lf2/plp/imperative1/declaration/DeclaracaoVariavel.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [DeclaracaoProcedimento](src/lf2/plp/imperative2/declaration/DeclaracaoProcedimento.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [DeclaracaoComposta](src/lf2/plp/imperative1/declaration/DeclaracaoComposta.java)

DeclaracaoVariavel ::= "var" Id "=" Expressao 

DeclaracaoComposta ::= Declaracao "," Declaracao

DeclaracaoProcedimento ::= ["proc" Id "(" [ ListaDeclaracaoParametro ] ")" "{" Comando "}"](src/lf2/plp/imperative2/declaration/DeclaracaoProcedimento.java)

ListaDeclaracaoParametro ::= [Tipo Id](src/lf2/plp/imperative2/declaration/DeclaracaoParametro.java) | [Tipo Id "," ListaDeclaracaoParametro](src/lf2/plp/imperative2/declaration/ListaDeclaracaoParametro.java)

Tipo ::= "string" | "int" | "boolean" | "decimal"

While ::= "while" Expressao "do" Comando

IfThenElse ::= "if" Expressao "then" Comando "else" Comando

IO ::= ["write" "(" Expressao ")"](src/lf2/plp/imperative1/command/Write.java) | ["read" "(" Id ")"](src/lf2/plp/imperative1/command/Read.java)

ChamadaProcedimento ::= "call" Id "(" [[ ListaExpressao ]](src/lf2/plp/imperative2/command/ListaExpressao.java) ")" 

ListaExpressao ::= Expressao | Expressao, ListaExpressao
***
<h1>Equipe</h1>

<h5>Lucas Francisco Pereira de Gois Correia - lfpgc@cin.ufpe.br</h5>

<h5>João Victor de Almeida Santos - jvas@cin.ufpe.br</h5>
