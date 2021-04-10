/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaParte002;

import javax.swing.ImageIcon;

/**
 *
 * @author carolayne
 */
public class CartaBaralho {

    private Carta carta;
    private Naipe naipe;
    private ImageIcon imagem;

    public CartaBaralho(Carta carta, Naipe naipe, ImageIcon imagem) {
        this.carta = carta;
        this.naipe = naipe;
        this.imagem = imagem;
    }

    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public ImageIcon getImagem() {
        return imagem;
    }
}
