/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaParte002;

import java.util.List;

/**
 *
 * @author carolayne
 */
public class Jogador {

    private static int cartasNoJogo = 5;

    private final String nome;
    private  List<CartaBaralho> mao;
    private  int pontos;

    public Jogador(String nome, List<CartaBaralho>mao) {
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

    public List<CartaBaralho> getMao() {
         
        return mao;
    }

    public void setMao(List<CartaBaralho> mao) {
		this.mao = mao;
	}

	public int getPontos() {
        return pontos;
    }

    public void adicionarPontuacao(CartaBaralho cartaUm , CartaBaralho cartaDois) {
        this.pontos = this.pontos + cartaUm.getCarta().getPontos() + cartaDois.getCarta().getPontos();
           
    }

}
