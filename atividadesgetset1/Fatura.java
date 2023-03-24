/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadesgetset1;

/**
 *
 * @author everson.silva
 */
public class Fatura {
    private int numeroItem;
    private String descricao;
    private int quantidadeComprada;
    private double valorUnitario;

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
    
    public String getDescricao() {
        return "Descrição do item " + numeroItem + ": " + descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    
    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    
    public void setValorUnitario (double valorUnitario) {
        if (valorUnitario < 5) {
            this.valorUnitario = valorUnitario;
        } else {
            this.valorUnitario = 5;
        }
    }
    public double valorFatura () {
        return quantidadeComprada * valorUnitario;
    }
}