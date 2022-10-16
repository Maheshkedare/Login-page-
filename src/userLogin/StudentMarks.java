package userLogin;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField totalmarks;
	private JTextField average;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
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
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marks Calulation System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(68, 46, 319, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subject 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(48, 123, 104, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject 2");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(48, 172, 104, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total Marks");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(48, 272, 104, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Subject 3");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(48, 219, 104, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Average");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(48, 323, 104, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Grade");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(48, 376, 104, 33);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		sub1 = new JTextField();
		sub1.setBounds(204, 132, 96, 19);
		frame.getContentPane().add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(204, 181, 96, 19);
		frame.getContentPane().add(sub2);
		
		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(204, 228, 96, 19);
		frame.getContentPane().add(sub3);
		
		totalmarks = new JTextField();
		totalmarks.setColumns(10);
		totalmarks.setBounds(204, 281, 96, 19);
		frame.getContentPane().add(totalmarks);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(204, 332, 96, 19);
		frame.getContentPane().add(average);
		
		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(204, 385, 96, 19);
		frame.getContentPane().add(grade);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				
				int total = s1 + s2 + s3;
				int avg = total/3;
				
				totalmarks.setText(String.valueOf(total));
				average.setText(String.valueOf(avg));
				
				if(avg>45) {
					grade.setText("Passed");
				}
				else {
					grade.setText("Failed");
				}
				
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnAdd.setBounds(377, 153, 104, 33);
		frame.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				totalmarks.setText("");
				average.setText("");
				grade.setText("");
				
				sub1.requestFocus();
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnClear.setBounds(377, 227, 104, 33);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnExit.setBounds(377, 306, 104, 33);
		frame.getContentPane().add(btnExit);
	}
}
