# Programação Orientada à Objetos
> <p>Aproxima o mundo digital do mundo real</p>.

![poo](https://user-images.githubusercontent.com/96033603/188351046-8f270bdd-ad2f-41c1-bbee-c714819724ca.png)

<i>Programação Baixo Nível</i>
<i>Programação Linear</i>
<i>Programação Estruturada</i> 
<i>Programação Modular</i>
<i>Programação Orientada à Objetos</i>


___

## Classes 
> 



___

## Associação
> Associação ocorre quando uma classe possui ATRIBUTOS do tipo de outra classe.
Estamos dizendo que Carro possui Pneu(4 pneus).

![associacao](https://user-images.githubusercontent.com/96033603/188338711-d86e65fb-66d7-4037-930b-793ecc59a1b2.png)

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
<i>Eles permitem controlar a forma como as variáveis impor
tantes são acessadas e atualizdas no seu código.</i>                     
                                                                     
<b>(TODO MÉTODO GETTER E SETTER É PÚBLICO)</b>                               

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





