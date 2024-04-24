import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Buttonpanel
 */
public class Buttonpanel extends JPanel{
    private JButton addtask;
    private JButton clear;
    Border emptyBorder= BorderFactory.createEmptyBorder();

    Buttonpanel(){
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.DARK_GRAY);

        addtask= new JButton("Add Task");
        addtask.setBorder(emptyBorder);
        addtask.setFont(new Font("Sans-serif",Font.CENTER_BASELINE,20));
        
        this.add(addtask);

        this.add(Box.createHorizontalStrut(20));
        clear= new JButton("Clr Task");
        clear.setBorder(emptyBorder);
        
        clear.setFont(new Font("Sans-serif",Font.CENTER_BASELINE,20));
        // clear.removeAll();
        
        this.add(clear);
    }
    public JButton getaddTask(){
        return addtask;
    }
    public JButton getClearTask(){
        
        return clear;
    }
    public JButton removeTask() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeTask'");
    }
    
}
