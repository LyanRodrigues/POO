package lista7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liandrar
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(String endereco, int area, Bairro bairro) {
    this.endereco = endereco;
    this.area = area;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public Bairro getBairro(){
        return bairro;
    }
    public void setBairro(Bairro bairro){
        this.bairro = bairro;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    public Finalidade getFinalidade(){
        return finalidade;
    }
    public double calcularIptu(){
        double totalIptu = 0;
        if (getFinalidade().equals(finalidade.RESIDENCIAL)){
            totalIptu =  getArea() * 1;
        } 
        if (getFinalidade().equals(finalidade.COMERCIAL)){
            if (getArea() <= 100){
                totalIptu = 500;
            }
            if (getArea() > 100 && getArea() < 400){
                totalIptu = 1000;
            }
            if (getArea() > 400){
                totalIptu = getArea() * 2.55;
            }
        }
        if (getFinalidade().equals(finalidade.INDUSTRIAL)){
            if (getArea() <= 2000){
                totalIptu = 1000;
            }
            if (getArea() > 2000){
                totalIptu = getArea() * 0.55;
            }
        }
        return totalIptu * bairro.getCoeficienteIptu();
    }
    
}
