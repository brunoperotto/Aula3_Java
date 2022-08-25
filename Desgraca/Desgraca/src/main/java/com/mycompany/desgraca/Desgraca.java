/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.desgraca;

import javax.swing.JOptionPane;

/**
 *
 * @author Brunotto
 */
public class Desgraca {

    public static void main(String[] args) {
        String nome, s;
        int idade;
        boolean x;
        char sexo;
        byte b;
        short c;
        float d;

        nome = JOptionPane.showInputDialog("Seja bem-vindo"); //JOptionPane só funciona com var string
        System.out.println("O nome digitado foi... " + nome);

        s = JOptionPane.showInputDialog("Insira sua idade: ");
        idade = Integer.parseInt(s); //converte variável string para int e armazena na nova variável int, de -2147483648 e 2147483647 (32bit)
        idade = idade + 3;
        System.out.println("A sua idade é.. " + idade);

        x = true;
        System.out.println("X é " + x);

        x = !x; //A exclamação antes da variável é compreendida como uma negação do valor informado, na lógica booleana
        System.out.println("O valor negado de X é " + x);

        s = JOptionPane.showInputDialog("Informe o sexo: ");
        sexo = s.charAt(0); //Converte o valor da string s para char, recebendo o caractere da posição entre parêntese
        System.out.println("O sexo é " + sexo);

        s = JOptionPane.showInputDialog("Informe sua idade real: ");
        b = Byte.parseByte(s); //Converte a string s para o tipo de variável byte, formado por 8 bits (-128, 127)
        System.out.println("A idade real mesmo do indivíduo é " + b);

        s = JOptionPane.showInputDialog("Informe o número da casa ");
        c = Short.parseShort(s); //Converte a string s para o tipo de variável Short, de -32mil a +32mil aproximadamente (16bits)
        System.out.println("Mora na casa " + c);

        s = JOptionPane.showInputDialog("Insira sua altura ");
        d = Float.parseFloat(s); //Float aceita inclusive números com casas decimais
        System.out.println("Altura: " + d);

        //alt+shift+F (atalho que corrige a identação)
    }
}
