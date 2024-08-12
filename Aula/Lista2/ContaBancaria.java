package Aula.Lista2;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void status(){
        System.out.println("Titular: "+ getTitular() 
        + "\nSaldo: R$"+ getSaldo());
    }

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Valor deve ser maior que zero.");
        } else {
            System.out.println("valor de R$"+valor+" reais depositado na conta de "+ getTitular()+".");
            this.setSaldo(getSaldo()+valor);
        }
    }
    public void sacar(double valor){
        if(valor>getSaldo()){
            System.out.println("valor não disponivel para saque.");
        } else {
            System.out.println("valor de R$"+valor+" reais retirado da conta de "+ getTitular()+".");
            setSaldo(getSaldo()-valor);
        } 
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria nova = new ContaBancaria("Thomas", 0);
        nova.depositar(100);
        nova.status();
        nova.sacar(50);
        nova.status();

        teclado.close();
    }
}
