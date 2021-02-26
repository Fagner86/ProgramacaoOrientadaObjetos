
package programacaoorientadaobjetos;

public class IncrementeX {

    public static void main(String[] args) {
       //Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1
       
       java.util.Scanner entrada = new java.util.Scanner(System.in);
       int x,y,z,soma;
       System.out.print("Primeiro numero: "); // saida 
         x = entrada.nextInt();// le o primeiro numero 
         
         System.out.print("Segundo numero: ");
         y = entrada.nextInt();// le o segundo numero
         
         System.out.print("Segundo numero: ");
         z = entrada.nextInt();// le o segundo numero 
         x++;
         soma = x + y + z;
        
         System.out.printf(" Soma"+soma); 

    }
    
}
