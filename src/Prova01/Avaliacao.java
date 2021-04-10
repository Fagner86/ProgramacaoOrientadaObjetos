
package Prova01;

public class Avaliacao {
    private int codigoFilme;
    private String nomeFilme;
    private int notaFilme;
    private String comentarioFilme;
    
    ///get e set codigo 
    public int getCodigoFilme()
    {
        return this.codigoFilme;
    }
    public void setCodigoFilme(int cod)
    {
        this.codigoFilme=cod;
    }
    
    //get e set nome do filme
    public void setNomeFilme(String nome)
    {
        this.nomeFilme=nome.toLowerCase();
    }
    public String getNomeFilme()
    {
        return this.nomeFilme;                       
    }
    
    //get set nota do filme 
    public void setNotaFilme(int nota)
    {
        this.notaFilme=nota;
    }
    public int getNotaFilme()
    {
        return this.notaFilme;
    }
    
    //get e set comentario 
    public String getComentarioFilme()
    {
        return this.comentarioFilme;
    }
    public void setComentarioFilme(String comentario)
    {
        this.comentarioFilme=comentario.toLowerCase();
    } 
    
    Avaliacao(int codigo,String nome,int nota,String comentario)
    {
        this.codigoFilme=codigo;
        this.nomeFilme=nome.toLowerCase();
        this.notaFilme=nota;
        this.comentarioFilme=comentario.toLowerCase();
    }
}

