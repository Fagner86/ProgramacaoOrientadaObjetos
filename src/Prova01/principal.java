
package Prova01;

public class principal {
    public static void main(String[] args) {
        
        Filme teste = new Filme(1,"A garota","aventura","Uma garota que vive em uma ilha ");
        Filme teste1 = new Filme(2,"O segredo","terror","O Segredo de uma sociedade secreta");
        Filme teste2 = new Filme(3,"A ilha ","aventura"," A jovem garota esta de ferias");
        
        Filme[] filmes = {teste,teste1,teste2};

        Avaliacao t = new Avaliacao(1,"Fagner",1,"Não sei o que falar");
        Avaliacao t1 = new Avaliacao(1,"carol",3,"queria ver outro");
        Avaliacao t2 = new Avaliacao(1,"silva",2,"Não sei!");
        Avaliacao a = new Avaliacao(2,"Matheus",4,"Muito bom");
        Avaliacao a1 = new Avaliacao(2,"Lucas",5,"Otimo mesmo");
        Avaliacao a2 = new Avaliacao(2,"Samuel",3,"foi até bom");
        Avaliacao aa = new Avaliacao(3,"c",2,"ok!");
        Avaliacao aa1 = new Avaliacao(3,"A",1,"Não mesmo");
        Avaliacao aa2 = new Avaliacao(3,"M",1,"oii?");
        
        Avaliacao[] opinioes={t,t1,t2,a,a1,a2,aa,aa1,aa2}; 
       
        Videoteca videoteca = new Videoteca(filmes);
        Opinioes opiniao = new Opinioes(opinioes);
        videoteca.mostrarTudo();
        opiniao.mostrarTudo01();
        
        
        
    }
}
        
	
