package edu.java.swing06;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private Component parent;
	/**
	 * Launch the application.
	 */
	public static void showMyFrame(Component parent) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyFrame frame = new MyFrame(parent);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private MyFrame(Component parent) {
		this.parent = parent;
		initialize();
	}
	
	
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("MY FRAME");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		if(parent==null) {
			setBounds(100,100, 450,300);
		} else {
			setBounds(parent.getX(), parent.getY(), 450, 300);
		}
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
