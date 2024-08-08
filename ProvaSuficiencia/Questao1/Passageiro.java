package ProvaSuficiencia.Questao1;

public abstract class Passageiro {
    protected static final double TARIFA_INTEIRA = 5.00;  // Atributo de classe
    protected String nome;
    protected int idade;

    public Passageiro(String nome, int idade) { // Construtor
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter a tarifa, padrão definido na classe base
    public float getTarifa() {
        return (float) TARIFA_INTEIRA;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Tarifa: " + getTarifa();
    }
}
