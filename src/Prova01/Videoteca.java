
package Prova01;

import java.util.Scanner;

public class Videoteca {
     private Filme[] filmes;
     
    Videoteca(Filme[] filmes)
    {
        this.filmes= filmes;
    }
    
     public Filme[] getFilmes()
    {
        return this.filmes;
    }
    public void setFilme(Filme[] filmes)
    {
        this.filmes=filmes;
    }
   
    public int pesquisarFilme(String palavra)
    {
        int nom;
        int ption;
        palavra=palavra.toLowerCase();
        for(int i=0;i<filmes.length;i++)
        {
            nom=this.filmes[i].getNomeFilme().indexOf(palavra);
            ption=filmes[i].getSinopseFilme().indexOf(palavra);
            if (nom!=-1)
            {
                System.out.printf("Encontrou o filme [%s] , procura por nome retornou: %d\n",filmes[i].getNomeFilme(),nom);
                return nom;
            }
            if (ption!=-1)
            {
                System.out.printf("Encontrou o filme [%s] , procura por sinopse retornou: %d\n",filmes[i].getNomeFilme(),ption);
                return ption;
            }
        }
        return -1;
    }
    public void mostrarFilme(String s)
    {
        
        System.out.printf("Caso deseje mostrar todos os filmes digite todos%n Caso deseje procurar por genero digite o tipo:%n");
        Scanner input = new Scanner(System.in);
        String op=input.nextLine();
        if (op=="todos")
        {
            for(int i=0;i<getFilmes().length;i++)
            {
                System.out.printf("%s\n",this.filmes[i].getNomeFilme());
            }
        }
        else
        {
            System.out.printf("Todos os filmes encontrados:%n");
            for(int i=0;i<getFilmes().length;i++)
            {
                
                if (op.toLowerCase()== getFilmes()[i].getGeneroFilme())
                {
                    System.out.printf("[%s]%n",getFilmes()[i].getNomeFilme());
                }
            }
        }
    }
    public void mostrarTudo()
    {
        for(int i=0;i<getFilmes().length;i++)
        {
            System.out.printf(" Codigo do filme: %d%n Nome do filme: %s%n Genero: %s%n Sinopse: %s%n%n",getFilmes()[i].getCodigoFilme(), getFilmes()[i].getNomeFilme(), getFilmes()[i].getGeneroFilme(),getFilmes()[i].getSinopseFilme());
        }
       
    }
}

