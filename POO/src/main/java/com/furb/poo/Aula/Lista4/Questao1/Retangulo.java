/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.furb.poo.Aula.Lista4.Questao1;

/**
 * A classe Retangulo representa um retângulo com altura e comprimento.
 * Esta classe fornece métodos para calcular o perímetro e a área do retângulo.
 * Além disso, garante que altura e comprimento não sejam definidos com valores
 * não positivos.
 * 
 * @author liandrar
 */
public class Retangulo {
    private int altura;
    private int comprimento;

    /**
     * Construtor padrão que inicializa a altura e o comprimento como 0.
     */
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    
    /**
     * Construtor que inicializa a altura e o comprimento com os valores fornecidos.
     *
     * @param altura A altura do retângulo.
     * @param comprimento O comprimento do retângulo.
     */
    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    /**
     * Retorna a altura do retângulo.
     *
     * @return A altura do retângulo.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     * Não permite valores menores ou iguais a zero.
     *
     * @param altura A nova altura do retângulo.
     * @throws Exception Se o valor da altura for menor ou igual a zero.
     */
    public void setAltura(int altura) throws Exception {
        if(altura <= 0){
            throw new Exception("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    /**
     * Retorna o comprimento do retângulo.
     *
     * @return O comprimento do retângulo.
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * Define o comprimento do retângulo.
     * Não permite valores menores ou iguais a zero.
     *
     * @param comprimento O novo comprimento do retângulo.
     * @throws Exception Se o valor do comprimento for menor ou igual a zero.
     */
    public void setComprimento(int comprimento) throws Exception {
        if(comprimento <= 0){
            throw new Exception("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    /**
     * Calcula e retorna o perímetro do retângulo.
     * O perímetro é a soma de todos os lados do retângulo.
     *
     * @return O perímetro do retângulo.
     */
    public int calcularPerimetro(){
        return ((getAltura() * 2) + (getComprimento() * 2));
    }
    
    /**
     * Calcula e retorna a área do retângulo.
     * A área é o produto da altura pelo comprimento.
     *
     * @return A área do retângulo.
     */
    public int calcularArea(){
        return (getAltura() * getComprimento());
    }
}
