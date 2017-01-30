package ergasia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXDatePicker;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class receit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void ReceitScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receit frame = new receit();
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
	public receit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JXDatePicker picker1 = new JXDatePicker();
		picker1.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker1.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker1.setBounds(294, 385, 117, 32);
        picker1.setDate(Calendar.getInstance().getTime());
        
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        picker1.setFormats(dateFormat1);
        DateFormat sysDate1 = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store1 = sysDate1.format(picker1.getDate()).toString();
       
      contentPane.add(picker1);
        
        
        JXDatePicker picker2 = new JXDatePicker();
        
        picker2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		picker2.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker2.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker2.setBounds(74, 385, 117, 32);
        picker2.setDate(Calendar.getInstance().getTime());
       
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        picker2.setFormats(dateFormat2);
        DateFormat sysDate2 = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store2 = sysDate2.format(picker2.getDate()).toString();
        
        contentPane.add(picker2);
       
		
		
		textField = new JTextField();
		textField.setBounds(294, 38, 117, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 38, 117, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(74, 100, 117, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(74, 196, 117, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(294, 258, 117, 32);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(74, 258, 117, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("EKTY\u03A0\u03A9\u03A3\u0397");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "« ≈ ‘’–Ÿ”« ¡–œƒ≈…Œ«” œÀœ À«—Ÿ»« ≈!");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(307, 519, 117, 32);
		contentPane.add(btnNewButton);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(294, 196, 117, 32);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(18, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(228, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(18, 118, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(18, 214, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(201, 214, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u03A4\u0397\u039B\u0395\u03A6\u03A9\u039D\u039F");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(10, 276, 64, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0394\u0399\u0395\u03A5\u0398\u03A5\u039D\u03A3\u0397");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(201, 276, 64, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(294, 322, 117, 32);
		contentPane.add(textField_8);
		
		JLabel label = new JLabel("\u03A0\u039F\u03A3\u039F \u20AC");
		label.setBounds(228, 334, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_7 = new JLabel("\u0391\u03A6\u0399\u039E\u0397");
		lblNewLabel_7.setBounds(10, 403, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u0391\u039D\u0391\u03A7\u03A9\u03A1\u0399\u03A3\u0397");
		lblNewLabel_8.setBounds(222, 403, 70, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel label_1 = new JLabel("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 \u03A5\u03A0\u0391\u039B\u039B\u0397\u039B\u039F\u03A5");
		label_1.setBounds(158, 11, 134, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 \u03A0\u0395\u039B\u0391\u03A4\u0397");
		label_2.setBounds(158, 155, 116, 14);
		contentPane.add(label_2);
	}
}
