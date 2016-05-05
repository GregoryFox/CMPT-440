import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class MainFile extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFile frame = new MainFile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setToolTipText("");
		textPane.setBackground(new Color(0, 0, 102));
		textPane.setForeground(new Color(102, 255, 255));
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textPane.setBounds(112, 134, 205, 31);
		contentPane.add(textPane);
		
		txtEnterText = new JTextField();
		txtEnterText.setBackground(new Color(50, 205, 50));
		txtEnterText.setForeground(SystemColor.desktop);
		txtEnterText.setEditable(false);
		txtEnterText.setFont(new Font("Trajan Pro 3", Font.PLAIN, 18));
		txtEnterText.setText(" Enter the Matrix");
		txtEnterText.setBounds(112, 13, 205, 91);
		contentPane.add(txtEnterText);
		txtEnterText.setColumns(10);
		
		JButton btnBurnItLink = new JButton("Burn it Link!");
		btnBurnItLink.setBackground(new Color(0, 204, 0));
		btnBurnItLink.setForeground(new Color(0, 102, 0));
		btnBurnItLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Milestone2DFA runnable = new Milestone2DFA();
				
				boolean Result = runnable.process(textPane.getText());
				System.out.println(Result);
				
				if (Result){
					
					Color myColor = new Color(0, 180, 0);
					textPane.setForeground(myColor);
					textPane.setFont(new Font("Trajan Pro 3", Font.PLAIN, 16));
				}
				else{
					textPane.setFont(new Font("OCR A Std", Font.PLAIN, 16));
					Color myColor = new Color(255, 0, 0);
					textPane.setForeground(myColor);
				}
			}
		});
		btnBurnItLink.setBounds(314, 217, 106, 25);
		contentPane.add(btnBurnItLink);
	}
}
