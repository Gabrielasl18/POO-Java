/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargaconstrutoresTeste;

import sobrecargaconstrutores.Estudante;
/**
 *
 * @author gabriela
 */
public class EstudanteTeste {
    public static void main(String[] args){
        Estudante estudante = new Estudante("21222BCC","Carla",new double[]{9.5,7.6,8},"11/04/2006");
        estudante.print();
    }
}
