package com.furb.poo.Aula.Lista1.Questao2;


public class Pessoa {
    double altura;
    double peso;

    double calcularIMC(){
        return peso/(altura*altura);
    }
}