package ProvaSuficiencia.Questao1;

public class Main {
    public static void main(String[] args) {
        try {
            Passageiro p1 = new Idoso("Maria", 65, "123456789");
            Passageiro p2 = new Estudante("João", 17, "Escola XYZ");
            Passageiro p3 = new Passageiro("Carlos", 30) {};  // Instância anônima de Passageiro

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
