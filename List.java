import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{
    protected Object remove;
    List(){
        GridLayout layout= new GridLayout(10,1);
        layout.setVgap(5);
        this.setLayout(layout);
        setBackground(Color.BLACK);
    }
    public void updateNUM(){
        Component[] listItems=this.getComponents();
        
        for (int i = 0; i < listItems.length; i++) {
            if (listItems[i] instanceof Task) {
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }
    public void decNUM(){
        Component[] listItems=this.getComponents();
        
        for (int i = 1; i <=listItems.length; i++) {
            if (listItems[i] instanceof Task) {
                ((Task)listItems[i]).changeIndex(i-1);
            }
        }
    }
    
}
