/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadegetset3;

/**
 *
 * @author everson.silva
 */
public class AtividadeGetSet3 {

    public static void main(String[] args) {
        Complexo exemplo1 = new Complexo();
        exemplo1.setNumeroReal1(6);
        exemplo1.setNumeroReal2(2);
        exemplo1.setNumeroComplexo1(5);
        exemplo1.setNumeroComplexo2(-1);
        System.out.println(exemplo1.somaComplexo());

        Complexo exemplo2 = new Complexo();
        exemplo2.setNumeroReal1(12);
        exemplo2.setNumeroReal2(4);
        exemplo2.setNumeroComplexo1(-3);
        exemplo2.setNumeroComplexo2(8);
        System.out.println(exemplo2.somaComplexo());
        
        Complexo exemplo3 = new Complexo();
        exemplo3.setNumeroReal1(2);
        exemplo3.setNumeroReal2(4);
        exemplo3.setNumeroComplexo1(-4);
        exemplo3.setNumeroComplexo2(-2);
        System.out.println(exemplo3.somaComplexo());
    }
}
