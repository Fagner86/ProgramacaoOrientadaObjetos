/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaParte02;


import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author Fagner
 */       import java.awt.Component;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
 
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class imagensB {
     

    // Declara componentes
    JLabel rotulo;
    JLabel figura;
    BufferedImage imagem;
    URL url;
     
    public Container criaPainel()
    {
        // Cria painel
        JPanel painel = new JPanel();
         
        // Cria layout
        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
         
        // Cria componentes
        rotulo = new JLabel("Imagem - Picture");        
         
        // Tenta abrir uma imagem de uma url
        try
        {
            url = new URL("https://desenvolvimentoaberto.files.wordpress.com/2014/04/images.jpg");
            imagem = ImageIO.read(url);     
        }
        catch ( IOException e)
        {           
            e.printStackTrace();
        }
         
        // Cria uma figura e a exibe em um JLabel
        ImageIcon fig = new ImageIcon(imagem);
        figura = new JLabel(fig);       
         
        // Alinha componentes
        rotulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        figura.setAlignmentX(Component.CENTER_ALIGNMENT);
         
        // Adiciona componentes ao painel
        painel.add(rotulo);
        painel.add(Box.createVerticalStrut(10));
        painel.add(figura);     
         
        return painel;
    }
     
    // Cria GUI 
    public static void criaGUI()
    {
        // Cria formulario
        JFrame formulario = new JFrame("DA - Image");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        // cria nova instancia da classe
        imagensB pic = new imagensB();
         
        // Adiciona painel ao formulario
        formulario.setContentPane(pic.criaPainel());
         
        // Adiciona tamanho do formulario
        formulario.setSize(300,290);
         
        // Exibe formulario
        formulario.setVisible(true);
    }
 
    public static void main(String[] args) {
         
        // Thread do swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
             
            public void run() {
                // Mostra Gui
                criaGUI();              
            }
        });
    


       
         /**   String[] imagens = {"imagem/Carta10.png","imagem/Carta1.png", "imagem/Carta5.png"
};
         
     Random ran = new Random();
  
        // generating integer
        int nxt = ran.nextInt(2);
           System.out.printf("hihi "+imagens[1]);
           System.out.printf("\n ioiooioio: "+nxt +"\nsdgsg");
       }*/
}
}