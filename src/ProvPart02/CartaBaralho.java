package ProvPart02;

import javax.swing.ImageIcon;

class CartaBaralho {

    private Carta carta;
    private Naipe naipe;
    private ImageIcon imagem;
   private String[] images = {"src/imagem/cartaA.jpg", "src/imagem/Carta2.png", "src/imagem/Carta3.png", "src/imagem/Carta4.png",
        "src/imagem/Carta5.jpg", "src/imagem/Carta6.png", "src/imagem/Carta7.jpg", "src/imagem/Carta8.png",
        "src/imagem/Carta9.png", "src/imagem/Carta10.png"};
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

    public static CartaBaralho[] geraBaralho() {
        
        int tamanhoBaralho = Naipe.values().length * Carta.values().length;
        CartaBaralho baralho[] = new CartaBaralho[tamanhoBaralho];

        int idx = 0;

        for (Naipe naipe : Naipe.values()) {
            for (Carta carta : Carta.values()) {

                String caminhoImagem = carta.getPontos() + " "
                        + naipe.getNome() + ".png";

                baralho[idx++] = new CartaBaralho(carta, naipe, new ImageIcon(caminhoImagem));

            }
        }

        return baralho;
    }

    public static void main(String[] args) {
        CartaBaralho meuBaralho[] = CartaBaralho.geraBaralho();
        for (CartaBaralho minhaCarta : meuBaralho) {

            System.out.println(minhaCarta.getCarta().getNome() + " de "
                    + minhaCarta.getNaipe().getNome());
        }

    }
}
