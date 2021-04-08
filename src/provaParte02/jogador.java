
package provaParte02;

public class jogador {
    

    private static int cartasNoJogo = 5;
    private final String nome;
    private final  CartasB[] mao; 
    private final int pontos;

    public static void setCartasNoJogo(int cartasNoJogo) {
        jogador.cartasNoJogo = cartasNoJogo;
    }

    public static int getCartasNoJogo() {
        return cartasNoJogo;
    }

    public String getNome() {
        return nome;
    }

    public CartasB[] getMao() {
        return mao;
    }

    public int getPontos() {
        return pontos;
    }
  
    public jogador(String nome, CartasB[] mao, int pontos) {
        this.nome = nome;
        this.mao = mao;
        this.pontos = 0;
    }
  

}
