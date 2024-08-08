package ProvaSuficiencia.Questao1;

public class Estudante extends Passageiro {
    private String escola;  // Atributo para o nome da escola do estudante

    public Estudante(String nome, int idade, String escola) {
        super(nome, idade);
        this.escola = escola;
    }

    @Override
    public float getTarifa() {
        return (float) TARIFA_INTEIRA / 2;  // Estudantes pagam metade da tarifa
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola: " + escola;
    }
}
