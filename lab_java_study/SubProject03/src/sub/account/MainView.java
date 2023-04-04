package sub.account;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				File f = new File("data", "backup.dat");
				FileInputStream in = null;
				BufferedInputStream bin = null;
				ObjectInputStream oin = null;
				try {

					in = new FileInputStream(f);
					bin = new BufferedInputStream(in);
					oin = new ObjectInputStream(bin);

					

					MainView window = new MainView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						oin.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnSignIn = new JButton("회원가입");
		btnSignIn.setFont(new Font("D2Coding", Font.PLAIN, 35));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleButtonClick();

			}

			private void handleButtonClick() {
				// TODO Auto-generated method stub

				SignIn.getInstance().setVisible(true);

			}
		});
		btnSignIn.setBounds(104, 172, 195, 137);
		frame.getContentPane().add(btnSignIn);

		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("D2Coding", Font.PLAIN, 35));
		btnLogin.setBounds(311, 172, 195, 137);
		frame.getContentPane().add(btnLogin);

		JLabel lblTitle = new JLabel("수입 지출 내역서");
		lblTitle.setFont(new Font("D2Coding", Font.PLAIN, 36));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 28, 590, 57);
		frame.getContentPane().add(lblTitle);
	}
}
