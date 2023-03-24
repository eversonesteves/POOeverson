/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author everson.silva
 */
public class Empregado{
    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal >= 1320) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 1320;
        }
    }
    
    public double salarioAnual() {
        return salarioMensal * 12;
    }
    
    public double aumentoSalario() { 
        return salarioMensal * 1.1;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Nome: +" + primeiroNome + " " + sobrenome );
        System.out.println("Salário R$:" + salarioMensal);
        System.out.println("Salário anual R$:" + salarioAnual());
        System.out.println("Salário mensal após o reajute R$" + aumentoSalario() + "\n");
    }
}
