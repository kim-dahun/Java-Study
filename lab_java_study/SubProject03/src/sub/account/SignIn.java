package sub.account;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textPw;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textAddress;
	private JTextField textBirth;
	private JTextField textpersNum;
	private JButton btnSignIn;
	private static SignIn instance;
	private JButton btnCheckId;
	private static ArrayList<Account> listAcount = new ArrayList<>();
	private static boolean checkId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public static ArrayList<Account> getListAcount() {
		return listAcount;
	}



	public static void setListAcount(ArrayList<Account> listAcount) {
		SignIn.listAcount = listAcount;
	}



	/**
	 * Create the frame.
	 */
	private SignIn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 360, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textId = new JTextField();
		textId.setBounds(172, 70, 116, 21);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textPw = new JTextField();
		textPw.setColumns(10);
		textPw.setBounds(172, 107, 116, 21);
		contentPane.add(textPw);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(172, 142, 116, 21);
		contentPane.add(textName);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(172, 173, 116, 21);
		contentPane.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(172, 204, 116, 21);
		contentPane.add(textEmail);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(172, 235, 116, 21);
		contentPane.add(textAddress);
		
		textBirth = new JTextField();
		textBirth.setColumns(10);
		textBirth.setBounds(172, 267, 116, 21);
		contentPane.add(textBirth);
		
		textpersNum = new JTextField();
		textpersNum.setColumns(10);
		textpersNum.setBounds(172, 299, 116, 21);
		contentPane.add(textpersNum);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(28, 73, 103, 15);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setBounds(28, 110, 103, 15);
		contentPane.add(lblPw);
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(28, 145, 103, 15);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBounds(28, 176, 103, 15);
		contentPane.add(lblPhone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(28, 207, 103, 15);
		contentPane.add(lblEmail);
		
		JLabel lblAddress = new JLabel("주소");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(28, 238, 103, 15);
		contentPane.add(lblAddress);
		
		JLabel lblBirth = new JLabel("생년월일(YYMMDD)");
		lblBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirth.setBounds(12, 270, 148, 15);
		contentPane.add(lblBirth);
		
		JLabel lblpersNum = new JLabel("주민번호뒷자리");
		lblpersNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblpersNum.setBounds(28, 302, 103, 15);
		contentPane.add(lblpersNum);
		
		btnCheckId = new JButton("중복체크");
		btnCheckId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick(e);
				
			}
		});
		btnCheckId.setBounds(57, 359, 103, 56);
		contentPane.add(btnCheckId);
		
		btnSignIn = new JButton("회원가입");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				handleButtonClick(e);
			}
		});
		btnSignIn.setBounds(185, 359, 103, 56);
		contentPane.add(btnSignIn);
	}
	
	protected void handleButtonClick(ActionEvent e) {
		
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==btnSignIn) {
			if(checkId == true) {
				Account ac1 = new Account();
				
				
				ac1.setUserId(textId.getText());
				ac1.setUserPw(textPw.getText());
				ac1.setUserName(textName.getText());
				ac1.setUserPhone(textPhone.getText());
				ac1.setUserAddress(textAddress.getText());
				ac1.setUserEmail(textEmail.getText());
				ac1.setUserBirth(textBirth.getText());
				FileOutputStream out = null;
				BufferedOutputStream bout = null;
				ObjectOutputStream oout = null;
				try {
					ac1.setUserPersonNum(Integer.parseInt(textpersNum.getText()));
					listAcount.add(ac1);
					JOptionPane.showMessageDialog(btnCheckId,"회원가입이 완료되었습니다.");
					
					out = new FileOutputStream("data/backup.dat");
					bout = new BufferedOutputStream(out);
					oout = new ObjectOutputStream(bout);
					
					oout.writeObject(listAcount);
					
					textpersNum.setText("");
					textBirth.setText("");
					textId.setText("");
					textPw.setText("");
					textName.setText("");
					textPhone.setText("");
					textAddress.setText("");
					textEmail.setText("");
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(btnCheckId,"잘못된 입력입니다. 입력 내용을 확인해주세요.");
				} finally {
					try {
						oout.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
			} else {
				JOptionPane.showMessageDialog(btnSignIn,"우선 ID 입력 후 중복체크를 진행하세요.");
			}
		} else if (obj==btnCheckId) {
			for(int i = 0 ; i < listAcount.size(); i++) {
				if(listAcount.get(i).getUserId().equals(textId.getText())) {
					JOptionPane.showMessageDialog(btnCheckId,"중복된 ID가 있습니다.");
					
					break;
				}
			}
			JOptionPane.showMessageDialog(btnCheckId,"이용 가능한 ID입니다.");
			checkId = true;
		}
		
	}

	public static SignIn getInstance() {
		if(instance==null) {
			instance = new SignIn();
		}
		
		checkId = false;
		
		return instance;
	}

}
