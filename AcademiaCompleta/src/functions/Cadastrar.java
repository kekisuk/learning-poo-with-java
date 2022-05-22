package functions;

import static functions.Modalidade.CROSSFIT;
import static functions.Modalidade.DANCA;
import static functions.Modalidade.GINASTICA;
import static functions.Modalidade.IOGA;
import static functions.Modalidade.JIU_JITSU;
import static functions.Modalidade.JUMP;
import static functions.Modalidade.KARATE;
import static functions.Modalidade.MUSCULACAO;
import static functions.Modalidade.NATACAO;
import static functions.Modalidade.PILATES;
//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public abstract class Cadastrar extends Usuario {
    public Cadastrar(){}
    public void cadastrar() {
        int option;
        int s_n;
        String sim_nao = "";
        Usuario usuario = new Usuario();
        SelecionarModalidade selecionarModalidade = new SelecionarModalidade(); 
        
        usuario.setCPF(JOptionPane.showInputDialog("Digite o CPF do cliente:"));
        usuario.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:"));
        usuario.setIdade(JOptionPane.showInputDialog("Digite a idade do cliente:"));
        usuario.setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente:"));
        option = Integer.parseInt((JOptionPane.showInputDialog("Digite o número da modalidade que o cliente deseja se matricular:\n"
        + "1 - MUSCULAÇÃO\n"
        + "2 - CROSSFIT\n"
        + "3 - DANÇA\n"
        + "4 - KARATÊ\n"
        + "5 - JIU-JITSU\n"
        + "6 - NATAÇÃO\n"
        + "7 - IOGA\n"
        + "8 - PILATES\n"
        + "9 - JUMP\n"
        + "10 - GINÁSTICA")));
        
        switch(option) {
        case 1: {
            selecionarModalidade.setModalidadeEscolhida(MUSCULACAO);
            break;
        }
        case 2: {
            selecionarModalidade.setModalidadeEscolhida(CROSSFIT);
            break;
        }
        case 3: {
            selecionarModalidade.setModalidadeEscolhida(DANCA);
            break;
        }
        case 4: {
            selecionarModalidade.setModalidadeEscolhida(KARATE);
            break;
        }
        case 5: {
            selecionarModalidade.setModalidadeEscolhida(JIU_JITSU);
            break;
        }
        case 6: {
            selecionarModalidade.setModalidadeEscolhida(NATACAO);
            break;
        }
        case 7: {
            selecionarModalidade.setModalidadeEscolhida(IOGA);
            break;
        }
        case 8: {
            selecionarModalidade.setModalidadeEscolhida(PILATES);
            break;
        }
        case 9: {
            selecionarModalidade.setModalidadeEscolhida(JUMP);
            break;
        }
        case 10: {
            selecionarModalidade.setModalidadeEscolhida(GINASTICA);
            break;
        }
        default: break;
        }
        
        usuario.setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente:"));
        
        s_n = Integer.parseInt ((JOptionPane.showInputDialog("O pagamento foi realizado?\n"
        		+ "Digite um dos números abaixo para escolher:\n"
        		+ "1 - Sim\n"
        		+ "2 - Não\n")));
        if(s_n == 1) {
            int op;
            op = Integer.parseInt(JOptionPane.showInputDialog("Foi com dinheiro ou cartão?\n"
            		+ "Digite um dos números abaixo para escolher:\n"
                    + "1 - Dinheiro\n"
                    + "2 - Cartão"));
            if(op == 1) {
                MetodoPagamento metodo_pagamento = new MetodoPagamento();
                metodo_pagamento.pagamento();//MetodoPagamento.java = dinheiro
                sim_nao = "realizado com dinheiro.";
            }else if(op == 2) {
                usuario.pagamento();//Usuario.java = cartão
                sim_nao = " realizado com cartão.";
            } else {
                sim_nao = "Método de pagamento não informado!";
            }
        }else if(s_n == 2) {
            sim_nao = "não realizado na matrícula!";
        }
        
        try {
            //Conteúdo concatenado
            String content = "CPF: " + usuario.getCPF() + "\n"
                    + "Nome: " + usuario.getNome() + "\n"
                    + "Idade: " + usuario.getIdade() + "\n"
                    + "Endereço: " + usuario.getEndereco() + "\n"
                    + "Modalidade: " + selecionarModalidade.getModalidadeEscolhida() + "\n"
                    + "Telefone: " + usuario.getTelefone() + "\n"
                    + "Pagamento " + sim_nao;

	    // Cria arquivo
	    File file = new File(usuario.getCPF()+".txt");

	    // Se o arquivo nao existir, ele gera
	    if (!file.exists()) {
	        file.createNewFile();
	    }

	    // Prepara para escrever no arquivo
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	            
	    // Escreve e fecha arquivo
	    bw.write(content);
	    bw.close();
	           
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao criar/ler arquivo!");
        }
    }
}
