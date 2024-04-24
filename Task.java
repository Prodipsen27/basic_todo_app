import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
    private JLabel index;
    private JTextField text;
    private JButton done;
    private JButton rmv;
    private boolean checked;
    protected Object changeState;

    Task(){
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.lightGray);

        this.setLayout(new BorderLayout());
        checked= false;
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(index,BorderLayout.WEST);

        text= new JTextField("type here...");
        text.setBorder(BorderFactory.createEmptyBorder());
        text.setBackground(Color.white);
       text.setFont(new Font("Sans-Serif",Font.BOLD,17));
        this.add(text,BorderLayout.CENTER);

        done =new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setFont(new Font("Arial",Font.BOLD,10));
        this.add(done,BorderLayout.EAST);

        rmv = new JButton("Remove");
        rmv.setPreferredSize(new Dimension(40,20));
        rmv.setBorder(BorderFactory.createEmptyBorder());
        rmv.setForeground(Color.BLUE);
        this.add(rmv,BorderLayout.SOUTH);

        
    }
    public JButton rmvTask(){
        return rmv;
    }

    public JButton getDone(){
        return done;
    }

    public void removeTask(){
        // this.remove(index);
        // this.remove(done);
        text.remove(text);
        this.rmvTask();
    }

    public void changeIndex(int n){
        this.index.setText(n+" ");
        this.revalidate();
    }

    public void changeState(){
        done.setBackground(Color.DARK_GRAY);
        done.setForeground(Color.cyan);
        this.setBackground(Color.DARK_GRAY);
        index.setForeground(Color.cyan);
        text.setBackground(Color.green);
        text.setForeground(Color.black);
        checked= true;
        
    }
    
}
