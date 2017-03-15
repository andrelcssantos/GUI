package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Andre
 */
public class MouseTrackerFrame extends JFrame{
    
    private JPanel mousePanel;
    private JLabel statusBar;
    
    public MouseTrackerFrame(){
        super("Demonstração de eventos do mouse");
        
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);
        
        statusBar = new JLabel();
        add(statusBar, BorderLayout.SOUTH);
        
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseListener(handler);
    }
    
    private class MouseHandler implements MouseListener, MouseMotionListener{

        @Override
        //trata eventos quando o mouse é liberado imediatamente depois de ter sido pressionado
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicado em  [%d, %d]", e.getX(), e.getY()));
        }
        //trata o evento quando o mouse é pressionado
        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressionado em  [%d, %d]", e.getX(), e.getY()));
        }
        //trata o evento qundo o mouse é liberado
        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Liberado em  [%d, %d]", e.getX(), e.getY()));
        }
        //trata o evento quando o mouse entra na área
        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Mouse entrou em  [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.GREEN);
        }
        //trata o evento quando o mouse sai da área
        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText(String.format("Mouse saiu do painel"));
            mousePanel.setBackground(Color.WHITE);
        }
        //trata o evento quando o usuário arrasta o mouse com o botão segurado
        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Arrastado em  [%d, %d]", e.getX(), e.getY()));
        }
        //trata o evento quando o usuário move o mouse
        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Moveu em  [%d, %d]", e.getX(), e.getY()));
        }
        
    } 
    
    public static void main(String[] args){
        MouseTrackerFrame mt = new MouseTrackerFrame();
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mt.setSize(300, 100);
        mt.setVisible(true);
    }
}
