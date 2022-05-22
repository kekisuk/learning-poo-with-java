/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Olavo Cartaxo
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        int encomenda = -1;
        int embalagem = -1;
        String tipo_encomenda = null;
        String formato_embalagem = null;
        String cep_origem = null;
        String cep_destino = null;
        
        encomenda = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de encomenda:\n"
                + "1 - Mercadoria\n"
                + "2 - Documento"));        
        switch(encomenda) {
            case 1: tipo_encomenda = "Mercadoria";
            break;
            
            case 2: tipo_encomenda = "Documento";
            break;
            
            default: System.out.println("ERRO! Invalid Option! Try again.");
            break;               
        }
        
        embalagem = Integer.parseInt(JOptionPane.showInputDialog("Insira o formato da embalagem:\n"
                + "1 - Caixa/Pacote\n"
                + "2 - Envelope\n"
                + "3 - Rolo"));        
        switch(embalagem) {
            case 1: formato_embalagem = "Caixa/Pacote";
            break;
            
            case 2: formato_embalagem = "Envelope";
            break;
            
            case 3: formato_embalagem = "Rolo";
            break;
            
            default: System.out.println("ERRO! Invalid Option! Try again.");
            break;               
        }
        if(formato_embalagem == "Caixa/Pacote") {
            int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Caixa/Pacote\nComprimento em *cm:"));
            int largura = Integer.parseInt(JOptionPane.showInputDialog("Caixa/Pacote\nLargura em *cm:"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Caixa/Pacote\nAltura em *cm):"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Caixa/Pacote\nPeso em *g:"));
            System.out.println("Informações da Embalagem:\nFormato: Caixa/Pacote\n"
                    + "Comprimento: " + comprimento + "\n"
                    + "Largura: " + largura + "\n"
                    + "Altura: " + altura + "\n"
                    + "Peso: " + peso);
        } else if(formato_embalagem == "Envelope") {
            int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Envelope\nComprimento em *cm:"));
            int largura = Integer.parseInt(JOptionPane.showInputDialog("Envelope\nLargura em *cm:"));
            System.out.println("Informações da Embalagem:\nFormato: Envelope\n"
                    + "Comprimento: " + comprimento + "\n"
                    + "Largura: " + largura + "\n");
        } else if(formato_embalagem == "Rolo") {
            int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Rolo\nComprimento em *cm:"));
            int diametro = Integer.parseInt(JOptionPane.showInputDialog("Rolo\nDiÃ¢metro em *cm:"));
            System.out.println("Informaçoes da Embalagem:\nFormato: Rolo\n"
                    + "Comprimento: " + comprimento + "\n"
                    + "Diametro: " + diametro);
        }
        
        cep_origem = JOptionPane.showInputDialog("Insira o CEP de origem:");
        cep_destino = JOptionPane.showInputDialog("Insira o CEP de destino:");
        
        JOptionPane.showMessageDialog(null, "Informaçoes da encomenda:\n"
                + "\nTipo da encomenda: " + tipo_encomenda + "\n"
                        + "CEP de Origem: " + cep_origem + "\n"
                                + "CEP de destino: " + cep_destino + "\n"
                                        + "Formato da embalagem: " + formato_embalagem + "\n\n"
                                                + "Logo calcularemos o valor do envio dessa encomenda.\nObrigado pela paciÃªncia.");
    }
    
}
