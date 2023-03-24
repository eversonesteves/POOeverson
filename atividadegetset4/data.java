/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadegetset4;

/**
 *
 * @author everson.silva
 */
public class data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            this.dia = 0;
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            this.mes = 0;
        } else {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 2000 || ano > 2025) {
            this.ano = 0;
        } else {
            this.ano = ano;
        }
    }
    
    public String mostrarData() {
        if (dia == 0 || mes == 0 || ano == 0){
            return "Data inválida, coloque uma data correta";
        } else {
            return dia + "/" + mes + "/" + ano;
        }
    }
    
    public String proximoDia() {
        if (dia == 0 || mes == 0 || ano == 0){
            return "Não há próximo dia, pois a data está incorreta";
        }
        if (dia == 31){
            dia = 1;
            if (mes == 12){
                mes = 1;
                ano++;
            } else {
                mes++;
            }
        } else {
            dia++;
        }
        return dia + "/" + mes + "/" + ano;
    }
}
