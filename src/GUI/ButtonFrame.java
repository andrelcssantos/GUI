package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ButtonFrame extends JFrame{
    
    private JButton plainBtn;
    private JButton fancyBtn;
    
    public ButtonFrame(){
        super("Testando botões");
        setLayout(new FlowLayout());
        
        plainBtn = new JButton("Botão com texto");
        add(plainBtn);
        
        Icon icon1 = new ImageIcon(getClass().getResource("imagens/icon.png"));
        Icon icon2 = new ImageIcon(getClass().getResource("imagens/icon1.png"));
        fancyBtn = new JButton("Fancy Button", icon1);
        fancyBtn.setRolloverIcon(icon2); //troca de imagem quando passa o mouse em cima do botão
        add(fancyBtn);
        
        //cria um ButtonHandler
        ButtonHandler handler = new ButtonHandler();
        fancyBtn.addActionListener(handler);
        plainBtn.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você apertou: %s", event.getActionCommand()));
        }
    }
    
    public static void main(String[] args){
        ButtonFrame bf = new ButtonFrame();
        bf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bf.setSize(375,220);
        bf.setVisible(true);
    }
    
}
