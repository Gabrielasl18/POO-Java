package introClassesTeste;

import introClasses.Professor;
/**
 *
 * @author gabriela
 */
public class ProfessorTeste {
    
    public static void main(String[] args){
        Professor professor = new Professor();
        
        professor.name = "Claudia";
        professor.RG = "199.938.03";
        professor.CPF = "179.484.687-57";
        professor.registration = "MNR233";
        
        Professor professor2 = new Professor();
        professor2.name = "José";
        professor2.RG = "123.456.05";
        professor2.CPF = "083.333.567-12";
        professor2.registration = "POTGH65";

        System.out.println(professor.name);
        System.out.println(professor.registration);
        System.out.println(professor.RG);
        System.out.println(professor.CPF);
        System.out.println("\n");
        System.out.println(professor2.name);
        System.out.println(professor2.registration);
        System.out.println(professor2.RG);
        System.out.println(professor2.CPF);
        //2 variáveis distintas  diferenciando objetos diferentes, mas do tipo PROFESSOR
        professor = professor2; //duplica, pois igualou os objetos

    }
}
