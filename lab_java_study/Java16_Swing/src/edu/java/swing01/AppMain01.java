package edu.java.swing01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class AppMain01 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// new Thread(new Runnable() { @override public void run(){}});
		// Thread 를 이벤트 Quene에 등록 -> JRE 이 쓰레드를 실행 -> run() 메서드를 호출.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain01 window = new AppMain01();
					window.frame.setVisible(true); // 생성된 Jframe 이 화면에 보임.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 생성자 - Create the application.
	 */
	public AppMain01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300,300,600,400); // JFrame의 시작 좌표(x,y) 너비 높이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //-> JFrame 우측 상단 닫기(x) 버튼의 기능을 정의한 코드 - 프로그램 종료.
		JLabel lblText = new JLabel("안녕하세요 스윙스윙");
		lblText.setToolTipText("");
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setFont(new Font("D2Coding", Font.PLAIN, 24));
		frame.getContentPane().add(lblText, BorderLayout.CENTER);
		
	}

}
