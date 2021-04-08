/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvPart02;

/**
 *
 * @author Fagner
 */
public class Jogador {

    private static int cartasNoJogo = 5;
    private final String nome;
    private final CartaBaralho[] mao;
    private final int pontos;

    public Jogador(String nome, CartaBaralho[] mao, int pontos) {
        this.nome = nome;
        this.mao = mao;
        this.pontos = 0;
    }

    public static int getCartasNoJogo() {
        return cartasNoJogo;
    }

    public String getNome() {
        return nome;
    }

    public CartaBaralho[] getMao() {
        
        return mao;
    }

    public int getPontos() {
        return pontos;
    }
    
    void adcionarPontuacao(){
        
        
    }
    
    
    
    

}
