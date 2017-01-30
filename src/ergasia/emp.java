package ergasia;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Font;
import java.util.Calendar;

import org.jdesktop.swingx.JXDatePicker;

import net.proteanit.sql.DbUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;


public class emp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void EmpScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emp frame = new emp();
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
	

	
	Connection connection=null;
	private JTable table;
	private JTable table_1;
	
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public int counter;
	public String query; 
	
   		
	public emp() {
		setTitle("HOTEL");
		setSize(1340,1000);
		setResizable(false);
		connection=DBconnect.dbConnector();
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 297, 308, 482);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JXDatePicker picker1 = new JXDatePicker();
		picker1.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker1.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker1.setBounds(161, 229, 99, 26);
        picker1.setDate(Calendar.getInstance().getTime());
        
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        picker1.setFormats(dateFormat1);
        DateFormat sysDate1 = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store1 = sysDate1.format(picker1.getDate()).toString();
       
        panel_1.add(picker1);
        
        
        JXDatePicker picker2 = new JXDatePicker();
        
        picker2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		picker2.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker2.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker2.setBounds(161, 266, 99, 26);
        picker2.setDate(Calendar.getInstance().getTime());
       
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        picker2.setFormats(dateFormat2);
        DateFormat sysDate2 = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store2 = sysDate2.format(picker2.getDate()).toString();
        
        panel_1.add(picker2);
       
        
        
        
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField.setBounds(161, 41, 99, 26);
       
        panel_1.add(textField);
        textField.setColumns(10);
        
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField_1.setBounds(161, 78, 99, 26);
        panel_1.add(textField_1);
        textField_1.setColumns(10);
        
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField_2.setBounds(161, 115, 99, 28);
        panel_1.add(textField_2);
        textField_2.setColumns(10);
        
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField_3.setBounds(161, 153, 99, 26);
        panel_1.add(textField_3);
        textField_3.setColumns(10);
        
        String [] roomStrings = {"1", "2", "3","4","5","6","7","8","9","10"};
        JComboBox rooms = new JComboBox(roomStrings);
        rooms.setFont(new Font("Tahoma", Font.PLAIN, 13));
        rooms.setBounds(161, 303, 99, 32);
        rooms.setSelectedIndex(9);
        panel_1.add(rooms);
        
        
        JLabel lblNewLabel_2 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(20, 82, 60, 14);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("\u0397\u039C\u0395\u03A1\u0391 \u0391\u03A6\u0399\u039E\u0397\u03A3");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(20, 234, 99, 14);
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("\u0397\u039C\u0395\u03A1\u0391 \u0391\u039D\u0391\u03A7\u03A9\u03A1\u0399\u03A3\u0397\u03A3");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(20, 271, 127, 14);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("\u039F\u039D\u039F\u039C\u0391");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(20, 45, 60, 14);
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("\u03A4\u0397\u039B\u0395\u03A6\u03A9\u039D\u039F");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(20, 120, 72, 14);
        panel_1.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("\u0394\u0399\u0395\u03A5\u0398\u03A5\u039D\u03A3\u0397");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(20, 157, 83, 14);
        panel_1.add(lblNewLabel_7);
        
       
        
        JButton btnNewButton_1 = new JButton("œÀœ À«—Ÿ”«");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try{
				     if(textField.getText().equals("") || textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")){
				    	 String message = "”’Ã–À«—Ÿ”‘≈ œÀ¡ ‘¡ –≈ƒ…¡";
						JOptionPane.showMessageDialog(new JFrame(),message,"≈RROR",JOptionPane.ERROR_MESSAGE);
				     }else
						{
				    	 int counter = 0;
				    	 String query="select * from bookings where sd=? and ld=? and room=? ";
				    	 PreparedStatement pst=connection.prepareStatement(query);
				    	 pst.setString(1,sysDate1.format(picker1.getDate()).toString());
				    	 pst.setString(2,sysDate2.format(picker2.getDate()).toString());
				    	 pst.setString(3,rooms.getSelectedItem().toString());
				         
				        
				         
				         ResultSet rs=pst.executeQuery();
				    	 
				    	 while (rs.next()){
								counter=counter+1;
							}
				    	 if (counter==1){
				    		 String message = "‘œ ƒŸÃ¡‘…œ ƒ≈Õ ≈…Õ¡… ƒ…¡»≈”…Ãœ ¡’‘≈” ‘…” «Ã≈—œÃ«Õ…≈”";
								JOptionPane.showMessageDialog(new JFrame(),message,"≈RROR",JOptionPane.ERROR_MESSAGE);
								
							}
				    	 else{
						 
				    	
				    	 
				    	 String query2="insert into bookings (name,lastname,address,phone,sd,ld,room,people) values(?,?,?,?,?,?,?,?)";
				    	 PreparedStatement pst1= connection.prepareStatement(query2);
				    	 
						pst1.setString(1, textField.getText());
						pst1.setString(2, textField_1.getText());
						pst1.setString(3, textField_2.getText());
						pst1.setString(4, textField_7.getText());
						pst1.setString(8, textField_3.getText());
						pst1.setString(5,sysDate1.format(picker1.getDate()).toString()); 
						pst1.setString(6,sysDate2.format(picker2.getDate()).toString());
						pst1.setString(7,rooms.getSelectedItem().toString());
						pst1.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "«  —¡‘«”«  ¡‘¡◊Ÿ—«»« ≈!");
				   	 }
				    	    rs.close();
							pst.close();
							
						}
				     
        		}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
					
        		}
  }
        });
       
        btnNewButton_1.setBounds(135, 421, 148, 47);
        panel_1.add(btnNewButton_1);
        
        
        
    		
     
        
        JLabel label = new JLabel("\u0395\u0399\u03A3\u0391\u0393\u03A9\u0393\u0397 \u039D\u0395\u0391\u03A3 \u039A\u03A1\u0391\u03A4\u0397\u03A3\u0397\u03A3");
        label.setBounds(25, 11, 250, 14);
        panel_1.add(label);
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        JLabel label_5 = new JLabel("\u0394\u03A9\u039C\u0391\u03A4\u0399\u039F");
        label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_5.setBounds(20, 311, 60, 14);
        panel_1.add(label_5);
        
        textField_7 = new JTextField();
        textField_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField_7.setColumns(10);
        textField_7.setBounds(161, 190, 99, 26);
        panel_1.add(textField_7);
        
        JLabel label_7 = new JLabel("\u0391\u03A4\u039F\u039C\u0391");
        label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_7.setBounds(20, 197, 83, 14);
        panel_1.add(label_7);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(550, 98, 726, 281);
        contentPane.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
     
        
        JButton btnRefresh = new JButton("¡Õ¡Õ≈Ÿ”«");
        btnRefresh.setBounds(1146, 386, 130, 39);
        btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnRefresh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
                	String query3="SELECT * FROM bookings";
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
        contentPane.add(btnRefresh);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(550, 642, 726, 91);
        contentPane.add(scrollPane_1);
        
        table_1 = new JTable();
        scrollPane_1.setViewportView(table_1);
        table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        textField_4 = new JTextField();
        textField_4.setBounds(781, 756, 107, 23);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(981, 756, 107, 23);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        JButton btnNewButton = new JButton("¡Õ¡∆«‘«”«");
        btnNewButton.setBounds(1146, 746, 130, 39);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try{
				     if(textField_4.getText().equals("") || textField_5.getText().equals("")){
				    	String message = "”’Ã–À«—Ÿ”‘≈ œÀ¡ ‘¡ –≈ƒ…¡";
						JOptionPane.showMessageDialog(new JFrame(),message,"≈RROR",JOptionPane.ERROR_MESSAGE);
        		
        	}
        		    else{
				String query4="select * from bookings where name=? and lastname=?";
				PreparedStatement pst4= connection.prepareStatement(query4);
				pst4.setString(1, textField_4.getText());
				pst4.setString(2, textField_5.getText());
				ResultSet rs1=pst4.executeQuery();
				
				int counter=0;
				while (rs1.next()){
					counter=counter+1;
				}
				if(counter==1){
					String query5="select * from bookings where name=? and lastname=?";
					ResultSet rs2=pst4.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs2));
					
				}
				else {
					JOptionPane.showMessageDialog(null, "ƒ≈Õ ’–¡—◊≈… –≈À¡‘«” Ã≈ ¡’‘¡ ‘¡ ”‘œ…◊≈…¡");
				     }
				
        	 
				 pst4.close();
			     rs1.close();
			     
        		    }
				  
				    
        		}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
					
				} 
        		
      	}
        	
        });
     
        
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnNewButton);
 //---------------------------------------------------------------------------------------------------------- 
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(49, 29, 308, 256);
        panel_2.setBackground(Color.WHITE);
        contentPane.add(panel_2);
       
        JXDatePicker picker3 = new JXDatePicker();
		picker3.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker3.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker3.setBounds(170, 41, 99, 26);
        picker3.setDate(Calendar.getInstance().getTime());
        
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        picker3.setFormats(dateFormat3);
        DateFormat sysDate3 = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store3 = sysDate3.format(picker3.getDate()).toString();
        panel_2.setLayout(null);
        panel_2.add(picker3);
       
        DateFormat dateFormat4 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat sysDate4 = new SimpleDateFormat("yyyy/MM/dd");
        
        String [] roomStrings2 = { "ƒ˘Ï·ÙÈÔ 1", "ƒ˘Ï·ÙÈÔ 2", "ƒ˘Ï·ÙÈÔ 3"};
        
        JLabel lblNewLabel = new JLabel("\u0397\u039C\u0395\u03A1\u0391 \u0391\u03A6\u0399\u039E\u0397\u03A3");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(10, 46, 99, 14);
        panel_2.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("\u0397\u039C\u0395\u03A1\u0391 \u0391\u039D\u0391\u03A7\u03A9\u03A1\u0399\u03A3\u0397\u03A3");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(10, 104, 132, 14);
        panel_2.add(lblNewLabel_1);
        
        JLabel label_2 = new JLabel("\u0394\u03A9\u039C\u0391\u03A4\u0399\u039F");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_2.setBounds(10, 157, 74, 14);
        panel_2.add(label_2);
        JComboBox rooms2 = new JComboBox(roomStrings2);
        rooms2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        rooms2.setBounds(170, 149, 99, 32);
        panel_2.add(rooms2);
        rooms2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3","4","5","6","7","8","9","10"}));
        rooms2.setSelectedIndex(9);
        
             
             JXDatePicker picker4 = new JXDatePicker();
             picker4.setBounds(170, 99, 99, 26);
             panel_2.add(picker4);
             picker4.setFont(new Font("Tahoma", Font.PLAIN, 12));
             picker4.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
             picker4.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
             picker4.setDate(Calendar.getInstance().getTime());
             picker4.setFormats(dateFormat4);
             
             JButton btnNewButton_2 = new JButton("¡Õ¡∆«‘«”«");
             btnNewButton_2.setBounds(170, 206, 132, 39);
             panel_2.add(btnNewButton_2);
             btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
             
             JLabel lbli = new JLabel("\u0394\u0399\u0391\u0398\u0395\u03A3I\u039C\u039F\u03A4\u0397\u03A4\u0391 \u0394\u03A9\u039C\u0391\u03A4\u0399\u039F\u03A5");
             lbli.setBounds(20, 11, 278, 23);
             panel_2.add(lbli);
             lbli.setFont(new Font("Tahoma", Font.BOLD, 18));
             btnNewButton_2.addActionListener(new ActionListener() {
             	public void actionPerformed(ActionEvent arg0) {
             		try{
             			int counter = 0;
			    	 String querys="select * from bookings where sd=? and ld=? and room=? "; //and room=?
			    	 PreparedStatement pst=connection.prepareStatement(querys);
			    	 pst.setString(1,sysDate3.format(picker3.getDate()).toString());
			    	 pst.setString(2,sysDate4.format(picker4.getDate()).toString());
			    	 pst.setString(3,rooms2.getSelectedItem().toString());
			         
			        
			         
			         ResultSet rs=pst.executeQuery();
			    	 
			    	 while (rs.next()){
							counter=counter+1;
						}
			    	 if (counter==1){
			    		 String message = "‘Ô ‰˘Ï·ÙÈÔ ‰ÂÌ ÂÈÌ·È ‰È·ËÂÛÈÏÔ ·ıÙÂÚ ÙÈÚ ÏÂÒÂÚ";
						 JOptionPane.showMessageDialog(new JFrame(),message,"≈RROR",JOptionPane.ERROR_MESSAGE);
							
						}else{
							
							JOptionPane.showMessageDialog(null, "‘Ô ‰˘Ï·ÙÈÔ ÂÈÌ·È ‰È·ËÂÛÁÏÔ");
						}
             			
			    	    pst.close();
						rs.close();
             			
             		}catch(SQLException e){}
             	}
             });
             String date_to_store4 = sysDate1.format(picker4.getDate()).toString();
        
        JLabel label_3 = new JLabel("\u039F\u039D\u039F\u039C\u0391");
        label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_3.setBounds(711, 758, 60, 14);
        contentPane.add(label_3);
        
        JLabel label_4 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F");
        label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_4.setBounds(898, 758, 73, 14);
        contentPane.add(label_4);
        
        JButton btnNewButton_3 = new JButton("\u0395\u039A\u0394\u039F\u03A3\u0397 \u0391\u03A0\u039F\u0394\u0395\u0399\u039E\u0397\u03A3");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		receit res = new receit();
				res.ReceitScreen();
        	}
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnNewButton_3.setBounds(798, 866, 227, 57);
        contentPane.add(btnNewButton_3);
        
        JLabel lblNewLabel_8 = new JLabel("\u03A0\u0399\u039D\u0391\u039A\u0391\u03A3 \u039A\u0391\u03A4\u0391\u03A3\u03A4\u0391\u03A3\u0397\u03A3 \u039A\u03A1\u0391\u03A4\u0397\u03A3\u0395\u03A9\u039D");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_8.setBounds(756, 73, 332, 14);
        contentPane.add(lblNewLabel_8);
        
        JPanel panel = new JPanel();
        panel.setBounds(49, 810, 308, 140);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JButton btnNewButton_4 = new JButton("ƒ…¡√—¡÷«");
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        	try {
        		   int counter = 0;
		    	   String queryd="DELETE FROM bookings WHERE id='"+ textField_6.getText() +"'"; 
		    	   PreparedStatement pst6;
				   pst6 = connection.prepareStatement(queryd);  
			       pst6.execute();
		
			       JOptionPane.showMessageDialog(null,"«  —¡‘«”« ƒ…¡√—¡÷« ≈!");
                   pst6.close();
					
				
			    	 
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		    	 

        		
        		//DELETE FROM table_name [WHERE Clause]
        	}
        });
        btnNewButton_4.setBounds(150, 82, 148, 47);
        panel.add(btnNewButton_4);
        
        textField_6 = new JTextField();
        textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField_6.setBounds(30, 87, 53, 33);
        panel.add(textField_6);
        textField_6.setColumns(10);
        
        JLabel label_6 = new JLabel("\u0391\u03A6\u0391\u0399\u03A1\u0395\u03A3\u0397 \u039A\u03A1\u0391\u03A4\u0397\u03A3\u0397\u03A3");
        label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
        label_6.setBounds(53, 11, 207, 14);
        panel.add(label_6);
        
        JLabel lblId = new JLabel("ID \u039A\u03A1\u0391\u03A4\u0397\u03A3\u0397\u03A3");
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblId.setBounds(10, 61, 84, 14);
        panel.add(lblId);
        
        JLabel lblimg = new JLabel("");
        Image img= new ImageIcon(this.getClass().getResource("/es.png")).getImage();
		lblimg.setIcon(new ImageIcon(img));
        lblimg.setBounds(732, 401, 342, 213);
        contentPane.add(lblimg);
        
        
	}
}
