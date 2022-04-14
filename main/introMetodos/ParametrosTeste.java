package introMetodosTeste;

import introMetodos.Calculadora;

/**
 *
 * @author gabriela
 */
public class ParametrosTeste {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int num1 = 20;  
        int num2 = 60;
        calc.alteraDoisNumeros(num1, num2);
    }    
}
