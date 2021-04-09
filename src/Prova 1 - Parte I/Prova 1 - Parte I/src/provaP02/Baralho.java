/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaP02;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author carolayne
 */
public class Baralho {

    private List<CartaBaralho> cartas;

    public Baralho() {
        this.cartas = this.geraBaralho();

    }
    
    public CartaBaralho puxarCarta(){
        CartaBaralho carta = this.cartas.get(0);
        this.cartas.remove(0);
        
        return carta;
    }
    public List<CartaBaralho> puxarMao(){
        List<CartaBaralho> mao = new ArrayList<>();
        
        mao.add(this.puxarCarta());
        mao.add(this.puxarCarta());
        mao.add(this.puxarCarta());
        mao.add(this.puxarCarta());
        mao.add(this.puxarCarta());
        
        return mao;
    }
    
    
    public List<CartaBaralho> geraBaralho() {
        List<CartaBaralho> baralho = new ArrayList<>();

        for (Naipe naipe : Naipe.values()) {
            for (Carta carta : Carta.values()) {
                
                URL caminhoImagem = getClass().getClassLoader().getResource(carta.getPontos() + naipe.getNome() + ".png");
                
                baralho.add(new CartaBaralho(carta, naipe, new ImageIcon(caminhoImagem)));
            }
        }

        Collections.shuffle(baralho);
        
        return baralho;

    }

}
