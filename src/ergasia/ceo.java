package ergasia;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import javax.swing.JFrame;
import org.jdesktop.swingx.JXDatePicker;

import net.proteanit.sql.DbUtils;

import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;


import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

import java.io.File;

public class ceo extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void CeoScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ceo frame = new ceo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JButton btnRefresh;
	private JTable table_1;
	private JButton button;
	private JButton btnNewButton;
	private JTable table_2;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;

	/**
	 * Create the frame.
	 */
	public ceo() {
        setTitle("HOTEL");
        setSize(1698,909);
		setResizable(false);
		connection=DBconnect.dbConnector();
		setForeground(Color.BLACK);
		setTitle("Ceo\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 76, 515, 225);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnRefresh = new JButton("\u0391\u039D\u0391\u039D\u0395\u03A9\u03A3\u0397");
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                	String query3="SELECT * FROM staff ";
                	PreparedStatement pst3= connection.prepareStatement(query3);
                	System.out.println(query3);
                	ResultSet rs1=pst3.executeQuery();
                	table.setModel(DbUtils.resultSetToTableModel(rs1));

        			pst3.close();
        			rs1.close();
         
        		} catch (SQLException e) {
        			
        			e.printStackTrace();
        		}
			}
		});
		btnRefresh.setBounds(412, 312, 153, 43);
		contentPane.add(btnRefresh);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(936, 76, 736, 226);
		contentPane.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		
		button = new JButton("\u0391\u039D\u0391\u039D\u0395\u03A9\u03A3\u0397");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                	String query="SELECT * FROM bookings";
                	PreparedStatement pst= connection.prepareStatement(query);
                	System.out.println(query);
                	ResultSet rs=pst.executeQuery();
                	table_1.setModel(DbUtils.resultSetToTableModel(rs));

        			pst.close();
        			rs.close();
         
        		} catch (SQLException e) {
        			
        			e.printStackTrace();
        		}
			}
		});
		button.setBounds(1518, 312, 154, 43);
		contentPane.add(button);
		
		btnNewButton = new JButton("\u03A3\u03A7\u0395\u0394\u0399\u0391\u0393\u03A1\u0391\u039C\u039C\u0391 \u03A0\u039B\u0397\u03A1\u03A9\u03A4\u0397\u03A4\u0391\u03A3 \u0391\u039D\u0391 \u0395\u03A4\u039F\u03A3");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
             
				DefaultPieDataset pieDataset = new DefaultPieDataset();
				pieDataset.setValue("2014", new Integer(75));
				pieDataset.setValue("2015", new Integer(64));
				pieDataset.setValue("2016", new Integer(75));
				pieDataset.setValue("2017", new Integer(45));
				
				JFreeChart chart = ChartFactory.createPieChart3D(
						"пкгяытгта немодовеиоу ама етос", // Title
						pieDataset, // Dataset
						true, // Show legend
						true, // Use tooltips
						false // Configure chart to generate URLs?
						);
				ChartFrame frame = new ChartFrame("пкгяытгта немодовеиоу ама етос",chart);
				frame.setVisible(true);
				frame.setSize(500,500);
						try {
							ChartUtilities.saveChartAsJPEG(new File("C:\\chart.jpg"), chart, 500, 300);
							} catch (Exception e) {
						System.out.println("Problem occurred creating chart.");
					
			}
				
			}
			
		});
		btnNewButton.setBounds(187, 512, 378, 101);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(936, 441, 465, 172);
		contentPane.add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);
		
		JButton button_1 = new JButton("\u0391\u039D\u0391\u039D\u0395\u03A9\u03A3\u0397");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                	String query4="SELECT * FROM rooms ";
                	PreparedStatement pst2= connection.prepareStatement(query4);
                	System.out.println(query4);
                	ResultSet rs2=pst2.executeQuery();
                	table_2.setModel(DbUtils.resultSetToTableModel(rs2));

        			pst2.close();
        			rs2.close();
         
        		} catch (SQLException e) {
        			
        			e.printStackTrace();
        		}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(1247, 624, 154, 43);
		contentPane.add(button_1);
		
		lblNewLabel = new JLabel("\u0395\u0399\u03A3\u0391\u0393\u03A9\u0393\u0397 \u03A0\u03A1\u039F\u03A3\u03A6\u039F\u03A1\u0391\u03A3");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(1411, 466, 189, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(1518, 540, 91, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1518, 499, 91, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		button_2 = new JButton("\u039F\u039A");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                	String query4="update rooms set special_offer='"+textField.getText() +"' where rid='"+ textField_1.getText() +"' ";
                   PreparedStatement pst6;
 				   pst6 = connection.prepareStatement(query4);  
 			       pst6.execute();
                	
                   pst6.close(); 
        		} catch (SQLException e) {
        			
        			e.printStackTrace();
        		}
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(1458, 571, 89, 23);
		contentPane.add(button_2);
		
		lblNewLabel_1 = new JLabel("ID \u0394\u03A9\u039C\u0391\u03A4\u0399\u039F\u03A5");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(1411, 502, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\u03A0\u03A1\u039F\u03A3\u03A6\u039F\u03A1\u0391 ");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(1411, 543, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		label = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/es.png")).getImage();
	    label.setIcon(new ImageIcon(img));
		label.setBounds(10, 676, 335, 194);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u039A\u0391\u03A4\u0391\u03A3\u03A4\u0391\u03A3\u0397 \u0395\u03A1\u0393\u0391\u0396\u039F\u039C\u0395\u039D\u03A9\u039D");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(184, 51, 251, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A0\u0399\u039D\u0391\u039A\u0391\u03A3 \u039A\u0391\u03A4\u0391\u03A3\u03A4\u0391\u03A3\u0397\u03A3 \u039A\u03A1\u0391\u03A4\u0397\u03A3\u0395\u03A9\u039D");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(1165, 51, 333, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u039A\u0391\u03A4\u0391\u03A3\u03A4\u0391\u03A3\u0397 \u0394\u03A9\u039C\u0391\u03A4\u0399\u03A9\u039D");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(1061, 416, 222, 14);
		contentPane.add(label_3);
		Image img1= new ImageIcon(this.getClass().getResource("/es.png")).getImage();
		
		
		
		
		
        
		
	}      
	}
