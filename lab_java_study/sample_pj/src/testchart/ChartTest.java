package testchart;


import java.awt.EventQueue;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JTextField;

public class ChartTest {

	
	
	private JFrame frame;
	private JTextField textField;
	private Font mainfont = new Font("D2Coding", Font.PLAIN, 15);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChartTest window = new ChartTest();
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
	public ChartTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public IntervalCategoryDataset createAddchartData() {
		
		TaskSeriesCollection data = new TaskSeriesCollection();
		TaskSeries series = new TaskSeries("업무 시간");
		Date date = new Date(123,3,7,12,0,0);
		Date date2 = new Date(123,3,8,6,0,0);
		Date date3 = new Date(123,3,7,9,0,0);
		
		series.add(new Task("김다훈", new SimpleTimePeriod(date,date2)));
		series.add(new Task("양우석", new SimpleTimePeriod(date3, date2)));
		
		data.add(series);
		
		
		return data;
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// chart 객체 생성 (차트제목, X축, Y축, 차트에 넣을 데이터)
		JFreeChart chart1 = ChartFactory.createGanttChart("업무 스케줄", "이름", "근무시간", createAddchartData()); 
		ChartPanel chartPanel = new ChartPanel(chart1);
		chartPanel.setRangeZoomable(false);
		// chart판넬 생성 후 차트를 넣음
		chartPanel.setBackground(Color.GRAY);
		chartPanel.setAutoscrolls(false);
		// 차트 및 판넬 생성 관련 코드
		
		// 차트의 X, Y, 제목, 범례 등에 폰트를 세팅
		CategoryPlot caseSet = chart1.getCategoryPlot();
		chart1.getTitle().setFont(mainfont);
		chart1.getLegend().setItemFont(mainfont);
		caseSet.getDomainAxis().setLabelFont(mainfont);
		caseSet.getDomainAxis().setTickLabelFont(mainfont);
		caseSet.getRangeAxis().setLabelFont(mainfont);
		caseSet.getRangeAxis().setTickLabelFont(mainfont);
		
		
		// 간트차트 최초날 -> before // 간트차트 마지막날 -> after
		Date now = new Date();
		Date before = new Date(now.getYear(),now.getMonth(),now.getDay());
		Date after = new Date(now.getYear(),now.getMonth(),now.getDay()+7);
		
		// 범위 관련된 설정값
		DateAxis axis = (DateAxis) caseSet.getRangeAxis(); // DateAxis 타입으로 캐스팅, CategoryPlot 타입의 caseSet 변수의 메서드 getRangeAxis를 호출함.
		axis.setRange(before, after);
		DateTickUnit unit = new DateTickUnit(DateTickUnit.DAY,1); // DateTickUnit (기간의 간격 조건 = 시간 날짜 등, 간격범위  )
		axis.setTickUnit(unit); 

		axis.setDateFormatOverride(new SimpleDateFormat("MM-dd")); // 날짜 형식 포맷
		
//		axis.setRange(new Date(new Date().getYear(), new Date().getMonth(),new Date().getDay()-2,new Date().getHours(),new Date().getMinutes())
//				,new Date(new Date().getYear(),new Date().getMonth(),new Date().getDay()+2,new Date().getHours(),new Date().getMinutes()));
		
		chartPanel.setBounds(120,120,1400,200); // 판넬의 크기 및 위치 설정
		
		frame.getContentPane().add(chartPanel); // 메인 프레임에 판넬을 추가
		
		
		
		
		
		
	
		
		
	}
}
