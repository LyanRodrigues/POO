package ProvaSuficiencia.Questao1;

import java.sql.Date;

public class Viagem {
    String placaOnibus;
    String nomeMotorista;
    Date dataViagem;

    public void addPassageiro(Passageiro p){
    }

    public float getValorTotal(){
        return 0;
    }

    public Viagem(String placaOnibus, String nomeMotorista, Date dataViagem) {
        this.placaOnibus = placaOnibus;
        this.nomeMotorista = nomeMotorista;
        this.dataViagem = dataViagem;
    }
}
