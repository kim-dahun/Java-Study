package edu.java.contact.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.controller.ContactDaoImpl;
import edu.java.contact.model.Contact;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Component;

public class ContactUpdateFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textName;
	private JTextField textPhone;
	private JButton btnUpdate;
	private JButton btnCancel;
	private JPanel btnPnl;
	private JPanel lblPnl;
	private final ContactDaoImpl daoimp = ContactDaoImpl.getInstance();
	private int index; // 업데이트할 연락처의 인덱스를 저장하기 위한 필드
	private ContactMain app; // 업데이트 성공한 후 알림 메서드를 호출하기 위한 객체
	private List<Contact> list;
	private Component parent; // 부모 컴포넌트(JFrame) 을 저장하기 위한 필드.

	/**
	 * Launch the application.
	 */

	public static void showContactUpdateFrame(Component parent, int index, ContactMain app, List<Contact> list) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parent, index, app, list);
					frame.setVisible(true);
					frame.readContact();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ContactUpdateFrame(Component parent, int index, ContactMain app, List<Contact> list) {
		this.list = list;
		this.index = index;
		this.parent = parent;
		this.app = app;
		initialize(); // GUI 컴포넌트들을 생성하고 초기화하는 작업.

	}

	private void readContact() {

		Contact contact = daoimp.read(list.get(index).getCid());
		textName.setText(contact.getName());
		textPhone.setText(contact.getPhone());
		textEmail.setText(contact.getEmail());
		;
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("연락처 수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Jframe이 화면에 보이는 좌표
		int x = 100;
		int y = 100;
		if (parent == null) {

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

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleClickbtn(e);

			}
		});
		btnUpdate.setFont(new Font("D2Coding", Font.PLAIN, 25));
		btnPnl.add(btnUpdate);

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

		if (obj == btnUpdate) {

			if (textEmail.getText().matches(".*[@].*") && (textPhone.getText().matches(".*[0-9].*"))) {

				Contact contact = new Contact(list.get(index).getCid(), textName.getText(), textPhone.getText(), textEmail.getText());

				int confirm = JOptionPane.showConfirmDialog(this, "수정을 진행하시겠습니까?", "최종 확인", JOptionPane.YES_NO_OPTION);

				if (confirm == JOptionPane.YES_OPTION) {
					daoimp.update(contact);

					app.notifyContactUpdate();
					dispose();
				}
				

			} else {
				JOptionPane.showConfirmDialog(lblPnl, "이메일, 전화번호 형식이 안 맞습니다.", "포맷 체크", JOptionPane.CLOSED_OPTION,
						JOptionPane.ERROR_MESSAGE, null);
			}

		} else {
			dispose(); // 현재 창 닫기
		}

	}
}
