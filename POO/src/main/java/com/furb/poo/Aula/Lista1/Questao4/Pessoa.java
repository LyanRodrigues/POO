package com.furb.poo.Aula.Lista1.Questao4;

public class Pessoa {
    String nome;
    double altura;
    double peso;

    double calcularIMC(){
        return peso/(altura*altura);
    }
}