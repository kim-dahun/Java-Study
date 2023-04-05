package edu.java.swing06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Component parent;
	/**
	 * Launch the application.
	 */
	
	// (1) 메인을 다른 메서드 이름으로 변경
	public static void showMyDialog(Component parent) {
		try {
			MyDialog dialog = new MyDialog(parent);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//(2) 생성자는 default에 private
	private MyDialog(Component parent) {
		this.parent = parent;
		initialize();

	}

	/**
	 * Create the dialog.
	 */
	
	// (3) 기존 생성자는 메서드로 변경
	public void initialize() {
		setTitle("My Dialog"); // 다이얼로그의 타이틀
		
		if(parent==null) {
			setBounds(100,100, 450,300);
		} else {
			setBounds(parent.getX(), parent.getY(), 450, 300);
		}
		 // 다이얼로그 좌표(x,y) 크기(가로, 세로)
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);

	}

}
