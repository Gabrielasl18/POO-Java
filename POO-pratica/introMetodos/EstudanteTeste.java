/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introMetodosTeste;

import introMetodos.Estudante;
/**   
  alta coesão - fazendo pouca coisa, fácil de alterar,mexer.
  altamente acoplada - a classe e o método, eles têm uma relação muito forte
  @author gabriela
 */
public class EstudanteTeste {
    public static void main(String[] args){

        Estudante estudante = new Estudante();
        estudante.setNome("Maria Eduarda"); //agora tem qu epassar como argumento o nome, não iniciar uma variável
        estudante.setIdade(12);
        estudante.setNotas(new double[]{8.5,7.5,10.0});     
        estudante.print();
        estudante.printMedia();
        System.out.println("Aprovado?" + estudante.isAprovado());
    }     
}
