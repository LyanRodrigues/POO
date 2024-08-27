package com.furb.poo.Aula.Lista1.Questao1;



public class Pessoa {
    double altura;
    double peso;

    double calcularIMC(){
        return peso/(altura*altura);
    }
}