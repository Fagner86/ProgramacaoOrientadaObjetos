
package Prova01;

import java.awt.List;

public class Filme {
    private int codigoFilme;
    private String nomeFilme;
    private String sinopseFilme;
    private String generoFilme;
        
    //get e set
    public int getCodigoFilme()
    {
        return this.codigoFilme;
    }
    public void setCodigoFilme(int cod)
    {
        this.codigoFilme=cod;
    }
    
    public String getNomeFilme()
    {
        return this.nomeFilme;
    }
    public void setNomeFilme(String nom)
    {
        this.nomeFilme=nom.toLowerCase();
    }
    
      public String getGeneroFilme()
    {
        return this.generoFilme;
    }
    public void setGeneroFilme(String tipo)
    {
        this.generoFilme=tipo.toLowerCase();
    }
    
    public String getSinopseFilme()
    {
        return this.sinopseFilme;
    }
    public void setSinopseFilme(String descricao)
    {
        this.sinopseFilme=descricao.toLowerCase();
    }
     Filme(int codigo,String nome,String genero,String sinopse)
    {
        this.codigoFilme=codigo;
        this.nomeFilme=nome.toLowerCase();
        this.generoFilme=genero.toLowerCase();
        this.sinopseFilme=sinopse.toLowerCase();
    }

    @Override
    public String toString() {
        return  getNomeFilme(); //To change body of generated methods, choose Tools | Templates.
    }
      
}