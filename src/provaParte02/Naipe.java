
package provaParte02;

/**
 *
 * @author Fagner
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
