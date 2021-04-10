/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaParte02;

/**
 *
 * @author carolayne
 */
public enum Naipe {
    
    PAUS("paus"), OURO("ouro"), COPAS("copas"), ESPADA("espada");
    
    private final String nome;  

    public String getNome() {
        return nome;
    }

    private Naipe(String nome) {
        this.nome = nome;
    }
 
    
}
