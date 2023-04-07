package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;
import edu.java.contact05.ContactDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ContactSearchFrame extends JFrame {

	private JPanel contentPane;
	private final ContactDaoImpl daoimp = ContactDaoImpl.getInstance();;
	
	private ContactMain06 app; // notifyContactCreated 메서드를 갖고 있는 객체
	private Component parent; // 부모 컴포넌트(JFrame) 을 저장하기 위한 필드.
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void showFrame(Component parent, ContactMain06 app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactSearchFrame frame = new ContactSearchFrame(parent, app);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ContactSearchFrame(Component parent, ContactMain06 app) {
		this.parent = parent;
		this.app = app;
		initialize(); // GUI 컴포넌트들을 생성하고 초기화하는 작업.
		
	}
	
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("새 연락처 저장");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		// Jframe이 화면에 보이는 좌표
		int x = 100;
		int y = 100;
		if(parent==null) {
			
		} else {
			x = parent.getX();
			y = parent.getY();
		}
		
		
		setBounds(x, y, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 171, 2, 2);
		contentPane.add(scrollPane);
	}
}
