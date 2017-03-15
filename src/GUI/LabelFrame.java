package GUI;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Andre
 */
public class LabelFrame extends JFrame{
    
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    
    public LabelFrame(){
        super("Testando JLabel");
        setLayout(new FlowLayout());
        
        lbl1 = new JLabel("Label com texto");
        lbl1.setToolTipText("Isso é um label");
        add(lbl1);
        
        Icon bug = new ImageIcon(getClass().getResource("imagens/lixeira.png"));
        lbl2 = new JLabel("Label com texto e icone", bug, SwingConstants.LEFT);
        lbl2.setToolTipText("Esse é o segundo Label");
        add(lbl2);
        
        lbl3 = new JLabel();
        lbl3.setText("Label com icone e texto no bottom");
        lbl3.setIcon(bug);
        lbl3.setHorizontalTextPosition(SwingConstants.CENTER);
        lbl3.setVerticalTextPosition(SwingConstants.BOTTOM);
        lbl3.setToolTipText("Esse é o terceiro label");
        add(lbl3);
        
    }
    
    public static void main(String[] args){
        LabelFrame lf = new LabelFrame();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setSize(400, 200);
        lf.setVisible(true);
    }
    
}
