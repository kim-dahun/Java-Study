package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import edu.java.swing04.AppMain04.MyThread;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppMain04 {

	class MyThread extends Thread {

//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//				if (clickcheck >= 1) {
//					clickcheck-=5;
//
//					try {
//						sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			
//		}

	}

	private JFrame frame;
	private JLabel lblimg;
	private JButton btnBack;
	private JButton btnHas;
	private String[] s = { "C:\\workspace_real\\DahunKim.github.io\\lab_java_study\\Java16_Swing\\images\\img01.jpg",
			"C:\\workspace_real\\DahunKim.github.io\\lab_java_study\\Java16_Swing\\images\\img02.jpg",
			"C:\\workspace_real\\DahunKim.github.io\\lab_java_study\\Java16_Swing\\images\\img03.jpg",
			"C:\\workspace_real\\DahunKim.github.io\\lab_java_study\\Java16_Swing\\images\\img04.jpg",
			"C:\\workspace_real\\DahunKim.github.io\\lab_java_study\\Java16_Swing\\images\\img05.jpg" };
	private int count;
//	private int clickcheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblimg = new JLabel(".images/img01");
		lblimg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				JOptionPane.showMessageDialog(lblimg, String.format("해당 이미지의 경로는 : %s ", s[count]));

			}
		});
		lblimg.setIcon(new ImageIcon(
				"C:\\workspace_real\\DahunKim.github.io\\lab_java_study\\Java16_Swing\\images\\img01.jpg"));
		lblimg.setBackground(new Color(255, 255, 255));
		lblimg.setHorizontalAlignment(SwingConstants.CENTER);
		lblimg.setBounds(12, 26, 403, 425);
		frame.getContentPane().add(lblimg);

		btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleButtonClick(e);

			}
		});
		btnBack.setFont(new Font("D2Coding", Font.PLAIN, 50));
		btnBack.setBounds(12, 479, 97, 80);
		frame.getContentPane().add(btnBack);

		btnHas = new JButton(">");
		btnHas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleButtonClick(e);
			}
		});
		btnHas.setFont(new Font("D2Coding", Font.PLAIN, 50));
		btnHas.setBounds(318, 479, 97, 80);
		frame.getContentPane().add(btnHas);
	}

	protected void handleButtonClick(ActionEvent e) {
		//
		Object obj = e.getSource();

		if (obj == btnBack) {
			if (count == 0) {
				count = s.length;
			}
			lblimg.setIcon(new ImageIcon(s[count - 1]));
			count--;

		} else if (obj == btnHas) {
			if (count == s.length - 1) {
				count = count - s.length;
			}
			lblimg.setIcon(new ImageIcon(s[count + 1]));
			count++;
		}
		

		
		
		
		
	}

}
