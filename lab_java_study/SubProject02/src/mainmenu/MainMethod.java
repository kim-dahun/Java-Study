package mainmenu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import account.view.SignInView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMethod {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignInView signNew = new SignInView();
        JFrame frame = new JFrame("My Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();

        // 회원가입 버튼
        JButton signUpButton = new JButton("회원가입");
        signUpButton.addActionListener(e -> {
            // 회원가입 버튼 클릭시 실행될 로직 구현
        	
        	signNew.signInUi();
        });
        panel.add(signUpButton);

        // 로그인 버튼
        JButton loginButton = new JButton("로그인");
        loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        loginButton.addActionListener(e -> {
            // 로그인 버튼 클릭시 실행될 로직 구현
        });
        panel.add(loginButton);

        // 종료 버튼
        JButton exitButton = new JButton("종료");
        exitButton.addActionListener(e -> {
            System.exit(0);
        });
        panel.add(exitButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
		
		
		
		
		
	}

}
