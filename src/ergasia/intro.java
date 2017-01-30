package ergasia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Window.Type;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Scrollbar;
import javax.swing.JTextArea;

public class intro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intro frame = new intro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Connection connection=null;
	/**
	 * Create the frame.
	 */
	public intro() {
		
		//connection=DBconnect.dbConnector();
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setForeground(new Color(0, 0, 0));
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(new Color(47, 79, 79));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	   
		
		
		
		JButton btnNewButton = new JButton("CEO");
		btnNewButton.setBounds(3, 26, 101, 31);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				
				ceologin ceo1 = new ceologin();
				dispose();
				ceo1.ceoenter();
				
			}
		});
		
		JButton btnEmp = new JButton("EMP");
		btnEmp.setBounds(4, 64, 101, 31);
		contentPane.add(btnEmp);
		btnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				
				emploeelogin emp1 = new emploeelogin();
				dispose();
				emp1.emploeeenter();;
			}
		});
		
		JButton btnNewButton_2 = new JButton("еисодос");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(895, 848, 115, 46);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				customer cus = new customer();
				cus.CustomerScreen();
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel lblLogin = new JLabel("\u0395\u03A0\u0399\u039B\u039F\u0393\u0397 LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLogin.setBounds(4, 7, 146, 14);
		contentPane.add(lblLogin);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(47, 79, 79));
		textArea.setFont(new Font("Tahoma", Font.BOLD, 20));
		textArea.setText("\u0393\u03B9\u03B1 \u03BA\u03C1\u03B1\u03C4\u03AE\u03C3\u03B5\u03B9\u03C2 \u03B1\u03BB\u03BB\u03B1 \u03BA\u03B1\u03B9 \u03B3\u03B9\u03B1 \u03C0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2 \u03B3\u03B9\u03B1 \u03C4\u03BF \u03BE\u03B5\u03BD\u03BF\u03B4\u03BF\u03C7\u03B5\u03AF\u03BF \u03BC\u03B1\u03C2 ,\r\n                        \u03C0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \u03C3\u03C4\u03BF \u03BA\u03BF\u03C5\u03BC\u03C0\u03AF \u0395\u0399\u03A3\u039F\u0394\u039F\u03A3");
		textArea.setBounds(669, 777, 656, 60);
		contentPane.add(textArea);
		
		JLabel lblimg = new JLabel("");
	    Image img= new ImageIcon(this.getClass().getResource("/e.png")).getImage();
		lblimg.setIcon(new ImageIcon(img));
		lblimg.setBounds(345, 41, 1291, 735);
		contentPane.add(lblimg);
		
	}
}

