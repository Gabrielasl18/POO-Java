package blocodeinicializacaoTest;

import blocodeinicializacao.Cliente;

/**
 *
 * @author gabriela
 */
public class ClienteTest {
    public static void main(String[] args){
        Cliente c = new Cliente();
        System.out.println("Exibindo a quantidade de parcelas possíveis");
        for(int parcela : c.getParcelas()){
            System.out.println(parcela);
        }
    }
}
