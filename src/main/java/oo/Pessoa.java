package oo;

public class Pessoa {
    static int id = 0;
    int meuId;
    String nome;
    int idade;
    
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 10;
        this.id++;
        this.meuId = id;
    }
    
    public void exibirDados(){
        System.out.printf("Id: %d, Nome: %s, Idade: %d\n", meuId, nome, idade);
    }
}
