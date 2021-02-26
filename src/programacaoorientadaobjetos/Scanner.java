
package programacaoorientadaobjetos;
public class Scanner {

    public static void main(String[] args) {
     //criar um Scanner para obter entrada apatir da janela de comando 
        java.util.Scanner entrada = new java.util.Scanner(System.in);
         int num1; // primeiro numero
         int num2;// segundo numero 
        
         
         System.out.print("Primeiro numero: "); // saida 
         num1 = entrada.nextInt();// le o primeiro numero 
         
         System.out.print("Segundo numero: ");
         num2 = entrada.nextInt();// le o segundo numero 
         
   
         
         System.out.printf(" Numero1 "+num2+" , numero2 "+num1 ); // saida 
    }
}
