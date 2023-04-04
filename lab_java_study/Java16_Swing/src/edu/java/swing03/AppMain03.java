package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain03 {

	private JFrame frame;
	private JTextField textInput1;
	private JTextField textInput2;
	private JTextArea textResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNum1 = new JLabel("Num1");
		lblNum1.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblNum1.setForeground(Color.GRAY);
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setBounds(42, 41, 87, 34);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Num2");
		lblNum2.setForeground(Color.GRAY);
		lblNum2.setBackground(new Color(255, 255, 255));
		lblNum2.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setBounds(42, 98, 87, 34);
		frame.getContentPane().add(lblNum2);
		
		textInput1 = new JTextField();
		textInput1.setFont(new Font("D2Coding", Font.PLAIN, 25));
		textInput1.setToolTipText("여기에 숫자를 입력하세요");
		textInput1.setHorizontalAlignment(SwingConstants.CENTER);
		textInput1.setBounds(181, 41, 204, 34);
		frame.getContentPane().add(textInput1);
		textInput1.setColumns(10);
		
		textInput2 = new JTextField();
		textInput2.setFont(new Font("D2Coding", Font.PLAIN, 25));
		textInput2.setToolTipText("여기에 숫자를 입력하세요");
		textInput2.setHorizontalAlignment(SwingConstants.CENTER);
		textInput2.setColumns(10);
		textInput2.setBounds(181, 98, 204, 34);
		frame.getContentPane().add(textInput2);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick();
				
			}

			private void handleButtonClick() {
				// TODO Auto-generated method stub
				try {
					double sum = Double.parseDouble(textInput1.getText())+Double.parseDouble(textInput2.getText());
					sum = Math.round(sum*100)/100.0;
					String result = ""+sum;
					String view = textInput1.getText() + " + " + textInput2.getText() + " = " + result;
					textInput2.setText("");
					textInput1.setText(result);
					
					textResult.setText(view);
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(textResult, "올바르지 않은 입력입니다");
				}
			}
		});
		btnSum.setFont(new Font("D2Coding", Font.BOLD, 25));
		btnSum.setBounds(12, 162, 77, 46);
		frame.getContentPane().add(btnSum);
		
		JButton btnSubstract = new JButton("-");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick();
				
			}
			
			protected void handleButtonClick() {
				// TODO Auto-generated method stub
				try {
					double sum = Double.parseDouble(textInput1.getText())-Double.parseDouble(textInput2.getText());
					sum = Math.round(sum*100)/100.0;
					String result = ""+sum;
					String view = textInput1.getText() + " - " + textInput2.getText() + " = " + result;
					textInput2.setText("");
					textInput1.setText(result);
					textResult.setText(view);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(textResult, "올바르지 않은 입력입니다");
				}
			}
		});
		btnSubstract.setFont(new Font("D2Coding", Font.BOLD, 25));
		btnSubstract.setBounds(101, 162, 77, 46);
		frame.getContentPane().add(btnSubstract);
		
		JButton btnMultiple = new JButton("x");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick();
				
			}
			
			protected void handleButtonClick() {
				// TODO Auto-generated method stub
				try {
					double sum = Double.parseDouble(textInput1.getText())*Double.parseDouble(textInput2.getText());
					sum = Math.round(sum*100)/100.0;
					String result = ""+sum;
					String view = textInput1.getText() + " x " + textInput2.getText() + " = " + result;
					textInput2.setText("");
					textInput1.setText(result);
					textResult.setText(view);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(textResult, "올바르지 않은 입력입니다");
				}
			}
		});
		btnMultiple.setFont(new Font("D2Coding", Font.BOLD, 25));
		btnMultiple.setBounds(190, 162, 77, 46);
		frame.getContentPane().add(btnMultiple);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick();
			}

			private void handleButtonClick() {
				// TODO Auto-generated method stub
				
					// TODO Auto-generated method stub
					try {
						double sum = Double.parseDouble(textInput1.getText())/Double.parseDouble(textInput2.getText());
						sum = Math.round(sum*100)/100.0;
						String result = ""+sum;
						String view = textInput1.getText() + " / " + textInput2.getText() + " = " + result;
						textInput2.setText("");
						textResult.setText(view);
						textInput1.setText(result);
					} catch (Exception e) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(textResult, "올바르지 않은 입력입니다");
					}
				}
			}
		);
		btndivide.setFont(new Font("D2Coding", Font.BOLD, 25));
		btndivide.setBounds(279, 162, 77, 46);
		frame.getContentPane().add(btndivide);
		
		textResult = new JTextArea();
		textResult.setText("Result");
		textResult.setEditable(false);
		textResult.setFont(new Font("D2Coding ligature", Font.PLAIN, 16));
		textResult.setBackground(Color.LIGHT_GRAY);
		textResult.setToolTipText("계산 완료된 값이 여기에 출력됩니다.");
		textResult.setBounds(12, 218, 410, 116);
		frame.getContentPane().add(textResult);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setFont(new Font("D2Coding", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick();
			}

			private void handleButtonClick() {
				// TODO Auto-generated method stub
				try {
					textInput1.setText("");
					textInput2.setText("");
					textResult.setText("");
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(textResult, "올바르지 않은 입력입니다");
				}
			}
		});
		btnNewButton.setBounds(365, 162, 57, 46);
		frame.getContentPane().add(btnNewButton);
	}

	
}
