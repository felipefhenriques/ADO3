/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaCarroModel;

/**
 *
 * @author Felipe
 */
public class Carro{ 

private String modelo;
private int idcarro;
private int ano;
private double valor;
private int qtdCarros;

public Carro(){
    qtdCarros++;
    this.idcarro = qtdCarros;
    }

    public Carro(String modelo, int ano, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }



public Carro(int ID, int ano, double valor, String modelo){
    qtdCarros++;
    this.idcarro = qtdCarros;
    this.ano = ano;
    this.valor = valor;
    this.modelo = modelo;
}

public int getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
