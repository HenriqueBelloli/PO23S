/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pratica09;

/**
 *
 * @author hbel
 */
public class Professor implements Funcionario {

    String nome;
    double cargahoraria;

    @Override
    public double calcularSalario() {
        return cargahoraria * 60;
    }

    public Professor(String nome, double cargahoraria) {
        this.nome = nome;
        this.cargahoraria = cargahoraria;
    }

}
