package testchart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class DeptAdAndCall {

	private JFrame frame;
	private JTable table;
	private JTable table2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeptAdAndCall window = new DeptAdAndCall();
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
	public DeptAdAndCall() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 731);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(291, 5, 225, 64);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		panel.add(table);
		
		table2 = new JTable();
		table2.setBounds(291, table.getY()+table.getHeight()+15, 225, 64);
		table2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		panel.add(table2);
		
		JButton btnNewButton = new JButton("조직도 부서 추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(168, 667, 151, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("조직도 부서 삭제");
		btnNewButton_1.setBounds(446, 667, 160, 23);
		panel.add(btnNewButton_1);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("대표이사/김땡땡/상상기업") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					node_1 = new DefaultMutableTreeNode("관리부");
						node_2 = new DefaultMutableTreeNode("경영관리팀");
							node_2.add(new DefaultMutableTreeNode("이승옥 - 부장"));
							node_2.add(new DefaultMutableTreeNode("김민철 - 차장"));
							node_2.add(new DefaultMutableTreeNode("이승기 - 대리"));
						node_1.add(node_2);
					add(node_1);
					
					System.out.println(tree.getLeadSelectionRow());
					
					node_1 = new DefaultMutableTreeNode("영업부");
						node_2 = new DefaultMutableTreeNode("영업지원팀");
							node_2.add(new DefaultMutableTreeNode("박지원 과장"));
							node_2.add(new DefaultMutableTreeNode("김영아 사원"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("영업팀");
							node_2.add(new DefaultMutableTreeNode("박부장 부장"));
							node_2.add(new DefaultMutableTreeNode("서인철 대리"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("마케팅팀");
							node_2.add(new DefaultMutableTreeNode("이부장 부장"));
							node_2.add(new DefaultMutableTreeNode("김과장 과장"));
							node_2.add(new DefaultMutableTreeNode("차사원 사원"));
						node_1.add(node_2);
					add(node_1);
					node_1 = new DefaultMutableTreeNode("생산부");
						node_2 = new DefaultMutableTreeNode("생산1팀");
							node_2.add(new DefaultMutableTreeNode("김생산 반장"));
							node_2.add(new DefaultMutableTreeNode("김산생 주임"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("생산2팀");
							node_2.add(new DefaultMutableTreeNode("박생산 팀장"));
							node_2.add(new DefaultMutableTreeNode("이산생 주임"));
							node_2.add(new DefaultMutableTreeNode("최산생 주임"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("품질관리팀");
							node_2.add(new DefaultMutableTreeNode("양지훈 팀장"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("생산기술팀");
							node_2.add(new DefaultMutableTreeNode("김생기 팀장"));
							node_2.add(new DefaultMutableTreeNode("김기생 사원"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("생산관리팀");
							node_2.add(new DefaultMutableTreeNode("정동진 팀장"));
							node_2.add(new DefaultMutableTreeNode("박품질 인턴"));
						node_1.add(node_2);
					add(node_1);
				}
			}
		));
		tree.setBounds(88, 232, 249, 247);
		panel.add(tree);
	}
}
