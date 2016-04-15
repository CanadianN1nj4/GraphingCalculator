package src.test;

import javax.swing.JFrame;

public class GUIThread implements Runnable {
    public GUIThread() {
        
    }

	public void run() {
        GUIFrame frame1 = new GUIFrame("Calculator");
        frame1.setSize(800,600);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
