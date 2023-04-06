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
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Component;

public class ContactCreateFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textName;
	private JTextField textPhone;
	private JButton btnSave;
	private JButton btnCancel;
	private JPanel btnPnl;
	private JPanel lblPnl;
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
					ContactCreateFrame frame = new ContactCreateFrame(parent, app);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ContactCreateFrame(Component parent, ContactMain06 app) {
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
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblPnl = new JPanel();
		contentPane.add(lblPnl, BorderLayout.CENTER);
		lblPnl.setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(48, 45, 40, 24);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("D2Coding", Font.PLAIN, 20));
		lblPnl.add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setBounds(32, 89, 80, 24);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("D2Coding", Font.PLAIN, 20));
		lblPnl.add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setBounds(41, 134, 60, 24);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("D2Coding", Font.PLAIN, 20));
		lblPnl.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(143, 130, 248, 35);
		textEmail.setColumns(10);
		lblPnl.add(textEmail);
		
		textName = new JTextField();
		textName.setBounds(143, 42, 248, 34);
		textName.setColumns(10);
		lblPnl.add(textName);
		
		textPhone = new JTextField();
		textPhone.setBounds(143, 87, 248, 32);
		textPhone.setColumns(10);
		lblPnl.add(textPhone);
		
		btnPnl = new JPanel();
		contentPane.add(btnPnl, BorderLayout.SOUTH);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleClickbtn(e);
				
			}
		});
		btnSave.setFont(new Font("D2Coding", Font.PLAIN, 25));
		btnPnl.add(btnSave);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleClickbtn(e);
				
			}
		});
		btnCancel.setFont(new Font("D2Coding", Font.PLAIN, 25));
		btnPnl.add(btnCancel);
	}

	protected void handleClickbtn(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj==btnSave) {
			
			if(textEmail.getText().matches(".*[@].*") && (textPhone.getText().matches(".*[0-9].*"))) {
				
				//Contact 타입 객체 생성 및 필드 초기화
				Contact contact = new Contact(0,textName.getText(),textPhone.getText(),textEmail.getText());
				
				// create 메서드 호출
				daoimp.create(contact);
				
				// ContactMain에게 새 연락처가 저장되엇다고 알림.
				app.notifyContactCreated();
				
				// 창 끄기
				dispose();
				
			} else {
				JOptionPane.showConfirmDialog(lblPnl, "이메일 혹은 전화번호 형식이 안 맞습니다.", "포맷 체크", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null);
			}
			
		} else {
			dispose(); // 현재 창 닫기
		}
		
		
	}
}
