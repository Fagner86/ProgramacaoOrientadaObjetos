/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaP02;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 
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

    Icon getImage(int i, int height, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
