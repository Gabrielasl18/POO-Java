package introMetodos;
/*
 * @author gabriela
 */
public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    } 
    public void subtraiDoisNumeros(){
        System.out.println(5-5);
    }
    public void multiplicacaoDoisNumeros(double num1,double num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1,double num2) {
        if(num2 != 0){
            return num1/num2;
        }
        return 0;
    }
    public void imprimeDoisNumerosDivididos(int num1,int num2){
      if(num2 != 0){
            System.out.println(num1/num2);
            return;//funciona como um break,ele não avança.
        }
      System.out.println("não é possível dividir por zero!");
        
    }
    public void alteraDoisNumeros(int num1,int num2){
        num1 = 50;
        num2 = 30;  
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
        System.out.println("dentro do teste");
    }
   public void somaArray(int[] numbers){
        int soma = 0;
        for(int num : numbers){
            soma += num;
       }
       System.out.println(soma);
    }
    public void somaVarArgs(int... numbers){//nao necessariamente precisa de uum argumento do tipo ARRAY
         int soma = 0;
        for(int num : numbers){
            soma += num;
       }
       System.out.println(soma);
    }
}
