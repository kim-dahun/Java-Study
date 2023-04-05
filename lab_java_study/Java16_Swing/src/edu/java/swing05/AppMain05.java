package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthRadioButtonUI;
import javax.swing.JDesktopPane;
import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {

	private JFrame frame;
	private JRadioButton rbPrivate;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbAbstract;
	private JComboBox<String> comboBox;
	private JCheckBox cbfinal;
	private JCheckBox cbstatic;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		rbPrivate = new JRadioButton("Private");
		rbPrivate.setSelected(true);
		rbPrivate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("D2Coding ligature", Font.PLAIN, 12));
		rbPrivate.setBounds(68, 10, 169, 55);
		frame.getContentPane().add(rbPrivate);

		rbProtected = new JRadioButton("Protected");
		rbProtected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("D2Coding ligature", Font.PLAIN, 12));
		rbProtected.setBounds(68, 67, 169, 55);
		frame.getContentPane().add(rbProtected);

		rbPublic = new JRadioButton("Public");
		rbPublic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("D2Coding ligature", Font.PLAIN, 12));
		rbPublic.setBounds(314, 67, 169, 55);
		frame.getContentPane().add(rbPublic);

		rbPackage = new JRadioButton("Package");
		rbPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("D2Coding ligature", Font.PLAIN, 12));
		rbPackage.setBounds(314, 10, 169, 55);
		frame.getContentPane().add(rbPackage);

		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				handleCheckBoxClick(e);

			}
		});
		cbAbstract.setFont(new Font("D2Coding ligature", Font.PLAIN, 15));
		cbAbstract.setBounds(39, 162, 90, 50);
		frame.getContentPane().add(cbAbstract);

		cbfinal = new JCheckBox("final");
		cbfinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleCheckBoxClick(e);
			}
		});
		cbfinal.setFont(new Font("D2Coding ligature", Font.PLAIN, 15));
		cbfinal.setBounds(204, 162, 90, 50);
		frame.getContentPane().add(cbfinal);

		cbstatic = new JCheckBox("static");
		cbstatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleCheckBoxClick(e);
			}
		});
		cbstatic.setFont(new Font("D2Coding ligature", Font.PLAIN, 15));
		cbstatic.setBounds(362, 162, 90, 50);
		frame.getContentPane().add(cbstatic);

		comboBox = new JComboBox();
		String[] items = { "naver.com", "gmail.com", "kakao.com" };
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(items);
		comboBox.setModel(model);
		// comboBox.setModel(new DefaultComboBoxModel(new String[] {"naver.com",
		// "gmail.com", "kakao.com"}));
		comboBox.setBounds(12, 218, 223, 74);
		frame.getContentPane().add(comboBox);

		JButton btnOK = new JButton("확인");
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				printInfo();

			}
		});
		btnOK.setBounds(362, 217, 97, 74);
		frame.getContentPane().add(btnOK);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 313, 463, 317);
		frame.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	private void printInfo() {
		// TODO Auto-generated method stub

		// 라디오 버튼, 체크 박스, 콤보 박스의 상태를 JTextArea에 출력.

		StringBuffer buffer = new StringBuffer(); // text area에 출력할 문자열을 저장하기 위해서.

		// 어떤 라디오 버튼이 선택되었는 지 체크.
		if (rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		} else if (rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
		} else if (rbProtected.isSelected()) {
			buffer.append(rbProtected.getText());
		} else if (rbPublic.isSelected()) {
			buffer.append(rbPublic.getText());
		}
		buffer.append(" 라디오 버튼 선택됨.\n");

		// 체크 박스들의 선택 여부를 확인.
		if (cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" ");
		}
		if (cbfinal.isSelected()) {
			buffer.append(cbfinal.getText()).append(" ");
		}
		if (cbstatic.isSelected()) {
			buffer.append(cbstatic.getText()).append(" ");
		}
		buffer.append("체크박스 선택됨.\n");

		// 콤보 박스에서 선택된 아이템 찾기

		String item = (String) comboBox.getSelectedItem();
		buffer.append(item).append(" 콤보박스 선택됨.\n");

		// 버퍼의 내용을 textArea에 출력.
		textArea.setText(buffer.toString());
		
	}

	protected void handleCheckBoxClick(ActionEvent e) {
		// TODO Auto-generated method stub

		// 클릭 이벤트가 발생한 이벤트 소스(체크박스) 를 찾음.
		JCheckBox chbox = (JCheckBox) e.getSource();

		// 체크 박스에 텍스트를 찾음.
		String text = chbox.getText();

		// 체크 박스의 체크(선택) 여부 확인
		boolean selected = chbox.isSelected();

		// 정보 출력
		textArea.setText(text + " : " + selected);

	}

	protected void handleRadioButtonClick(ActionEvent e) {
		// TODO Auto-generated method stub

		// 클릭 이벤트가 발생한 이벤트 소스(라디오 버튼) 을 찾음.
		JRadioButton btn = (JRadioButton) e.getSource();

		// 라디오 버튼읠 텍스를 찾음
		String btnText = btn.getText();

		// 라디오 버튼의 선택(체크) 여부를 확인.
		boolean selected = btn.isSelected();

		// 결과를 Jtext area에 출력.
		textArea.setText(btnText + " : " + selected);

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
