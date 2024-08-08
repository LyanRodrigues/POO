package ProvaSuficiencia.Questao1;

public class Estudante extends Passageiro {
    String escola;

    public Estudante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public float getTarifa() {
        return (float) TARIFA_INTEIRA / 2;
    }
}
