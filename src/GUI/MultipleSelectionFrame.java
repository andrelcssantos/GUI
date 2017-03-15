package GUI;

import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Andre
 */
public class MultipleSelectionFrame  extends JFrame{
    
    private JList colorList, copyList;
    private JButton copyBtn;
    private static final String[] colorNames = {
      "Black","Blue","Cyan","Dark Gray","Gray","Green","Light Gray","Magenta","Orange","Pink"  
    };
    
    public MultipleSelectionFrame(){
        super("Teste de Seleção de múltiplas Listas");
        setLayout(new FlowLayout());
        
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorList));
        
        copyBtn = new JButton("Copy >>>");
        copyBtn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        copyList.setListData(colorList.getSelectedValues());
                    }
                }
        );
        
        add(copyBtn);
        
        copyList = new JList();
        copyList.setVisibleRowCount(5);
        copyList.setFixedCellWidth(100);
        copyList.setFixedCellHeight(15);
        copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyList));
    }
    
    public static void main(String[] args){
        MultipleSelectionFrame msf = new MultipleSelectionFrame();
        msf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        msf.setSize(350,150);
        msf.setVisible(true);
    }
}
