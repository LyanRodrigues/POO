package ProvaSuficiencia.Questao1;

public class Idoso extends Passageiro {
    private String RG;  // Atributo para o RG do idoso

    public Idoso(String nome, int idade, String RG) throws IllegalArgumentException {
        super(nome, idade);
        if (idade < 60) {
            throw new IllegalArgumentException("Idoso deve ter 60 anos ou mais.");
        }
        this.RG = RG;
    }

    @Override
    public float getTarifa() {
        return 0.00f;  // Idosos não pagam tarifa
    }

    public String getRG() {
        return RG;
    }

    @Override
    public String toString() {
        return super.toString() + ", RG: " + RG;
    }
}
