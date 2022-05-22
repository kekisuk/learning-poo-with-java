package functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public abstract class Buscar extends Usuario{
    public Buscar(){}
    public void buscar() {
        try {
        	 
            String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno que deseja buscar:");
            boolean exists = (new File(cpf+".txt")).exists();
            
            if (exists){
            	  
                FileReader ler = new FileReader(cpf+".txt");     
                BufferedReader reader = new BufferedReader(ler);
                String linha;
                String frase = "";
                
                while((linha = reader.readLine()) != null){
                    //System.out.println(linha);
                    frase = frase + linha + "\n";
                }
                JOptionPane.showMessageDialog(null, frase);
                
                reader.close();
            } else {//Se não existe, cria o arquivo...
            	JOptionPane.showMessageDialog(null, "Cliente não encontrado na base de dados!");
            }
          
            
        } catch (IOException e) {
            e.printStackTrace();
        	JOptionPane.showMessageDialog(null, "Erro ao criar/ler arquivo!");
        }
    }
}
