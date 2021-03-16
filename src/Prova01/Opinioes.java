
package Prova01;

public class Opinioes {
     private Avaliacao[] feed;
     
    Opinioes(Avaliacao[] feed)
    {
        this.feed=feed;
    }
    
      public Avaliacao[] getFeed()
    {
        return this.feed;
    }
    public void setFeedback(Avaliacao[] opiniao)
    {
        this.feed=opiniao;
    }
    
    public double mediaAvaliacao(int cod)
    {
        double media=0;
        int soma=0;
        for(int i=0;i<getFeed().length;i++)
        {
            if (getFeed()[i].getCodigoFilme()==cod)
            {
                media=media+getFeed()[i].getNotaFilme();
                soma++;
            }
        }
        if (soma==0)
        {
            System.out.printf("Nenhum filme encontrado com esse identificador");
            return 0;
        }
        return media/soma;
    }
    public int melhorAvaliacao(int codigo)
    {
        int melhor=-1;
        for (int i=0;i<getFeed().length;i++)
        {
            if (codigo==getFeed()[i].getCodigoFilme())
            {
                int nota=getFeed()[i].getNotaFilme();
                if (nota==5)
                {
                    return nota;
                }
                else if (melhor<nota)
                {
                    melhor=nota;
                }
            }
        }
        if (melhor==-1)
        {
            System.out.printf("Nenhum filme encontrado");
            return melhor;
        }
        return melhor;
    }
    public int piorAvaliacao(int codigo)
    {
        int pior=6;
        for (int i=0;i<getFeed().length;i++)
        {
            if (codigo==getFeed()[i].getCodigoFilme())
            {
                int nota=getFeed()[i].getNotaFilme();
                if (nota==0)
                {
                    return nota;
                }
                else if (nota<pior)
                {
                    pior=nota;
                }
            }
        }
        if (pior==6)
        {
            System.out.printf("Nenhum filme encontrado");
            return pior;
        }
        return pior;
    }
    public void mostrarTudo01()
    {
        for(int i=0;i<getFeed().length;i++)
        {
            System.out.printf("Codigo do filme: %d%n Usuário: %s%n Nota do filme: %d%n "
                    + "Comentário: %s%n%n",getFeed()[i].getCodigoFilme(), getFeed()[i].getNomeFilme(), 
                    getFeed()[i].getNotaFilme(),getFeed()[i].getComentarioFilme());
        }
    }
}
