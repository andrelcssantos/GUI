package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * @author andre
 */
public class TextFieldFrame extends JFrame{
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JPasswordField pswf;
    
    public TextFieldFrame(){
        super("Exemplos de JTextField e JPasswordField");
        setLayout(new FlowLayout());
        
        tf1 = new JTextField(10); //constrói textfield com 10 colunas
        add(tf1);
        
        tf2 = new JTextField("Entre com o texto");
        add(tf2);
        
        tf3 = new JTextField("Texto sem edição", 21); //constrói textfield com 21 colunas
        tf3.setEditable(false); //desativa a edição
        add(tf3);
        
        pswf = new JPasswordField("Texto escondido");
        add(pswf);
        
        //handlers de evento registradores
        TextFieldHandler handler = new TextFieldHandler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
        tf3.addActionListener(handler);
        pswf.addActionListener(handler);
       
    }
    
    private class TextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
           String string = ""; //declara a string a ser exibida
           
           if(event.getSource() == tf1)
               string = String.format("txt1: %s", event.getActionCommand());
           
           else if(event.getSource() == tf2)
               string = String.format("txt2: %s", event.getActionCommand());
           
           else if(event.getSource() == tf3)
               string = String.format("txt3: %s", event.getActionCommand());
           
           else if(event.getSource() == pswf)
               string = String.format("txt4: %s", event.getActionCommand());
           
            JOptionPane.showMessageDialog(null, string);
        }
    }
     
    public static void main(String[] args){
        TextFieldFrame tff = new TextFieldFrame();
        tff.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tff.setSize(350, 150);
        tff.setVisible(true);
    }
}
