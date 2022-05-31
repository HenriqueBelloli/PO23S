/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica09;

/**
 *
 * @author hbel
 */
public class Estagiario implements Funcionario {

    String nome;
    double cargahoraria;

    @Override
    public double calcularSalario() {
        return cargahoraria * 12.5;
    }

    public Estagiario(String nome, double cargahoraria) {
        this.nome = nome;
        this.cargahoraria = cargahoraria;
    }
}
