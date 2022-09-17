package introMetodosTeste;

import introMetodos.Calculadora;
/**
 *
 * @author gabriela
 */
public class CalculadoraTeste {

    public static void main(String[] args){
    
    Calculadora calc = new Calculadora();
    calc.somaDoisNumeros();
    calc.subtraiDoisNumeros();
    calc.multiplicacaoDoisNumeros(5,5);//recebe dois argumentos
    System.out.println(calc.divideDoisNumeros(20, 2));
    calc.imprimeDoisNumerosDivididos(100, 0);
    
    int[] numbers = {1,2,3,4,5};
    calc.somaArray(numbers);
    calc.somaVarArgs(1,2,3,4,5);
    }
}
