package GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author andre
 */
public class CheckBoxFrame extends JFrame{
    
    private JTextField tf;
    private JCheckBox boldJcb;
    private JCheckBox italicJcb;
    
    public CheckBoxFrame(){
        super("CheckBox Teste");
        setLayout(new FlowLayout());
        
        tf = new JTextField("Mudando o estilo da fonte", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        
        boldJcb = new JCheckBox("Bold");
        italicJcb = new JCheckBox("Italic");
        add(boldJcb);
        add(italicJcb);
        
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJcb.addItemListener(handler);
        italicJcb.addItemListener(handler);
    }
    
    private class CheckBoxHandler implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            
            if(boldJcb.isSelected() && italicJcb.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if(boldJcb.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if(italicJcb.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else 
                font = new Font("Serif", Font.PLAIN, 14);
            
            tf.setFont(font);
        }
    }
    
    public static void main(String[] args){
        CheckBoxFrame cbf = new CheckBoxFrame();
        cbf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cbf.setSize(275,100);
        cbf.setVisible(true);
    }
}
