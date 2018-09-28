#Atividade
##Objetivo
Exercitar práticas de orientação a objetos, tais como, utilização de herança, classes e métodos abstratos e interfaces. 
Assim como trabalhar com tratamento de exceções em java.

###Exceções a serem criadas
#### PersonagemException 
Deverá ser uma exceção não verificada. 
#### NomePersonagemException
Deverá ser uma especialização de PersonagemException
### VidaException
Deverá ser uma exceção verificada



### Validações Personagem
#### Nome
Deve possuir entre 3 e 20 caracteres. Caso o requisito não seja cumprido, deverá ser lançada uma "NomePersonagemException"
com a mensagem  "". 

#### Vida Atual
Caso a <code>vidaAtual</code> seja menor ou igual a 0, deverá lançar uma "VidaException", com 
a mensagem "O Personagem está morto".

#### Esquiva e resistencia
Devem respeitar um valor entre 0 e 99, inclusive estes valores. Para qualquer valor diferente,
deverá ser lançada uma "PersonagemException" com a mensagem "Dado de entrada inválido".

##Atenção! Crie os Getters e Setters que forem necessário para cumprir com os requisitos indicados

### Interface
