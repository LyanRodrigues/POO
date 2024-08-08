package ProvaSuficiencia.Questao1;

public abstract class Passageiro {
    protected static final double TARIFA_INTEIRA = 5.00;  // Atributo de classe
    protected String nome;
    protected int idade;

    public Passageiro(String nome, int idade) { //construtor
        this.nome = nome;
        this.idade = idade;
    }

    public float getTarifa() {
        return (float) TARIFA_INTEIRA;
    }
}
