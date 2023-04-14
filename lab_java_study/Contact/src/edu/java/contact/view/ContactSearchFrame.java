package edu.java.contact.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.controller.ContactDaoImpl;
import edu.java.contact.model.Contact;

import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;

public class ContactSearchFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textsearch;
	private JTable table;
	private JButton btnSearch;
	private JButton btnclose;
	private static final String[] comboBoxList = { "CID", "NAME", "PHONE", "EMAIL" };
	private List<Contact> contactlist;
	private static ContactDaoImpl dao = ContactDaoImpl.getInstance();
	private String[] columnName = { "Name", "Phone", "Email" };
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void showSearchFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactSearchFrame frame = new ContactSearchFrame();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ContactSearchFrame() {

		initialize();
		
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		Object[][] data = {};
		model = new DefaultTableModel(data, columnName);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				handleclickbtnSearch();

			}
		});
		panel.add(btnSearch);

		btnclose = new JButton("닫기");
		btnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});
		panel.add(btnclose);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);

		JLabel lblsearchText = new JLabel("검색할 내용");
		panel_1.add(lblsearchText);

		textsearch = new JTextField();
		panel_1.add(textsearch);
		textsearch.setColumns(10);
	}

	protected void handleclickbtnSearch() {
		// TODO Auto-generated method stub

		
		
		String content = textsearch.getText();
		
		contactlist = dao.read(content);
		Object[][] data = {};
		model = new DefaultTableModel(data, columnName);
		table.setModel(model);
		try {
			for(int i = 0 ; i < contactlist.size(); i++) {
				
				model.addRow(new Object[] {contactlist.get(i).getName(), contactlist.get(i).getPhone(),contactlist.get(i).getEmail()});
				
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "잘못된 입력입니다. 제대로 입력해주세요.");
		}

	}

}
