/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10;

import javax.swing.JOptionPane;

/**
 *
 * @author Olavo Cartaxo
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Cálculo da área da figura geométrica");
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a opção desejada: \n"
                + "1 - Triângulo \n"
                + "2 - Retângulo"));
        
        if(option == 1) {
            Triangulo triangulo = new Triangulo();
            double base;
            double altura;
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da base:"));
            triangulo.setBase(base);
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da altura:"));
            triangulo.setAltura(altura);
            System.out.println("Base: " + base + "\nAltura: " + altura);
            triangulo.calcular(base, altura);
        }else if (option == 2) {
            Retangulo retangulo = new Retangulo();
            double base;
            double altura;
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da base:"));
            retangulo.setBase(base);
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da altura:"));
            retangulo.setAltura(altura);
            System.out.println("Base: " + base + "\nAltura: " + altura);
            retangulo.calcular(base, altura);
        }
    }
    
}
