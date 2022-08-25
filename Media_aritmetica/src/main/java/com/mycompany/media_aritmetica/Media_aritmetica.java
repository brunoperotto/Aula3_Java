/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.media_aritmetica;
import javax.swing.JOptionPane;

/**
 *
 * @author BrunoTTo
 */
public class Media_aritmetica {

    public static void main(String[] args) {
        String s;
        float n1, n2, media;
        
        s = JOptionPane.showInputDialog("Informe a nota 1: ");
        n1 = Float.parseFloat(s);
        System.out.println("Nota 1: "+n1);
        
        s = JOptionPane.showInputDialog("Informe a nota 2: ");
        n2 = Float.parseFloat(s);
        System.out.println("Nota 2: "+n2);
        
        media = (n1+n2)/2;
        
        System.out.println("Media: "+media);
        
    }
}
