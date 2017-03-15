package GUI;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Buttons extends JFrame{
    
    Container cp = getContentPane();
    FlowLayout fl = new FlowLayout();
    JOptionPane jop = new JOptionPane();
    JButton btn[];
    String qtd;
    int nums, i;
    
    public Buttons(){
     
        qtd = jop.showInputDialog("Digite a quantidade de botões");
        nums = Integer.parseInt(qtd); //converte a variável qtd para nums
//        nums = jop.showConfirmDialog(null, nums);

        jop.showMessageDialog(null, "O numero escolhido foi " + nums, " Aviso",JOptionPane.PLAIN_MESSAGE);
        btn = new JButton[nums];       
        cp.setLayout(fl);
        
        for(i=0; i<nums; i++){
            btn = new JButton[nums];
            cp.add(btn[i]);
        }

    }
    
    public static void main(String[] args){
        Buttons b = new Buttons();
        b.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b.setSize(800, 600);
        b.setVisible(true);
    }
}
