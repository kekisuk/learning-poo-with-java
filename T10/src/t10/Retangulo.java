/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10;

/**
 *
 * @author Olavo Cartaxo
 */
public class Retangulo extends Operacao{
    private double base;
    private double altura;
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcular(double base, double altura) {
        System.out.println("CÁLCULO DA ÁREA DO RETÂNGULO:");
        base = getBase();
        altura = getAltura();
        
        double resultado;
        resultado = base * altura;
        System.out.println("Resultado: " + resultado);
    }
}
