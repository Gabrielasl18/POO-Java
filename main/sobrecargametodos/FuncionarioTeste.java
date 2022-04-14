package sobrecargametodosTeste;

import sobrecargametodos.Funcionario;

/**
 *
 * @author gabriela
 */
public class FuncionarioTeste {

    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Gabriela","179.484.687-57",8500,"1665-8");
        Funcionario funcionario2 = new Funcionario();
        funcionario.print();
        funcionario2.print();
    }    
}
