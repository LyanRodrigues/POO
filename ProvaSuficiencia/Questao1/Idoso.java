package ProvaSuficiencia.Questao1;

public class Idoso extends Passageiro {
    String RG;

    public float getTarifa() {
        return 0.00f;
    }

    public Idoso(String nome, int idade, String RG) throws IllegalArgumentException {
        super(nome, idade);
        if (idade < 60) {
            throw new IllegalArgumentException("Idoso deve ter 60 anos ou mais.");
        }
    }
}
