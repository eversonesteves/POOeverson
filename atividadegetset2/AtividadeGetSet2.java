/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadegetset2;

/**
 *
 * @author everson.silva
 */
public class AtividadeGetSet2 {

    public static void main(String[] args) {
        Empregado Everson = new Empregado();
        Everson.setPrimeiroNome("Everson");
        Everson.setSobrenome("Esteves");
        Everson.setSalarioMensal(1000);
        Everson.mostrarInformacoes();
        
        Empregado Ilda = new Empregado();
        Ilda.setPrimeiroNome("Ilda");
        Ilda.setSobrenome("Maria");
        Ilda.setSalarioMensal(1500);
        Ilda.mostrarInformacoes();
    }
}
