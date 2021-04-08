/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaParte02;

import javax.swing.ImageIcon;


/**
 *
 * @author Fagner
 */
public class CartasB {

    private static ImageIcon ImageIcon(String srcimagemCarta8png) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  private Carta carta;
  private Naipe naipe;
  private ImageIcon imagA;

    public ImageIcon getImagA() {
        return imagA;
    }
  
    public CartasB(Carta carta, Naipe naipe, ImageIcon imagA) {
        this.carta = carta;
        this.naipe = naipe;
        this.imagA = imagA;
    }
    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }
  
    public static CartasB[] gerarBaralho(){
   
       int tamanhoB = Naipe.values().length * Carta.values().length;
        CartasB baralho[] = new CartasB[tamanhoB];

        int idx = 0;

        for (Naipe naipe : Naipe.values()) {
            for (Carta carta : Carta.values()) {

                String caminhoImagem = carta.getPontos() + " "
                        + naipe.getNome() + "src/imagem/Carta8.png";

                baralho[idx++] = new CartasB(carta, naipe, new ImageIcon(caminhoImagem));

            }
        }

        return baralho;
    }
    
    public static void main(String[ ] args){
       CartasB meuB [] = CartasB.gerarBaralho();
        for(CartasB minhaCarta : meuB)
            System.out.println(minhaCarta.getCarta().getNome() + " de " + minhaCarta.getNaipe().getNome());
   
      ImageIcon [] imagens=  new ImageIcon[2];
      imagens[0] = ImageIcon("src/imagem/Carta8.png");
    
    }}

 
    

