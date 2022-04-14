package introMetodosTeste;

import introMetodos.Professor;
/**
                          DIAGRAMA DE CLASSE(UML)

                    ┌──►NOME DA CLASSE
                    │
                  ┌─┴───────────────────────────────┐
                  │                                 │
                  │             PROFESSOR           │
                  │                                 │
                  ├─────────────────────────────────┤
                  │ + Nome: STRING                  │
  O + DIZ QUE ◄───┤ + CPF: STRING                   │
  A CLASSE E PUBLI│ + RG: STRING                    │
                  │ + REGISTRATION: STRING          │
                  │ + print(): VOID                 ├───► ATRIBUTOS DA CLASSE
                  │ + print(prof:Professor): VOID   │
  O - DIZ QUE  ◄──┤ - Nome: STRING                  │
  A CLASSE E PRIV │                                 │
                  │                                 │
                  ├─────────────────────────────────┤
                  │                                 │
  METODOS     ◄───┤                                 │
                  └─────────────────────────────────┘
 * @author gabriela
 */
public class ProfessorTeste {
    public static void main(String[] args){

        Professor prof = new Professor();
        prof.CPF = "123.445.667-75";
        prof.registration = "2021222BCC";
        prof.RG = "11223-4";
        prof.name = "Marcos";

        Professor prof2 = new Professor();
        prof2.CPF = "179.484.687-57";
        prof2.registration = "132459ENG";
        prof2.RG = "22237-8";
        prof2.name = "Fernanda";

        prof.imprime();
        prof2.imprime();
    }
}
