

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Title extends JPanel {
    public final Component BorderLayout = null;

    // COnstructor
    Title(){
        this.setPreferredSize(new Dimension(400, 50));
        JLabel titleText= new JLabel("TO DO LIST");
        titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(titleText);
    }

    
    
}
