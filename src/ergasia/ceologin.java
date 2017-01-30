package ergasia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ceologin extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ceoenter() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ceologin frame = new ceologin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	private JTextField textField;
	private JPasswordField passwordField;
	
	/**
	 * Create the frame.
	 */
	public ceologin() {
		setSize(450, 330);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		connection=DBconnect.dbConnector();
     	setTitle("Login");
		getContentPane().setLayout(null);
		frame = new JFrame();
		frame.setBounds(350, 150, 650, 500);
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(288, 89, 137, 39);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(288, 145, 137, 39);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
						try{
					     if(textField.getText().equals("") || passwordField.getText().equals("")){
					    	 String message = "сулпкгяысте ока та педиа";
								JOptionPane.showMessageDialog(new JFrame(),message, "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
						}
						else
						{
						String query="select * from login where username=? and password=? and job = 'ceo'";
						PreparedStatement pst= connection.prepareStatement(query);
						pst.setString(1, textField.getText());
						pst.setString(2, passwordField.getText());
						ResultSet rs=pst.executeQuery();
						
						
						int count=0;
						while (rs.next()){
							count=count+1;
						}
						if (count==1){
							JOptionPane.showMessageDialog(null, "Welcome");
						    dispose();
							ceo ceo1=new ceo();
							ceo1.setVisible(true);
						}
						else {
						    String message1 = "та стоивеиа сас дем еимаи сыста,намапяоспахгсте";
							JOptionPane.showMessageDialog(new JFrame(),message1, "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
						}
						
						rs.close();
						pst.close();
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
						
					}
				
			}
		});
		btnNewButton.setBounds(288, 207, 137, 39);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 89, 172, 39);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 139, 149, 39);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblWelcome = new JLabel("LOGIN");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblWelcome.setBounds(168, 11, 73, 39);
		getContentPane().add(lblWelcome);
	
		
		
		
	}
}
