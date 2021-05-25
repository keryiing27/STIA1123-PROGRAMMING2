package Exercise5_1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Add_Minus {

	private JFrame frame;
	private JTextField Inttextfield;
	private JTextField Inttextfield2;
	private JTextField Resulttextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Minus window = new Add_Minus();
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
	public Add_Minus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Inttextfield = new JTextField();
		Inttextfield.setBounds(50, 43, 119, 34);
		frame.getContentPane().add(Inttextfield);
		Inttextfield.setColumns(10);
		
		Inttextfield2 = new JTextField();
		Inttextfield2.setBounds(244, 43, 119, 34);
		frame.getContentPane().add(Inttextfield2);
		Inttextfield2.setColumns(10);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		AddButton.setForeground(Color.BLACK);
		AddButton.setBackground(Color.PINK);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,answer;
				try {
					  num1 = Integer.parseInt(Inttextfield.getText());
					  num2 = Integer.parseInt(Inttextfield2.getText());
					  
					  answer = num1+num2;
					  Resulttextfield.setText(Integer.toString(answer));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the integer correctly");
				}
				
			}
		});
		AddButton.setBounds(61, 113, 96, 26);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("Minus");
		MinusButton.setBackground(Color.PINK);
		MinusButton.setForeground(Color.BLACK);
		MinusButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,answer;
				try {
					  num1 = Integer.parseInt(Inttextfield.getText());
					  num2 = Integer.parseInt(Inttextfield2.getText());
					  
					  answer = num1-num2;
					  Resulttextfield.setText(Integer.toString(answer));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the integer correctly");
				}
				
			}
		});
		MinusButton.setBounds(255, 113, 96, 26);
		frame.getContentPane().add(MinusButton);
	
		
		Resulttextfield = new JTextField();
		Resulttextfield.setBounds(150, 169, 119, 34);
		frame.getContentPane().add(Resulttextfield);
		Resulttextfield.setColumns(10);
		
		JLabel ResultLabel = new JLabel("The Answer is :");
		ResultLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ResultLabel.setBounds(45, 185, 145, 26);
		frame.getContentPane().add(ResultLabel);
	}
}
