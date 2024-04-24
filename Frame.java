
import javax.swing.JButton;
import javax.swing.JFrame;

// import org.w3c.dom.events.MouseEvent;

import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Frame extends JFrame{
    private Buttonpanel btnpnl;
    private List list;
    private Title title;

    private JButton addTask;
    private JButton clear;
    // private JButton rmv;


    // Constructor
    Frame(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        // setBackground(Color.DARK_GRAY);

        title= new Title();
        list= new List();
        btnpnl= new Buttonpanel();
        this.add(title,BorderLayout.NORTH);
        this.add(btnpnl,BorderLayout.SOUTH);

        this.add(list,BorderLayout.CENTER);

        addTask= btnpnl.getaddTask();
        clear= btnpnl.getClearTask();
        // rmv= btnpnl.removeTask();

        addListeners();
        
    }

    public void addListeners(){
        
       
        
        addTask.addMouseListener(new MouseAdapter() {
            @override
            public void mousePressed(MouseEvent e) {
               
                Task task= new Task();
                list.add(task);
                list.updateNUM();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @override
                    public void mousePressed(MouseEvent e){
                        task.changeState();
                        revalidate();
                    }
                }); 
                task.rmvTask().addMouseListener(new MouseAdapter() {
                    @override
                    public void mousePressed(MouseEvent e){
                        list.remove(task);
                        // list.removeTask();
                        list.decNUM();
                        task.removeTask();
                        list.decNUM();
                        invalidate();
                    }
                }); 
                clear.addMouseListener(new MouseAdapter() {
                    @override
                    public void mousePressed(MouseEvent e) {
                        list.remove(task);
                    // task.removeTask().add 
                    
                        
            
                        
                    }
                });
                
                revalidate();
                
            }
        });
        
        
    }
}
