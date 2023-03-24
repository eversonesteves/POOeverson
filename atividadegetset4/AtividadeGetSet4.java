/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadegetset4;

/**
 *
 * @author everson.silva
 */
public class AtividadeGetSet4 {

    public static void main(String[] args) {
        data data1 = new data();
        data1.setDia(21);
        data1.setMes(07);
        data1.setAno(2000);
        System.out.println(data1.mostrarData());
        System.out.println(data1.proximoDia() + "\n");
        
        data data2 = new data();
        data2.setDia(31);
        data2.setMes(12);
        data2.setAno(2022);
        System.out.println(data2.mostrarData());
        System.out.println(data2.proximoDia() + "\n");
        
        data data3 = new data();
        data3.setDia(31);
        data3.setMes(3);
        data3.setAno(2004);
        System.out.println(data3.mostrarData());
        System.out.println(data3.proximoDia() + "\n");
    }
}
