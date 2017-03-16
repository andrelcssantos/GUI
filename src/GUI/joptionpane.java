/*
 Exemplo de JOptionPane
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class joptionpane {
    
    public static void main(String[] args){
        
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String num2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int res = x + y;
        
        JOptionPane.showMessageDialog(null, "A Soma dos números digitados é = "+res, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
