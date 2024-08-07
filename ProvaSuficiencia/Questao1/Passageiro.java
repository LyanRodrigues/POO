package ProvaSuficiencia.Questao1;

public class Passageiro {
    String nome;
    int idade;

    public float getTarifa(){
        return idade;
    }

    public Passageiro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
}
