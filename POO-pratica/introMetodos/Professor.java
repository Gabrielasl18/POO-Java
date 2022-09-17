
package introMetodos;
/*
 *
 * @author gabriela
 */
public class Professor {
    
    public String name;
    public String registration;
    public String RG;
    public String CPF;
    

    public void imprime(){ //vai passar o endereço do objeto
       
        System.out.println(this.name); // this é ultilizada quando eu quero pegar os valores do próprio objeto 
        System.out.println(this.RG);
        System.out.println(this.registration);
        System.out.println(this.CPF);
    }
}

