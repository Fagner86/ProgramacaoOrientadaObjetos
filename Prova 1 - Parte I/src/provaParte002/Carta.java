/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaParte002;



/**
 *
 * @author carolayne
 */
public enum Carta {
    DOIS("2", 2),
    TRES("3", 3),
    QUATRO("4", 4),
    CINCO("5", 5),
    SEIS("6", 6),
    SETE("7", 7),
    OITO("8", 8),
    NOVE("9", 9),
    DEZ("10", 10),
    J("Valete", 11),
    Q("Dama", 12),
    k("Rei", 13),
    A("Áz", 14);
    ;
        
    private final String nome;
    private final int pontos;

    private Carta(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }
   

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

  
}
