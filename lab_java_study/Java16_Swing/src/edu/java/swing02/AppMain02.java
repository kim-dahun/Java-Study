package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain02 {

	private JFrame frame;
	private JTextField textInput;
	private JLabel lblNewLabel;
	private String msg = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain02 window = new AppMain02();
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
	public AppMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textInput = new JTextField();
		textInput.setToolTipText("문자를 입력하는 칸입니다.");
		textInput.setFont(new Font("D2Coding", Font.ITALIC, 20));
		textInput.setHorizontalAlignment(SwingConstants.CENTER);
		textInput.setBounds(12, 141, 638, 224);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JButton btnInput = new JButton("제출하기");
		btnInput.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick(); // 내부 클래스에서 외부 클래스의 메서드를 호출할 수 있음.
				
			}
		});
		btnInput.setBounds(12, 443, 638, 91);
		frame.getContentPane().add(btnInput);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("D2Coding", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 35, 638, 82);
		frame.getContentPane().add(lblNewLabel);
	}

	private void handleButtonClick() {
		// JTextField의 입력내용을 읽고
		msg = msg + " " + textInput.getText();
		
		
		lblNewLabel.setText(msg); 
		
		// 읽은 내용을 JLabel에 씀.
		
		
		// JTextFIled의 내용을 지움.
		
		textInput.setText("");
		
	}
}
