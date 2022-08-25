/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculoimc;

import javax.swing.JOptionPane;

/**
 *
 * @author BrunoTTo
 */
public class CalculoIMC {

    public static void main(String[] args) {

        String s;

        Pessoa cidadao = new Pessoa(); //instancia o objeto

        s = JOptionPane.showInputDialog("Informe o nome: ");
        cidadao.nome = s;
        System.out.println("Nome: " + cidadao.nome);

        s = JOptionPane.showInputDialog("Informe a idade: ");
        cidadao.idade = Byte.parseByte(s);
        System.out.println("Idade: " + cidadao.idade);

        s = JOptionPane.showInputDialog("Informe a altura: ");
        cidadao.altura = Float.parseFloat(s);
        System.out.println("Altura: " + cidadao.altura);

        s = JOptionPane.showInputDialog("Informe o peso: ");
        cidadao.peso = Float.parseFloat(s);
        System.out.println("Peso: " + cidadao.peso);

        cidadao.IMC = (float) (cidadao.peso / (Math.pow(cidadao.altura, 2)));
        System.out.println("IMC: " + cidadao.IMC);
    }
}
