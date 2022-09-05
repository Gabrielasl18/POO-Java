# Programação Orientada à Objetos
> <p>Paradigma <b>(modelo, padrão para especificação de um problema)</b> baseado em objetos.Aproxima o mundo digital do mundo real</p>







>Pilares de OO:
<ul type="circle">
	<li><i>Abstração:</i> processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos.</li>
	<li><i>Reuso:</i> capacidade de criar novas unidades de código a partir de outras já existentes.</li>
	<li><i>Encapsulamento:</i> capacidade de esconder complexidades e proteger dados.</li>
</ul>


> Paradigmas existentes na programação de computadores:
* Procedimental (Algorítmica):<i> Computação ocorre através da execução de instruções passo a passo. Ex: Pascal</i>

* Funcional:<i> Computação baseada em cálculo de funções. Ex: Lisp, Haskell.</i>

* Lógico:<i> Computação baseada em fatos e regras. Ex: Prolog.</i>

* Orientado a Objetos:<i> Computação baseada em objetos que se intercomunicam.Objetos contém dados e métodos. Ex: C++,Java.</i>

![poo2](https://user-images.githubusercontent.com/96033603/188351448-79a96dc1-4608-4b31-aa75-d9355c8bd96c.png)

___

## Objeto
> Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas <b>características, comportamentos e estado atual</b>.
<i>Se eu gero um objeto a partir de uma classe, eu estou instânciando uma classe em forma de objeto</i>

> Pode ser conhecido também como entidades que possuem <b>dados</b> e <b>instruções</b> sobre como manipular estes dados.

> Na POO a solução do problema consiste em um primeiro momento estabelecer quais objetos serão necessários.

___

## Encapsulamento 
> Conceito que representa ocultação de dados. Isso significa que as variáveis são encapsuladas na classe e outras classes não podem acessá-las diretamente. Podemos acecssá-los apenas por meio dos métodos de classe pública.Desta forma, podemos ocultar dados importantes e restringir sua modificação.

![uml3](https://user-images.githubusercontent.com/96033603/188363405-7fb4629c-9100-491b-be9d-b54f96b79431.png)

<i>Maneiras de alcançar o encapsulamento em java:</i>
* Declarar variáveis como <b>privado</b>.Pois não podemos acessar variáveis privadas diretamente de outras classes.
* Executar <b>getter</b> e <b>setter</b> métodos.Podemos usá-los para ler e escrever os valores.

<i>Vantagens do encapsulamento Java</i>
* Fornece segurança ao não permitir que classes externas modifiquem os campos privados.
* Podem ter métodos somente leitura e somente gravação também, portanto, fornecendo restrições para outras classes acessá-los. Isso significa que, se uma classe tem apenas método, só podemos ler as variáveis. Da mesma forma, podemos ter apenas um conjunto método para definir apenas a variável.
* Fornece flexibilidade e capacidade de reutilização por meio dos métodos getter e setter.
* Os detalhes de implementação não são visíveis para outras classes.
* Fácil para teste de unidade.


___

## Classes
> É um gabarito para a definição de objetos.Através da definição de uma classe, descreve-se que propriedades —— ou atributos —— o objeto terá.Ou seja, classe é um agrupamento de objetos, consiste nos métodos e nos dados que um determinado objeto irá possuir. 

>A programação orientada a objetos consiste em implementar as classes e na utilização das mesmas, através da sua intercomunicação. <i>(o objeto é uma instância da classe)</i>

___

## This
> Referencia um atributo que pertence à classe.Serve para construtores e métodos.Ex abaixo com construtores:

<i>FORMA ERRADA:</i>

```java
public class Pessoa { // classe
	String nome; // atributo
	Pessoa(String nome) {
	nome = nome;
	}
}
```
<i>FORMA CORRETA:</i>

```java
public class Pessoa { // classe
	String nome; // atributo
	Pessoa(String nome) {
	this.nome = nome; // fiz referência ao meu atributo que pertence à classe com o this.
	}
}
```
___

## Linguagem de Modelagem Unificada (UML)
> Na Unified Modeling Language (UML), a representação para uma classe no diagrama de classes é tipicamente expressa na forma gráfica.

![uml2](https://user-images.githubusercontent.com/96033603/188359210-aa1d118f-5321-493b-b53d-141dd3bd4434.png)

<dl>
<dt>Modificadores de Visibilidade</dt>
<dd>Indicam o nível de acesso aos componentes internos de uma classe. (atributos e métodos)</dd>
</dl>
<i>3 categorias de visibilidade:</i>

* '+' = público: atributo ou método pode ser acessado por qualquer outro objeto <b>(visibilidade externa total).</b>

* '-' = privado: atributo ou método de um objeto dessa classe não pod ser acessado por nenhum outro objeto <b>(nenhuma visibilidade externa).</b>

* '#' = protegido: atributo ou método de um objeto dessa classe pode ser acessado apenas por objetos de classes que sejam derivadas dessa através do mecanismo de herança.

___

## Polimorfismo
> <b>Poli</b> = muitas. <b>Morfo</b> = formas. 
> Permite que um mesmo nome represente vários <i>comportamentos</i> diferentes.

### Assinatura do Método
> Quantidade e os tipos dos parâmetros.Exemplo:

```java
public float calcMedia(float n1, float n2) {
	return n1;
}
public int calcMediana(float v1, float v2) {
	return v1;
}
```
<i>Os dois métodos tem a mesma assinatura,pois apesar de terem nomes diferentes e tipo de retorno diferente, tem a mesma quantidade e tipo dos parâmetros</i>

Continunando no polimorfismo...

### Polimorfismo de Sobreposição.

```java
public class abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membros;
	public void abstract locomover();
	public void abstract alimentar();
	public void abstract emitirSom();
} /*Não pode ser usada como objeto, pois é uma classe abstrata.*/

class Mamifero extends Animal {
	private string corPelo;
	@Sobrepor
	public void locomover() {
		System.out.println("Correndo")
	}
	@Sobrepor
	public void alimentar() {
		System.out.println("Mamando");
	}
	@Sobrepor
	public void emitirSom() {
		System.out.println("Som de Mamífero");
	}
} /*Pode ser criado um objeto a partir dessa classe, pois não é abstrata.*/

class Aves extends Animal {
	private string corPena;
	@Sobrepor
	public void locomover() {
		System.out.println("Voando")
	}
	@Sobrepor
	public void alimentar() {
		System.out.println("Comendo frutas");
	}
	@Sobrepor
	public void emitirSom() {
		System.out.println("Som de Ave");
	}
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
} /*Pode ser criado um objeto a partir dessa classe, pois não é abstrata.*/


public static void Main(String[] args){
	m = new Mamifero(); // instânciando um objeto a partir da classe Mamífero
	a = new Ave(); // instânciando um objeto a partir da classe Ave
	
	m.setPeso(85.3);
	m.setIdade(2);
	m.setMembros(4);
	m.locomover(); // Correndo
	m.alimentar(); // Mamando
	m.emitirSom(); // Som de Mamífero
	
	a.setPeso(0.89);
	a.setIdade(2);
	a.setMembros(4);
	a.locomover(); // Voando
	a.alimentar(); // Comendo frutas
	a.emitirSom(); // Som de Ave
	a.fazerNinho();
}
```
<b>Chamei os mesmos métodos, com os mesmos nomes para objetos diferentes e obtive diferentes tipos de respostas, isso é o <i>POLIMORFISMO</i>.</b>

<b>A gente sobrepôs a classe Animal com as classes mamíferos, aves, ou seja, substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura e estiverem e classes diferentes,  isso é o <i>POLIMORFISMO DE SOBREPOSIÇÃO</i></b>

![R](https://user-images.githubusercontent.com/96033603/188506922-e4a46d21-7aaa-4488-9248-932096951fe0.png)


```java
class Canguru extends Mamífero { /*Terceiro nível de herança*/
	public void usarBolsa(){
		System.out.println("Usando Bolsa");
	}
	@Sobrepor
	public void locomover() { /*Vai sobrepor a sobreposição, pois o locomover do canguro, vai ser diferente do "normal" dos mamíferos.*/
		System.out.println("Saltando");
	}	
}
class Cachorro extends Mamífero() {
} /*Não quer dizer que está vazio, apenas está extendendo só da Superclass(sua mãe)*/

```

### Polimorfismo de Sobrecarga

```java 
class Cachorro extends Lobo {
	public void reagir(string frase){
	}
	public void reagir(int hora, int min){
	}
	public void reagir(bool dono){
	}
	public void reagir(int idade, float peso){
	}
}
```
![R3](https://user-images.githubusercontent.com/96033603/188507307-398cfc73-8393-4d43-89e6-6362563c22c9.png)

___

## Associação
> Associação ocorre quando uma classe possui ATRIBUTOS do tipo de outra classe.
Estamos dizendo que Carro possui Pneu(4 pneus).

![uml4](https://user-images.githubusercontent.com/96033603/188362385-60775c4d-c22c-491f-870e-eeef501f4f6f.png)

```java
public class Pneu{
	int Pressao;
	
	void roda(){
		System.out.println("Pneu em movimento"); 
	}
}
public class Carro{
	Pneu p1;
	Pneu p2;
	Pneu p3;
	Pneu p4;
	
	void liga(){
		System.out.println("Carro ligado");	
	}
	void desliga(){
		System.out.println("Carro desligado");
	}
}
```

___

## Blocos de Inicialização
> Executado ANTES do construtor, é executado toda vez que vc cria um objeto(não importa onde está no código,ele vai executar primeiro) ele inicializa a variável.                                        
*APENAS ASSIM:*

```java
{

}
```

___ 

## Getters and Setters
> Usados para proteger seus dados, especialmente na criação de classes.
> Para cada instância de variável, um método getter retorna seu valor, 
enquanto um método setter define ou atualiza.Com isso em mente, getters e setters também são conhecidos como métodos de ACESSO e de  
MODIFICAÇÃO,respectivamente.                                         

<dl>
	<dt>GETTER</dt>
	<dd>Retorna o valor do atributo.</dd>
</dl>         

<dl>
	<dt>SETTER</dt>
	<dd>Recebe um parâmetro e coloca no atributo</dd>
</dl>        
                                                                     
<b>POR QUE USAR?</b>
<i>Eles permitem controlar a forma como as variáveis importantes são acessadas e atualizdas no seu código.</i>                     
                                                                     
<b>(TODO MÉTODO GETTER E SETTER É PÚBLICO)</b>                               

<i>Getters ex</i>
```java
	int getHeight() 
	{
	  return height;
	}
```

<i>Setters ex</i>
```java
	void setHeight(int h) 
	{
	  this.h = h;
	}
```

___

# Método Construtor
> Ele já vai iniciar da forma que está nesse método.

```java
Class Caneta {
	Caneta(string m, string c, double p) {
		setModelo(m);
		setCor(c);
		setPonta(p);
		tampar();
	}
}
c1 = new Caneta("BIC","Azul",0.5);
```

___

## Modificador Estático
> Torna possível o atributo ser inicializado em qualquer parte da classe, mas quando RECEBE um valor, ele é compartilhado com TODOS os OBJETOS DA CLASSE.SUA INICIALIZAÇÃO não pode ocorrer no método construtor, sendo possível sua inicialização apenas diretamente na declaração do atributo ou no bloco de inicialização estático.Geralmente utilizados visando compartilhamento de informações entre os objetos e para acesso direto aos atributos da classe, sem necessidade de existir algumo objeto instanciado dessa classe. A gente não precisa instânciar os métodos, só usar.                  

```java
STATIC {
}                  
	OU 
	
STATIC STRING NOME; 

	OU 
	
PUBLIC STATIC NOME{
}
```

___

# Ordem de inicialização

<ol>
	<li>Espaço em memória é alocado para o objeto ser construído;</li>
	<li>Cada um dos atributos do objeto é criado e inicializado com os valores default;</li>
	<li>O construtor da superclasse é chamado;</li>
	<li>A inicialização dos atributos via declaração e o código do bloco de inicialização da superclassse são executados na ordem em que aparecem;</li>
	<li>O código do construtor da superclasse é chamado;</li>
	<li>Passo 4 para a subclasse é executado;</li>
	<li>O código do construtor da classe é executado.</li>
</ol>

___

# Overloading
> Dois métodos de uma classe podem ter o mesmo nome, desde que suas assinaturas sejam diferentes.Tal situação não gera conflito pois o compilador é capaz de detectar qual método deve ser escolhido a partir da análise dos tipos de ARGUMENTOS.Nesse caso, diz-se que ocorre a ligação prematura (early binding) para o metódo correto.

```java
 	
PUBLIC VOID nome(String nome,int idade,int altura){
 
}
PUBLIC VOID nome(String nome,int idade,int altura, int peso){
 
}		
```
<b>(DIFERENCIAM-SE NOS ARGUMENTOS).</b>


___

# Sobrescrita de Métodos
> Sobrescrever (redefinir) o método de superclasse com uma implementação adequada; método especial, toda classe herda direta ou indiretamente da classe Object, ela retorna uma String representando um objeto. a linha System.out.println(o); chama o método toString() do objeto o, implicitamente, logo é mais fácil 
chamar toString do objeto O.

<i>Seu objetivo é trazer uma representação textual de uma instância de um objeto.</i>
 
```java
public String toString(){ //mesma quantidade de parâmetro, mesmo nome etc...
	return ...;
}
```

___
