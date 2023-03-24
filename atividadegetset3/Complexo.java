/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadegetset3;

/**
 *
 * @author everson.silva
 */
public class Complexo {
    private int numeroReal1;
    private int numeroReal2;
    private int numeroComplexo1;
    private int numeroComplexo2;

    public int getNumeroReal1() {
        return numeroReal1;
    }

    public void setNumeroReal1(int numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public int getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal2(int numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }

    public int getNumeroComplexo1() {
        return numeroComplexo1;
    }

    public void setNumeroComplexo1(int numeroComplexo1) {
        this.numeroComplexo1 = numeroComplexo1;
    }

    public int getNumeroComplexo2() {
        return numeroComplexo2;
    }

    public void setNumeroComplexo2(int numeroComplexo2) {
        this.numeroComplexo2 = numeroComplexo2;
    }
    
    public String somaComplexo() {
        int somaReal = numeroReal1 + numeroReal2;
        int somaImaginario = numeroComplexo1 + numeroComplexo2;
        if (somaImaginario >= 0) {
            return somaReal + "+" + somaImaginario + "i\n";
        } else {
            return somaReal + "" + somaImaginario + "i\n";
        }
    }
}
