/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package src;

/*
 * GridLayoutDemo.java
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GridLayoutDemo extends JFrame implements ActionListener {
	static final String gapList[] = { "0", "10", "15", "20" };
	final static int maxGap = 20;
	JComboBox horGapComboBox;
	JComboBox verGapComboBox;
	JButton applyButton = new JButton("Apply gaps");
	GridLayout experimentLayout = new GridLayout(0, 4);

	public JButton button0 = new JButton("0");
	public JButton button1 = new JButton("1");
	public JButton button2 = new JButton("2");
	public JButton button3 = new JButton("3");
	public JButton button4 = new JButton("4");
	public JButton button5 = new JButton("5");
	public JButton button6 = new JButton("6");
	public JButton button7 = new JButton("7");
	public JButton button8 = new JButton("8");
	public JButton button9 = new JButton("9");
	public JButton multiply = new JButton("×");
	public JButton divide = new JButton("÷");
	public JButton minus = new JButton("-");
	public JButton plus = new JButton("+");
	public JButton equals = new JButton("=");
	public JButton decimal = new JButton(".");
	
    static String pressed = "";
    static boolean operation = false;
    
    public JLabel message = new JLabel("0");

	public GridLayoutDemo(String name) {
		super(name);
		setResizable(false);
	}

	public void initGaps() {
		horGapComboBox = new JComboBox(gapList);
		verGapComboBox = new JComboBox(gapList);
	}

	public void addComponentsToPane(final Container pane) {

		button0.addActionListener(this);
		button0.setActionCommand("button0");
		button1.addActionListener(this);
		button1.setActionCommand("button1");
		button2.addActionListener(this);
		button2.setActionCommand("button2");
		button3.addActionListener(this);
		button3.setActionCommand("button3");
		button4.addActionListener(this);
		button4.setActionCommand("button4");
		button5.addActionListener(this);
		button5.setActionCommand("button5");
		button6.addActionListener(this);
		button6.setActionCommand("button6");
		button7.addActionListener(this);
		button7.setActionCommand("button7");
		button8.addActionListener(this);
		button8.setActionCommand("button8");
		button9.addActionListener(this);
		button9.setActionCommand("button9");
		multiply.addActionListener(this);
		multiply.setActionCommand("multiply");
		divide.addActionListener(this);
		divide.setActionCommand("divide");
		minus.addActionListener(this);
		minus.setActionCommand("minus");
		plus.addActionListener(this);
		plus.setActionCommand("plus");
		equals.addActionListener(this);
		equals.setActionCommand("equals");
		decimal.addActionListener(this);
		decimal.setActionCommand("decimal");

		// Sets Colour value to name
		Color orange = Color.decode("#FF9800");

		// sets the colour of buttons
		button1.setBackground(orange);

        message.setBounds(50,200,170,20);
		
		initGaps();
		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		JPanel controls = new JPanel();
		controls.setLayout(new GridLayout(2, 3));
        JPanel screen = new JPanel();
        screen.setLayout(new GridLayout(2,3));
		
		// Set up components preferred size
		JButton b = new JButton("Just fake button");
		Dimension buttonSize = b.getPreferredSize();
		compsToExperiment.setPreferredSize(new Dimension((int) (buttonSize
				.getWidth())
				+ maxGap, (int) (buttonSize.getHeight() * 3.5) + maxGap * 2));

		// Add buttons to experiment with Grid Layout
		compsToExperiment.add(button7);
		compsToExperiment.add(button8);
		compsToExperiment.add(button9);
		compsToExperiment.add(divide);
		compsToExperiment.add(button4);
		compsToExperiment.add(button5);
		compsToExperiment.add(button6);
		compsToExperiment.add(multiply);
		compsToExperiment.add(button1);
		compsToExperiment.add(button2);
		compsToExperiment.add(button3);
		compsToExperiment.add(minus);
		compsToExperiment.add(decimal);
		compsToExperiment.add(button0);
		compsToExperiment.add(equals);
		compsToExperiment.add(plus);

		// Add controls to set up horizontal and vertical gaps
		controls.add(new Label("Horizontal gap:"));
		controls.add(new Label("Vertical gap:"));
		controls.add(new Label(" "));
		controls.add(horGapComboBox);
		controls.add(verGapComboBox);
		controls.add(applyButton);
		
        screen.add(message);

		// Process the Apply gaps button press
		applyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the horizontal gap value
				String horGap = (String) horGapComboBox.getSelectedItem();
				// Get the vertical gap value
				String verGap = (String) verGapComboBox.getSelectedItem();
				// Set up the horizontal gap value
				experimentLayout.setHgap(Integer.parseInt(horGap));
				// Set up the vertical gap value
				experimentLayout.setVgap(Integer.parseInt(verGap));
				// Set up the layout of the buttons
				experimentLayout.layoutContainer(compsToExperiment);
			}
		});
        pane.add(screen, BorderLayout.NORTH);
		pane.add(compsToExperiment, BorderLayout.CENTER);
//		pane.add(new JSeparator(), BorderLayout.CENTER);
		pane.add(controls, BorderLayout.SOUTH);
	}

	/**
	 * Create the GUI and show it. For thread safety, this method is invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		GridLayoutDemo frame = new GridLayoutDemo("GridLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up the content pane.
		frame.addComponentsToPane(frame.getContentPane());
		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	public void actionPerformed(ActionEvent event) {

        if (event.getActionCommand().equals("button1") && (operation == false)) {
                pressed = (pressed + "1");
        }
        if (event.getActionCommand().equals("button2") && (operation == false)) {
                pressed = (pressed + "2");
        }
        if (event.getActionCommand().equals("button3") && (operation == false)) {
                pressed = (pressed + "3");
        }
        if (event.getActionCommand().equals("button4") && (operation == false)) {
                pressed = (pressed + "4");
        }
        if (event.getActionCommand().equals("button5") && (operation == false)) {
                pressed = (pressed + "5");
        }
        if (event.getActionCommand().equals("button6") && (operation == false)) {
                pressed = (pressed + "6");
        }
        if (event.getActionCommand().equals("button7") && (operation == false)) {
                pressed = (pressed + "7");
        }
        if (event.getActionCommand().equals("button8") && (operation == false)) {
                pressed = (pressed + "8");
        }
        if (event.getActionCommand().equals("button9") && (operation == false)) {
                pressed = (pressed + "9");
        }
        if (event.getActionCommand().equals("button0") && (operation == false)) {
                pressed = (pressed + "0");
        }
        if (event.getActionCommand().equals("multiply")) {
        
    }
        if (event.getActionCommand().equals("divide")) {
        
    }
        if (event.getActionCommand().equals("minus")) {
        
    }
        if (event.getActionCommand().equals("plus")) {
        
    }
        if (event.getActionCommand().equals("equals")) {
            operation = true;
        }
        message.setText(pressed);
	}
}
