## Disciplina - PROGRAMAÇÃO ORIENTADA À OBJETOS
> Questão 1:

Observe a classe abaixo e escreva o método <i>equals</i> de quadrado (considerando o local marcado como //equals) da seguinte maneira:

* Dois Quadrados são iguais se suas alturas (alt) e larguras (larg) forem iguais.

Dessa maneira, se:

* (i): um Quadradado referenciado por A possui altura 2 e largura 3;
* (ii): um Quadrado referenciado por B possui altura 2 e largura 3;
* (c) a chamada a A.equals(B) deve retornar true. Caso contrário, desve retornar false.

```java
public class Quadrado {
    private double alt;
    private double larg;
    public double getAlt() {
        return alt;
    }
    public void setAlt(double alt) {
        this.alt = alt;
    }
    public double getLarg() {
        return larg;
    }
    public void setLarg(double larg) {
        this.larg = larg;
    }
    //equals
}
```
<i>FEITA</i>

___

> Questão 2:

Observe a classe abaixo. Escreva o código que deve ser inclúido para substituir o comentário //código. O mapa referenciado por g conterá Strings no formato codigo#cargo que representam o código de funcionários, um caractere que sempre será # e o código do cargo do funcionário (1,2,3,4,etc...). Além disso, o mapa referenciado por g conterá Doubles que representam o salário. O parâmetro cargo, indica qual o código do cargo do funcionário que será usado para calcular a média dos salárias. Ao invocar o calculaMedia, como por exemplo, utilizados para calcular a média do salário, dado que eles são os únicos que possuem o código 1, conforme invocado em calculaMedia(m,1); Ou seja, o segundo parâmetro do método calculaMedia recebe o código do cargo que será utilizado para calcular as médias dos salários. Apenas funcionários com esse código de cargo serão considerados para calcular a média. Escreva APENAS o código que deve ser inserido no método calculaMedia. Como informativo, os códigos 1,2,3,etc, são códigos referentes aos tipos dos funcionários (analista, gerente, etc). O método calculaMedia deve retornar a média calculada. Considere que podem ser passados mapas nesse mesmo formato contendo centenas de valores, ou seja, não considere que serão apenas os 4 elementos inseridos no mapa pela classe DataBase.

```java
public class DataBase {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<String,Double>();
        m.put("1234#1",1000.70);
        m.put("553742#3",10000.50);
        m.put("12#2",1300.10);
        m.put("4343#1,1000.80");
        double med = calculaMedia(m,1);//essa chamada deve calcular a média dos salários dos funcionários com código do cargo 1.
        System.out.println(med);
    }

    public class ABC {
        public static double calculaMedia(Map<String,Double> g, int cargo)
        //código.
        //escreva seu código como se ele fosse ser inserido aqui.    
    }
}
```
___

> Questão 3

Observe o trecho de código em java abaixo.
1- public static void main(String[] args) {
2-   List listaCachorros = Dados.getDados();
3-   Collections.sort(listaCachorros);
4-   for(int i=0 ; i < listaCachorros.size(); i++){
5-     System.out.println(listaCachorros.get(i));
6-   }
7- }

Considere o código acima, não mude nada nele. Considere que a chamada a Dados.getDados() retorna uma lista contendo objetos do tipo cachorro. Insira no campo de resposta apenas o código da classe cachorro da seguinte maneira:

* (a) a classe cachorro deve ter os atributos privados nome(String), idade(int) e peso(double), além de seus getters e setters.

* (b) a classe cachorro deve ter dois construtores. Um vazio e um que faz a atribuição dos três atributos;

* (c) a linha 3 deve ordenar a lista pela idade dos cachorros, de maneira crescente.

* (d) a linha 5, ao ser invocada, deve exibir no console os valores dos atributos nome, idade e peso de cada cachorro separados por um traço e com um "kg" ao final. EX: "Bidu - 15 - 30kg". Vale destacar, que por conta do item(c), o resultado deve sair ordenado.