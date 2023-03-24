/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesgetset1;

/**
 *
 * @author everson.silva
 */
public class AtividadesGetSet1 {
    public static void main(String[] args) {
        Fatura item1 = new Fatura();
        item1.setNumeroItem(753);
        item1.setDescricao("Bolacha");
        item1.setQuantidadeComprada(6);
        item1.setValorUnitario(2);
        System.out.println(item1.getDescricao() + " - Valor total: " + item1.valorFatura() + "\n");

        Fatura item2 = new Fatura();
        item2.setNumeroItem(456);
        item2.setDescricao("Toddynho");
        item2.setQuantidadeComprada(-2);
        item2.setValorUnitario(15.0);
        System.out.println(item2.getDescricao() + " - Valor total: " + item2.valorFatura() + "\n");

        Fatura item3 = new Fatura();
        item3.setNumeroItem(75632);
        item3.setDescricao("Pão de Queijo");
        item3.setQuantidadeComprada(10);
        item3.setValorUnitario(3.5);
        System.out.println(item3.getDescricao() + " - Valor total: " + item3.valorFatura() + "\n");

    }
}

