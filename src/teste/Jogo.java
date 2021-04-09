/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author carolayne
 */
public class Jogo extends JFrame {

    private Baralho baralho;
    private Jogador jogadorUm;
    private Jogador jogadorDois;
    
    // panels
    private JPanel panel;
    private JPanel mainPanel;
    private JPanel menuPanel;
    
    // buttons
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botao10;
    
    private JTextField pontuacaoJogadorUm;
    private JTextField pontuacaoJogadorDois;
    
    /**
     * Creates new form  Jogo
     */
    public Jogo() {
        this.baralho = new Baralho();
        this.jogadorUm = new Jogador("Carolayne", baralho.puxarMao());
        this.jogadorDois = new Jogador("Carol", baralho.puxarMao());
        
        this.panel = new JPanel();
        this.panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new GridLayout(2, 5, 30, 30));
        
        this.menuPanel = new JPanel();
        this.menuPanel.setLayout(new FlowLayout());
        
        
        JLabel labelPontuacaoJogadorUm = new JLabel("Jogador UM");
        JLabel labelPontuacaoJogadorDois = new JLabel("Jogador DOIS");
        
        this.pontuacaoJogadorUm = new JTextField(0);
        this.pontuacaoJogadorUm.setColumns(10);
        this.pontuacaoJogadorUm.setEditable(false);
        this.pontuacaoJogadorDois = new JTextField(0);
        this.pontuacaoJogadorDois.setColumns(10);
        this.pontuacaoJogadorDois.setEditable(false);
        
    
        this.botao1 = new JButton(this.jogadorUm.getMao().get(0).getImagem());
        this.botao2 = new JButton(this.jogadorUm.getMao().get(1).getImagem());
        this.botao3 = new JButton(this.jogadorUm.getMao().get(2).getImagem());
        this.botao4 = new JButton(this.jogadorUm.getMao().get(3).getImagem());
        this.botao5 = new JButton(this.jogadorUm.getMao().get(4).getImagem());
        this.botao6 = new JButton(this.jogadorDois.getMao().get(0).getImagem());
        this.botao7 = new JButton(this.jogadorDois.getMao().get(1).getImagem());
        this.botao8 = new JButton(this.jogadorDois.getMao().get(2).getImagem());
        this.botao9 = new JButton(this.jogadorDois.getMao().get(3).getImagem());
        this.botao10 = new JButton(this.jogadorDois.getMao().get(4).getImagem());
        
        // mainPanel
        this.mainPanel.add(botao1);
        this.mainPanel.add(botao2);
        this.mainPanel.add(botao3);
        this.mainPanel.add(botao4);
        this.mainPanel.add(botao5);
        this.mainPanel.add(botao6);
        this.mainPanel.add(botao7);
        this.mainPanel.add(botao8);
        this.mainPanel.add(botao9);
        this.mainPanel.add(botao10);
        
        // menuPanel
        this.menuPanel.add(labelPontuacaoJogadorUm);
        this.menuPanel.add(pontuacaoJogadorUm);
        this.menuPanel.add(labelPontuacaoJogadorDois);
        this.menuPanel.add(pontuacaoJogadorDois);
        
        
        this.panel.add(mainPanel);
        this.panel.add(menuPanel);
        this.add(panel); 
        
        
        this.calcularPontuacao();
    }
    
    public void calcularPontuacao() {
    	Integer pontosJogadorUm = 0;
    	Integer pontosJogadorDois = 0;
    	
    	for(int i = 0; i < 5; i++) {
    		int pontosCartaJogadorUm = this.jogadorUm.getMao().get(i).getCarta().getPontos();
    		int pontosCartaJogadorDois = this.jogadorDois.getMao().get(i).getCarta().getPontos();
    		
    		
    		if(pontosCartaJogadorUm > pontosCartaJogadorDois) {
    			pontosJogadorUm += pontosCartaJogadorUm + pontosCartaJogadorDois;
    		} else if(pontosCartaJogadorUm < pontosCartaJogadorDois){
    			pontosJogadorDois += pontosCartaJogadorUm + pontosCartaJogadorDois;
    		}
    	}
    	
    	 this.pontuacaoJogadorUm.setText(pontosJogadorUm.toString());
    	 this.pontuacaoJogadorDois.setText(pontosJogadorDois.toString());
    }
    
    

    public static void main(String args[]) {
    	Jogo jogo = new Jogo();
    	jogo.setSize(1000, 1000);
    	jogo.setVisible(true);
    }
}
