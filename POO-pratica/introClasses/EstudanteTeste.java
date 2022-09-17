/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClassesTeste;

import introClasses.Estudante;

/**
 *
 * @author gabriela
 */
public class EstudanteTeste {
    public static void main(String[] args){
        
        Estudante Gabriela = new Estudante();
        /*iniciar um objeto precisa do new*/
        /*variável de referência chamada Gabriela do tipo Estudante, fazendo ref ao objeto do tipo Estudante e esse Estudante tem Nome, Registro e Idade(a Gabriela está acessando um espaço da memória)*/
        Gabriela.name = "Gabriela";
        Gabriela.registration = "1112";
        Gabriela.age = 19;
        
        System.out.println(Gabriela.name);
        System.out.println(Gabriela.registration);
        System.out.println(Gabriela.age);
    }
}
