
package programacaoorientadaobjetos;

import javax.swing.JOptionPane;

public class VariaveisXYZ {

  
    public static void main(String[] args) {
       
       
        int x,y,z,resultado;
        
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero")); 
        z = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
        resultado = x + y + z;
         
       System.out.printf("Resultado "+resultado);
         
    }
    
}
