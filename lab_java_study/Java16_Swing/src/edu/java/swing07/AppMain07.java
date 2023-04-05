package edu.java.swing07;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppMain07 {
	// JTable에서 사용할 컬럼 이름들.
	private static final String[] COLUMN_NAMES = { "국어", "영어", "수학", "총점", "평균" };
	private DefaultTableModel model; // 테이블의 행, 열에 대한 정보를 갖는 객체

	private JFrame frame;
	private JTextField textKorean;
	private JTextField textEnglish;
	private JTextField textMath;
	private JLabel lblMath;
	private JLabel lblEnglish;
	private JLabel lblKorean;
	private JButton btnInsert;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	private static ArrayList<Score> scoreList;
	private JButton btnSave;
	private static final String FILE = "data/datas.dat";

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				File f = new File(FILE);
				if(f.exists()) {
					fileRead(f);
				} else {
					scoreList = new ArrayList<>();
					
				}
				
				
				try {
					AppMain07 window = new AppMain07();
					for(int i = 0 ; i<scoreList.size(); i++) {
						Object[] update = {scoreList.get(i).getKorean(),scoreList.get(i).getEnglish(),scoreList.get(i).getMath(),scoreList.get(i).getTotal(), scoreList.get(i).getMean(scoreList.get(i).getTotal())};
						window.model.addRow(update);
					}
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			

			private void fileRead(File f) {
				// TODO Auto-generated method stub
				try
				(FileInputStream in = new FileInputStream(f);
						BufferedInputStream bin = new BufferedInputStream(in);
						ObjectInputStream oin = new ObjectInputStream(bin);)
				{
					scoreList = (ArrayList<Score>) oin.readObject();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Create the application.
	 */
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 353, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblKorean = new JLabel("국어");
		lblKorean.setFont(new Font("D2Coding", Font.PLAIN, 30));
		lblKorean.setHorizontalAlignment(SwingConstants.CENTER);
		lblKorean.setBounds(12, 10, 85, 50);
		frame.getContentPane().add(lblKorean);

		lblEnglish = new JLabel("영어");
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.setFont(new Font("D2Coding", Font.PLAIN, 30));
		lblEnglish.setBounds(12, 90, 85, 50);
		frame.getContentPane().add(lblEnglish);

		lblMath = new JLabel("수학");
		lblMath.setHorizontalAlignment(SwingConstants.CENTER);
		lblMath.setFont(new Font("D2Coding", Font.PLAIN, 30));
		lblMath.setBounds(12, 174, 85, 50);
		frame.getContentPane().add(lblMath);

		textKorean = new JTextField();
		textKorean.setFont(new Font("D2Coding", Font.PLAIN, 25));
		textKorean.setBounds(155, 10, 170, 50);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);

		textEnglish = new JTextField();
		textEnglish.setFont(new Font("D2Coding", Font.PLAIN, 25));
		textEnglish.setColumns(10);
		textEnglish.setBounds(155, 90, 170, 50);
		frame.getContentPane().add(textEnglish);

		textMath = new JTextField();
		textMath.setFont(new Font("D2Coding", Font.PLAIN, 25));
		textMath.setColumns(10);
		textMath.setBounds(155, 174, 170, 50);
		frame.getContentPane().add(textMath);

		btnInsert = new JButton("입력");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int korean = Integer.parseInt(textKorean.getText());
					int english = Integer.parseInt(textEnglish.getText());
					int math = Integer.parseInt(textMath.getText());
					if((korean<0 || korean>100) || (english<0 || english>100) || (math<0 || math>100)) {
						JOptionPane.showConfirmDialog(frame, "점수는 0에서 100점까지만 입력이 가능합니다.", "입력 가능 범위 초과", JOptionPane.CLOSED_OPTION,
								JOptionPane.WARNING_MESSAGE, null);
						textKorean.setText("");
						textEnglish.setText("");
						textMath.setText("");
						return;
					}
					setScore(korean, english, math);
					textKorean.setText("");
					textEnglish.setText("");
					textMath.setText("");
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(frame, "정수를 입력해주세요.", "정수 입력 요구 안내문", JOptionPane.CLOSED_OPTION,
							JOptionPane.WARNING_MESSAGE, null);
					textKorean.setText("");
					textEnglish.setText("");
					textMath.setText("");
				}

			}
		});
		btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 30));
		btnInsert.setBounds(12, 257, 103, 82);
		frame.getContentPane().add(btnInsert);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				removeList();

			}
		});
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 30));
		btnDelete.setBounds(117, 257, 103, 82);
		frame.getContentPane().add(btnDelete);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 366, 313, 278);
		frame.getContentPane().add(scrollPane);

		table = new JTable();

		Object[][] data = {}; // 테이블에 사용할 데이터
		model = new DefaultTableModel(data, COLUMN_NAMES);
//		model.addRow(data);
//		model.removeRow(1);
		table.setModel(model);

		scrollPane.setViewportView(table);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try 
				(FileOutputStream out = new FileOutputStream(FILE);
						BufferedOutputStream bout = new BufferedOutputStream(out);
						ObjectOutputStream oout = new ObjectOutputStream(bout);)
				{
					oout.writeObject(scoreList);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			}
		});
		btnSave.setFont(new Font("D2Coding", Font.PLAIN, 30));
		btnSave.setBounds(222, 257, 103, 82);
		frame.getContentPane().add(btnSave);

	}

	public void removeList() {
		int nowRow = table.getSelectedRow();
		if (nowRow == -1) {
			JOptionPane.showConfirmDialog(frame, "선택한 인덱스가 없습니다.", "인덱스 범위 참조 오류", JOptionPane.CLOSED_OPTION);

			return;
		} else {
			model.removeRow(nowRow);
			scoreList.remove(nowRow);
		}

	}

	public void setScore(int korean, int english, int math) {

		Score score = new Score(korean, english, math);
		scoreList.add(score);
		Object[] data = { korean, english, math, score.getTotal(), score.getMean(score.getTotal()) };
		model.addRow(data);

	}
}
