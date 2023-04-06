package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.fileutil.FileUtil;
import edu.java.contact.model.Contact;
import edu.java.contact05.ContactDaoImpl;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactMain06 {
	private static final String[] columnName = { "No.", "이름", "전화번호", "E-mail" };

	private JFrame frame;
	private JPanel buttonPanel;
	private JButton btnSearch;
	private JButton btnModify;
	private JButton btnDelete;
	private JButton btnInsert;
	private JScrollPane scrollPane;
	private JTable table;

	private DefaultTableModel model; // 테이블의 데이터, 컬럼 이름 등을 관리하는 객체
	private ContactDaoImpl dao = ContactDaoImpl.getInstance(); // 연락처 정보 관리하는 객체(Controller)

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06 window = new ContactMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void resetTableModel() {
		model = new DefaultTableModel(null, columnName);

		// 파일에 저장된 데이터를 다시 읽고 테이블 모델에 추가
		loadContactData();

		// 새롭게 만들어진 테이블 모델을 테이블에 세팅.
		table.setModel(model);
	}
	
	public void notifyContactDelete() {
		
		resetTableModel();
		JOptionPane.showMessageDialog(frame, "연락처 삭제 성공!");
	}
	
	public void notifyContactUpdate() {
		
		resetTableModel();
		JOptionPane.showMessageDialog(frame, "연락처 수정 성공!");
	}
	
	
	// ContactCreateFrame에서 새 연락처 저장을 성공했을때 호출할 메서드.
	public void notifyContactCreated() {
		// TODO J table을 새로 그려줌.
		// 데이터가 빈 모델을 새로 생성
		
		resetTableModel();
		JOptionPane.showMessageDialog(frame, "연락처 신규 등록 성공!");
	}

	/**
	 * Create the application.
	 */
	public ContactMain06() {
		initialize(); // 화면에 보여질 GUI 컴포넌트 들을 생성하고 초기화
		loadContactData(); // 파일에 저장된 연락처 데이터를 로딩(테이블 초기화).
	}

	private void loadContactData() {

		List<Contact> contacts = (List<Contact>) dao.read();

		for (int i = 0; i < contacts.size(); i++) {
			Object[] rowdata = { i + 1 + "", contacts.get(i).getName(), contacts.get(i).getPhone(),
					contacts.get(i).getEmail() };
			model.addRow(rowdata);
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("연락처 v0.6");
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);

		btnInsert = new JButton("새 연락처");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ContactCreateFrame.showFrame(frame, ContactMain06.this);
				// this - ActionLIstener 타입의 익명 객체
				// ContactMain06.this - ContactMain06 타입의 객체

			}
		});
		btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 20));
		buttonPanel.add(btnInsert);

		btnSearch = new JButton("연락처검색");
		btnSearch.setFont(new Font("D2Coding", Font.PLAIN, 20));
		buttonPanel.add(btnSearch);

		btnModify = new JButton("연락처수정");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleclickbtnModify();

			}
		});
		btnModify.setFont(new Font("D2Coding", Font.PLAIN, 20));
		buttonPanel.add(btnModify);

		btnDelete = new JButton("연락처삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleclickbtnDelete();

			}
		});
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 20));
		buttonPanel.add(btnDelete);

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable(); // Jtable 타입 객체 생성

		Object[][] data = {};
		model = new DefaultTableModel(data, columnName); // TableModel 객체를 생성

		// TODO: 테이블 컬럼 이름의 폰트 변경.
		table.getTableHeader().setFont(new Font("D2Coding", Font.BOLD, 20));
		// 테이블 데이터 행의 폰트 변경
		table.setFont(new Font("D2Coding", Font.PLAIN, 15));

		table.setModel(model); // TableModel 객체를 인수로 table에 전달

		scrollPane.setViewportView(table);
	}

	protected void handleclickbtnModify() {
		// TODO Auto-generated method stub
		int[] select = table.getSelectedRows();
		if(select.length!=1) {
			JOptionPane.showMessageDialog(frame, "업데이트할 행을 하나 선택하세요.", "경고", JOptionPane.WARNING_MESSAGE, null);
			return;
			
		}
		
		ContactUpdateFrame.showContactUpdateFrame(frame, select[0], ContactMain06.this);
		
		
	}

	protected void handleclickbtnDelete() {
		// TODO Auto-generated method stub
		int[] selectedRows = table.getSelectedRows();
		if (table.getSelectedRow() == -1) {
			JOptionPane.showConfirmDialog(frame, "선택한 연락처가 없습니다.", "선택 범위 오류", JOptionPane.CLOSED_OPTION,
					JOptionPane.ERROR_MESSAGE, null);
			return;
		}
		String select = JOptionPane.showInputDialog(frame, "정말 삭제하시겠습니까? 그렇다면 (네) 를 입력하세요", "삭제 확인",
				JOptionPane.CLOSED_OPTION);
		try {
			if (!select.equals("네")) {
				return;
			} 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(frame, "잘못된 입력이므로 취소합니다.");
			return;
		}
		
		

		if (selectedRows.length >= 1) {
			for (int i = 0; i < selectedRows.length; i++) {
				dao.delete(table.getSelectedRow());
				model.removeRow(table.getSelectedRow());

			}
		}
		notifyContactDelete();
	}

}
