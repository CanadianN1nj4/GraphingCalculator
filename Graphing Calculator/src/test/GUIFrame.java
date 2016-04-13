package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class GUIFrame  extends JFrame implements ActionListener{

	//A click-able button
    public JButton button1;
    
    //Text
    public JLabel message;
    
    //Create a Timer object to set the delay between frames
    public Timer timer;
    
    public GUIFrame(String title) {
    	//invoke the super constructor
        super(title);
        
        setLayout(null); //Not using a layout manager
        
        //Initialize the components here
        button1 = new JButton("Click");
        button1.setBounds(50,50,80,30); //Pos X,Pos Y,Size X,Size Y
        button1.addActionListener(this);
        button1.setActionCommand("button1"); //Differentiates between other buttons
       
      //Text box
        message = new JLabel ("Hello, World!");
        message.setBounds(50,200,170,20);
        
        add(button1);
        add(message);
        
        validate();
        repaint();
    }
    public void actionPerformed(ActionEvent event){
        
        //See if it's our first button that cause the event
        if (event.getActionCommand().equals("button1")){
                message.setText("KRONK!");
        }
}
}
