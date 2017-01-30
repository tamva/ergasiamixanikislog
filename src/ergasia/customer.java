package ergasia;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import javax.swing.JFrame;
import org.jdesktop.swingx.JXDatePicker;

import net.proteanit.sql.DbUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

public class customer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void CustomerScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer frame = new customer();
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
	private JTextField textField_4;

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public customer() {
		
		connection=DBconnect.dbConnector();
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setForeground(Color.BLACK);
		setTitle("Customer\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
//-----------------------------BOOKINGS FORM--------------------------------------------				
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 328, 269, 419);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JXDatePicker picker = new JXDatePicker();
		picker.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker.setBounds(161, 176, 89, 22);
        picker.setDate(Calendar.getInstance().getTime());
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        picker.setFormats(dateFormat);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store = sysDate.format(picker.getDate()).toString();
        panel_1.add(picker);
    
        
        JXDatePicker picker2 = new JXDatePicker();
        picker2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		picker2.getEditor().setFont(new Font("Tahoma", Font.PLAIN, 13));
		picker2.getEditor().setHorizontalAlignment(SwingConstants.CENTER);
		picker2.setBounds(161, 209, 89, 26);
        picker2.setDate(Calendar.getInstance().getTime());
       
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        picker2.setFormats(dateFormat1);
        DateFormat sysDate1 = new SimpleDateFormat("yyyy/MM/dd");
        String date_to_store1 = sysDate1.format(picker2.getDate()).toString();
        panel_1.add(picker2);
   
              
        
        textField = new JTextField();
        textField.setBounds(161, 8, 86, 20);
        panel_1.add(textField);
        textField.setColumns(10);
        
        
        textField_1 = new JTextField();
        textField_1.setBounds(161, 39, 86, 20);
        panel_1.add(textField_1);
        textField_1.setColumns(10);
        
        
        textField_2 = new JTextField();
        textField_2.setBounds(161, 70, 86, 20);
        panel_1.add(textField_2);
        textField_2.setColumns(10);
        
        
        textField_3 = new JTextField();
        textField_3.setBounds(161, 101, 86, 20);
        panel_1.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(161, 130, 86, 20);
        panel_1.add(textField_4);
        textField_4.setColumns(10);
        
        String [] roomStrings = { "1", "2", "3","4","5","6","7","8","9","10"};
        JComboBox rooms = new JComboBox(roomStrings);
        rooms.setBounds(161, 249, 46, 20);
        rooms.setSelectedIndex(9);
        panel_1.add(rooms);
        
        
        JLabel lblNewLabel_2 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(10, 42, 60, 14);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("\u0397\u039C\u0395\u03A1\u0391 \u0391\u03A6\u0399\u039E\u0397\u03A3");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(10, 179, 99, 14);
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("\u0397\u039C\u0395\u03A1\u0391 \u0391\u039D\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397\u03A3");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(10, 214, 141, 14);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("\u039F\u039D\u039F\u039C\u0391");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(10, 11, 60, 14);
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("\u03A4\u0397\u039B\u0395\u03A6\u03A9\u039D\u039F");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(10, 73, 72, 14);
        panel_1.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("\u0394\u0399\u0395\u03A5\u0398\u03A5\u039D\u03A3\u0397");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_7.setBounds(10, 104, 86, 14);
        panel_1.add(lblNewLabel_7);
        
        JLabel lblAtoma = new JLabel("ATOMA");
        lblAtoma.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAtoma.setBounds(10, 135, 46, 14);
        panel_1.add(lblAtoma);
       
        
        JButton btnNewButton_1 = new JButton("OK");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try{
				     if(textField.getText().equals("") || textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")){
				    	 String message = "Συμπληρωστε ολα τα πεδια";
						JOptionPane.showMessageDialog(new JFrame(),message,"ΕRROR",JOptionPane.ERROR_MESSAGE);
				     }else
						{
				    	 int counter = 0;
				    	 String query="select * from bookings where sd=? and ld=? and room=? "; //and room=?
				    	 PreparedStatement pst=connection.prepareStatement(query);
				    	 pst.setString(1,sysDate.format(picker.getDate()).toString());
				    	 pst.setString(2,sysDate1.format(picker2.getDate()).toString());
				    	 pst.setString(3,rooms.getSelectedItem().toString());
				         
				        
				         
				         ResultSet rs=pst.executeQuery();
				    	 
				    	 while (rs.next()){
								counter=counter+1;
							}
				    	 if (counter==1){
				    		 String message = "Το δωματιο δεν ειναι διαθεσιμο αυτες τις μερες";
								JOptionPane.showMessageDialog(new JFrame(),message,"ΕRROR",JOptionPane.ERROR_MESSAGE);
								
							}
				    	 else{
						 
				    	
				    	 
				    	 String query2="insert into bookings (name,lastname,address,phone,sd,ld,room,people) values(?,?,?,?,?,?,?,?)";
				    	 PreparedStatement pst1= connection.prepareStatement(query2);
						pst1.setString(1, textField.getText());
						pst1.setString(2, textField_1.getText());
						pst1.setString(3, textField_3.getText());
						pst1.setString(4, textField_2.getText());
						pst1.setString(8, textField_4.getText());
						pst1.setString(5,sysDate.format(picker.getDate()).toString()); 
						pst1.setString(6,sysDate1.format(picker2.getDate()).toString());
						pst1.setString(7,rooms.getSelectedItem().toString());
						pst1.executeUpdate();
						String message1 = "Η κρατιση σας εγινε δεκτη!";
						JOptionPane.showMessageDialog(null, "Η κρατιση σας εγινε δεκτη!");
				   	 }
				    	    rs.close();
							pst.close();
							
						}
				     
        		}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
					
        		}
  }
        });
        
        
//----------------------------IMAGES-------------------------       
        
      
        
        JLabel label_1 = new JLabel("\u0394\u03A9\u039C\u0391\u03A4\u0399\u039F");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_1.setBounds(10, 250, 72, 14);
        panel_1.add(label_1);
        
        JLabel lblNewLabel = new JLabel("\u03A0\u039B\u0397\u03A1\u03A9\u039C\u0397 ");
        
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(8, 322, 74, 14);
        panel_1.add(lblNewLabel);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("e-BANKING");
        rdbtnNewRadioButton.setBounds(160, 317, 99, 23);
        panel_1.add(rdbtnNewRadioButton);
       
        btnNewButton_1.setBounds(161, 374, 92, 34);
        panel_1.add(btnNewButton_1);
 //-----------------------------BOOKINGS FORM--------------------------------------------	        
        
//----------------------------IMAGES-------------------------        
        JLabel lblimagelogo = new JLabel("");
        Image img= new ImageIcon(this.getClass().getResource("/es.png")).getImage(); 
        lblimagelogo.setIcon(new ImageIcon (img));
        lblimagelogo.setBounds(799, 818, 320, 208);
        contentPane.add(lblimagelogo);
       
        JLabel lblimage = new JLabel("");
        Image img1= new ImageIcon(this.getClass().getResource("/a.jpg")).getImage(); 
        lblimage.setIcon(new ImageIcon (img1));
    	lblimage.setBounds(0, 793, 408, 233);
    	contentPane.add(lblimage);
     
        JLabel lblimage1 = new JLabel("");
        Image img2= new ImageIcon(this.getClass().getResource("/b.jpg")).getImage();
        lblimage1.setIcon(new ImageIcon (img2));
        lblimage1.setBounds(410, 793, 397, 233);
        contentPane.add(lblimage1);
        
        JLabel lblimage2 = new JLabel("");
        Image img3= new ImageIcon(this.getClass().getResource("/c.jpg")).getImage();
        lblimage2.setIcon(new ImageIcon (img3));
        lblimage2.setBounds(1120, 793, 390, 233);
        contentPane.add(lblimage2);
        
        JLabel lblimage3 = new JLabel("");
        Image img4= new ImageIcon(this.getClass().getResource("/d.jpg")).getImage();
        lblimage3.setIcon(new ImageIcon (img4));
        lblimage3.setBounds(1512, 793, 408, 233);
        contentPane.add(lblimage3);
        
        JLabel lblr1 = new JLabel("");
        Image img5= new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
        lblr1.setIcon(new ImageIcon (img5));
        lblr1.setBounds(1042, 29, 346, 193);
        contentPane.add(lblr1);
        
        JLabel lblr2 = new JLabel("");
        Image img6= new ImageIcon(this.getClass().getResource("/1.jpg")).getImage();
        lblr2.setIcon(new ImageIcon (img6));
        lblr2.setBounds(1042, 252, 346, 193);
        contentPane.add(lblr2);
        
        JLabel lblr3 = new JLabel("");
        Image img7= new ImageIcon(this.getClass().getResource("/3.jpg")).getImage();
        lblr3.setIcon(new ImageIcon (img7));
        lblr3.setBounds(1042, 480, 346, 193);
        contentPane.add(lblr3);
        
       
        
        
        
      
        
      
        
        JLabel label = new JLabel("\u039A\u0391\u039D\u03A4\u0395 \u03A4\u0397\u039D \u039A\u03A1\u0391\u03A4\u0397\u03A3\u0397 \u03A3\u0391\u03A3!");
        label.setForeground(new Color(0, 0, 0));
        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label.setBounds(31, 303, 231, 14);
        contentPane.add(label);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(345, 328, 458, 188);
        contentPane.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
        try {
        	String query4="SELECT * FROM rooms ";
        	PreparedStatement pst2= connection.prepareStatement(query4);
        	System.out.println(query4);
        	ResultSet rs2=pst2.executeQuery();
        	table.setModel(DbUtils.resultSetToTableModel(rs2));
        	
        	JTextArea txtrWestEast = new JTextArea();
        	txtrWestEast.setEditable(false);
        	txtrWestEast.setForeground(new Color(0, 0, 0));
        	txtrWestEast.setWrapStyleWord(true);
        	txtrWestEast.setBackground(new Color(47, 79, 79));
        	txtrWestEast.setLineWrap(true);
        	txtrWestEast.setFont(new Font("Tahoma", Font.PLAIN, 16));
        	txtrWestEast.setText("\u03A4\u03BF MGM GRAND Hotel \u03B2\u03C1\u03AF\u03C3\u03BA\u03B5\u03C4\u03B1\u03B9 \u03C3\u03C4\u03BF \u03B9\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC \u03BA\u03AD\u03BD\u03C4\u03C1\u03BF \u03C4\u03B7\u03C2 \u0391\u03B8\u03AE\u03BD\u03B1\u03C2 \u03BA\u03B1\u03B9 \u03C0\u03C1\u03BF\u03C3\u03C6\u03AD\u03C1\u03B5\u03B9 \u03BA\u03B1\u03C4\u03B1\u03BB\u03CD\u03BC\u03B1\u03C4\u03B1 \u03BC\u03B5 \u03BC\u03B9\u03BD\u03B9\u03BC\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03AE \u03B4\u03B9\u03B1\u03BA\u03CC\u03C3\u03BC\u03B7\u03C3\u03B7 \u03BA\u03B1\u03B9 \u03B5\u03BA\u03C0\u03BB\u03B7\u03BA\u03C4\u03B9\u03BA\u03AE \u03B8\u03AD\u03B1 \u03C4\u03B7\u03BD \u0391\u03BA\u03C1\u03CC\u03C0\u03BF\u03BB\u03B7 \u03BA\u03B1\u03B9 \u03C4\u03BF\u03BD \u03A0\u03B1\u03C1\u03B8\u03B5\u03BD\u03CE\u03BD\u03B1. \u0394\u03B9\u03B1\u03B8\u03AD\u03C4\u03B5\u03B9 a la carte \u03B5\u03C3\u03C4\u03B9\u03B1\u03C4\u03CC\u03C1\u03B9\u03BF, \u03BC\u03C0\u03B1\u03C1 \u03BA\u03B1\u03B9 \u03B5\u03BE\u03C9\u03C4\u03B5\u03C1\u03B9\u03BA\u03AE \u03C0\u03B9\u03C3\u03AF\u03BD\u03B1.\r\n\r\n\u039F\u03B9 \u03C3\u03BF\u03C5\u03AF\u03C4\u03B5\u03C2 \u03C4\u03BF\u03C5 MGM GRAND Hotel \u03B5\u03AF\u03BD\u03B1\u03B9 \u03B4\u03B9\u03B1\u03BA\u03BF\u03C3\u03BC\u03B7\u03BC\u03AD\u03BD\u03B5\u03C2 \u03C3\u03CD\u03BC\u03C6\u03C9\u03BD\u03B1 \u03BC\u03B5 \u03C4\u03BF \u03B1\u03B8\u03B7\u03BD\u03B1\u03B9\u03BA\u03CC \u03C3\u03C4\u03C5\u03BB \u03BA\u03B1\u03B9 \u03AD\u03C7\u03BF\u03C5\u03BD \u03B5\u03C0\u03B9\u03C0\u03BB\u03C9\u03BC\u03AD\u03BD\u03B7 \u03B2\u03B5\u03C1\u03AC\u03BD\u03C4\u03B1. \u038C\u03BB\u03B5\u03C2 \u03C0\u03B5\u03C1\u03B9\u03BB\u03B1\u03BC\u03B2\u03AC\u03BD\u03BF\u03C5\u03BD \u03B9\u03B4\u03B9\u03C9\u03C4\u03B9\u03BA\u03AE \u03C0\u03B9\u03C3\u03AF\u03BD\u03B1, \u03C5\u03B4\u03C1\u03BF\u03BC\u03B1\u03C3\u03AC\u03B6 \u03AE \u03BC\u03C0\u03B1\u03BD\u03B9\u03AD\u03C1\u03B1 \u03BC\u03B5 \u03C0\u03AF\u03B4\u03B1\u03BA\u03B5\u03C2 \u03C5\u03B4\u03C1\u03BF\u03BC\u03B1\u03C3\u03AC\u03B6, \u03BA\u03B1\u03B8\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC, \u03B4\u03BF\u03C1\u03C5\u03C6\u03BF\u03C1\u03B9\u03BA\u03AE \u03C4\u03B7\u03BB\u03B5\u03CC\u03C1\u03B1\u03C3\u03B7 \u03B5\u03C0\u03AF\u03C0\u03B5\u03B4\u03B7\u03C2 \u03BF\u03B8\u03CC\u03BD\u03B7\u03C2 \u03BA\u03B1\u03B9 \u03BC\u03AF\u03BD\u03B9 \u03BC\u03C0\u03B1\u03C1. \u039A\u03AC\u03B8\u03B5 \u03BC\u03C0\u03AC\u03BD\u03B9\u03BF \u03B5\u03AF\u03BD\u03B1\u03B9 \u03B5\u03BE\u03BF\u03C0\u03BB\u03B9\u03C3\u03BC\u03AD\u03BD\u03BF \u03BC\u03B5 \u03BC\u03C0\u03BF\u03C5\u03C1\u03BD\u03BF\u03CD\u03B6\u03B9\u03B1, \u03C0\u03B1\u03BD\u03C4\u03CC\u03C6\u03BB\u03B5\u03C2 \u03BA\u03B1\u03B9 \u03B4\u03C9\u03C1\u03B5\u03AC\u03BD \u03C0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03B1 \u03C0\u03B5\u03C1\u03B9\u03C0\u03BF\u03AF\u03B7\u03C3\u03B7\u03C2.\r\n\r\n\u0397 \u03C0\u03BF\u03BB\u03C5\u03C3\u03CD\u03C7\u03BD\u03B1\u03C3\u03C4\u03B7 \u03C0\u03CC\u03BB\u03B7 \u03C4\u03B7\u03C2 \u0391\u03B8\u03AE\u03BD\u03B1\u03C2 \u03C3\u03B1\u03C2 \u03C0\u03B5\u03C1\u03B9\u03BC\u03AD\u03BD\u03B5\u03B9 \u03BD\u03B1 \u03C4\u03B7\u03BD \u03B5\u03BE\u03B5\u03C1\u03B5\u03C5\u03BD\u03AE\u03C3\u03B5\u03C4\u03B5. \u0395\u03BA\u03B5\u03AF, \u03B8\u03B1 \u03B2\u03C1\u03B5\u03AF\u03C4\u03B5 \u03C0\u03BF\u03BB\u03BB\u03B1 \u03BC\u03BF\u03C5\u03C3\u03B5\u03AF\u03B1,\u03B5\u03C3\u03C4\u03B9\u03B1\u03C4\u03CC\u03C1\u03B9\u03B1, \u03BC\u03C0\u03B1\u03C1, \u03BA\u03B1\u03C4\u03B1\u03C3\u03C4\u03AE\u03BC\u03B1\u03C4\u03B1 \u03BA\u03B1\u03B9 \u03BD\u03C5\u03C7\u03C4\u03B5\u03C1\u03B9\u03BD\u03AC \u03BA\u03AD\u03BD\u03C4\u03C1\u03B1. \u03A0\u03B1\u03C1\u03AD\u03C7\u03BF\u03BD\u03C4\u03B1\u03B9 \u03B4\u03C9\u03C1\u03B5\u03AC\u03BD Wi-Fi \u03C3\u03B5 \u03CC\u03BB\u03BF\u03C5\u03C2 \u03C4\u03BF\u03C5\u03C2 \u03C7\u03CE\u03C1\u03BF\u03C5\u03C2 \u03BA\u03B1\u03B9 \u03B4\u03C9\u03C1\u03B5\u03AC\u03BD \u03B9\u03B4\u03B9\u03C9\u03C4\u03B9\u03BA\u03CC\u03C2 \u03C7\u03CE\u03C1\u03BF\u03C2 \u03C3\u03C4\u03AC\u03B8\u03BC\u03B5\u03C5\u03C3\u03B7\u03C2 \u03C3\u03C4\u03B9\u03C2 \u03B5\u03B3\u03BA\u03B1\u03C4\u03B1\u03C3\u03C4\u03AC\u03C3\u03B5\u03B9\u03C2. ");
        	txtrWestEast.setBounds(10, 11, 792, 244);
        	contentPane.add(txtrWestEast);
        	
        	JLabel lblNewLabel_1 = new JLabel("CLASSIC ROOMS (1-5)");
        	lblNewLabel_1.setForeground(new Color(0, 0, 0));
        	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        	lblNewLabel_1.setBounds(1411, 11, 237, 22);
        	contentPane.add(lblNewLabel_1);
        	
        	JLabel lblNewLabel_8 = new JLabel("EXECUTIVE ROOMS (6-8)");
        	lblNewLabel_8.setForeground(new Color(0, 0, 0));
        	lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
        	lblNewLabel_8.setBounds(1411, 245, 237, 22);
        	contentPane.add(lblNewLabel_8);
        	
        	JLabel lblNewLabel_9 = new JLabel("SUITES (9 & 10)");
        	lblNewLabel_9.setForeground(new Color(0, 0, 0));
        	lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
        	lblNewLabel_9.setBounds(1411, 462, 149, 22);
        	contentPane.add(lblNewLabel_9);
        	
        	JTextArea textArea = new JTextArea();
        	textArea.setForeground(new Color(0, 0, 0));
        	textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        	textArea.setBackground(new Color(47, 79, 79));
        	textArea.setText("\u03A4\u03B1 \u03C0\u03B9\u03BF \u03B5\u03C5\u03C1\u03CD\u03C7\u03C9\u03C1\u03B1 \u03B4\u03C9\u03BC\u03AC\u03C4\u03B9\u03B1 \u03C3\u03C4\u03B7\u03BD \u03C0\u03CC\u03BB\u03B7 \u03C0\u03C1\u03BF\u03C3\u03C6\u03AD\u03C1\u03BF\u03C5\u03BD \u03AD\u03BD\u03B1 \u03B8\u03B5\u03C1\u03BC\u03CC \u03BA\u03B1\u03BB\u03C9\u03C3\u03CC\u03C1\u03B9\u03C3\u03BC\u03B1 \u03C3\u03C4\u03B7\u03BD \u0391\u03B8\u03B7\u03BD\u03AC.\n\u039C\u03C0\u03AC\u03BD\u03B9\u03B1 \u03B1\u03C0\u03CC \u03BC\u03AC\u03C1\u03BC\u03B1\u03C1\u03BF,\u03BC\u03B5\u03B3\u03AC\u03BB\u03BF\u03C2 \u03C7\u03CE\u03C1\u03BF\u03C2 \u03BA\u03B1\u03B8\u03B9\u03C3\u03C4\u03B9\u03BA\u03BF\u03CD,\u03AD\u03C0\u03B9\u03C0\u03BB\u03B1 \u03B1\u03C0\u03CC \u03BE\u03CD\u03BB\u03BF,\u03AC\u03BB\u03BB\u03B1 \u03BA\u03B1\u03B9 \u03B7 \u03B5\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03AE \u03BC\u03BF\u03BD\u03C4\u03AD\u03C1\u03BD\u03B1 \u03B4\u03B9\u03B1\u03BA\u03CC\u03C3\u03BC\u03B7\u03C3\u03B7 \u03BC\u03B5\u03C4\u03B1\u03C4\u03C1\u03AD\u03C0\u03BF\u03C5\u03BD \u03B1\u03C5\u03C4\u03AC \u03C4\u03B1 \u03B4\u03C9\u03BC\u03AC\u03C4\u03B9\u03B1 \u03C3\u03B5 \u03AD\u03BD\u03B1 \u03BA\u03BF\u03BC\u03C8\u03CC \u03C7\u03CE\u03C1\u03BF \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u03B4\u03B9\u03B1\u03BC\u03BF\u03BD\u03AE \u03C3\u03B1\u03C2.");
        	textArea.setLineWrap(true);
        	textArea.setWrapStyleWord(true);
        	textArea.setBounds(1400, 41, 320, 193);
        	contentPane.add(textArea);
        	
        	JTextArea textArea_1 = new JTextArea();
        	textArea_1.setForeground(new Color(0, 0, 0));
        	textArea_1.setWrapStyleWord(true);
        	textArea_1.setText("\u03A3\u03C7\u03B5\u03B4\u03B9\u03B1\u03C3\u03BC\u03AD\u03BD\u03B1 \u03B3\u03B9\u03B1 \u03C4\u03BF\u03C5\u03C2 \u03C0\u03B9\u03BF \u03B1\u03C0\u03B1\u03B9\u03C4\u03B7\u03C4\u03B9\u03BA\u03BF\u03CD\u03C2 \u03C0\u03B5\u03BB\u03AC\u03C4\u03B5\u03C2 \u03C0\u03BF\u03C5 \u03B1\u03BD\u03B1\u03B6\u03B7\u03C4\u03BF\u03CD\u03BD \u03C0\u03AD\u03C1\u03B1 \u03B1\u03C0\u03CC \u03C4\u03B7\u03BD \u03AC\u03BD\u03B5\u03C4\u03B7 \u03B4\u03B9\u03B1\u03BC\u03BF\u03BD\u03AE,\u03C4\u03B7\u03BD  \u03C8\u03C5\u03C7\u03B9\u03BA\u03AE \u03B7\u03C1\u03B5\u03BC\u03AF\u03B1.\n\u03A0\u03C1\u03BF\u03C3\u03C6\u03AD\u03C1\u03BF\u03C5\u03BD \u03AD\u03BD\u03B1 \u03BC\u03B5\u03B3\u03AC\u03BB\u03BF,\u03B5\u03C5\u03C1\u03CD\u03C7\u03C9\u03C1\u03BF Lounge Club \u03BC\u03B5 \u03B8\u03B5\u03AC \u03C4\u03B7\u03BD \u0391\u03BA\u03C1\u03CC\u03C0\u03BF\u03BB\u03B7 \u03BA\u03B1\u03B9 \u03C4\u03BF\u03BD \u03A0\u03B1\u03C1\u03B8\u03B5\u03BD\u03CE\u03BD\u03B1,\u03AC\u03BB\u03BB\u03B1 \u03BA\u03B1\u03B9 \u03B5\u03C5\u03C1\u03CD\u03C7\u03C9\u03C1\u03BF \u03BC\u03C0\u03AC\u03BD\u03B9\u03BF \u03BC\u03B5 \u03C4\u03B6\u03B1\u03BA\u03BF\u03CD\u03B6\u03B9 \u03B3\u03B9\u03B1 \u03BE\u03B5\u03BA\u03BF\u03CD\u03C1\u03B1\u03C3\u03B7 \u03BA\u03B1\u03B9 \u03C7\u03B1\u03BB\u03AC\u03C1\u03C9\u03C3\u03B7");
        	textArea_1.setLineWrap(true);
        	textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        	textArea_1.setBackground(new Color(47, 79, 79));
        	textArea_1.setBounds(1398, 278, 320, 193);
        	contentPane.add(textArea_1);
        	
        	JTextArea textArea_2 = new JTextArea();
        	textArea_2.setForeground(new Color(0, 0, 0));
        	textArea_2.setWrapStyleWord(true);
        	textArea_2.setText("\u0394\u03AF\u03BD\u03BF\u03BD\u03C4\u03B1\u03C2 \u03C0\u03C1\u03BF\u03C3\u03BF\u03C7\u03AE \u03BA\u03B1\u03B9 \u03C3\u03C4\u03B7\u03BD \u03C0\u03B1\u03C1\u03B1\u03BC\u03B9\u03BA\u03C1\u03AE \u03BB\u03B5\u03C0\u03C4\u03BF\u03BC\u03AD\u03C1\u03B5\u03B9\u03B1,\u03B1\u03C5\u03B8\u03B5\u03BD\u03C4\u03B9\u03BA\u03AE \u03B5\u03BB\u03BB\u03B7\u03BD\u03B9\u03BA\u03AE \u03B4\u03B9\u03B1\u03BA\u03CC\u03C3\u03BC\u03B7\u03C3\u03B7 \u03AC\u03BB\u03BB\u03B1 \u03BA\u03B1\u03B9 \u03BF \u03C0\u03BF\u03BB\u03C5\u03C4\u03B5\u03BB\u03AD\u03C3\u03C4\u03B1\u03C4\u03BF\u03C2 \u03C3\u03C7\u03B5\u03B4\u03B9\u03B1\u03C3\u03BC\u03CC\u03C2,\u03BA\u03B1\u03B8\u03B9\u03C3\u03C4\u03BF\u03CD\u03BD \u03C4\u03B9\u03C2 \u03C3\u03BF\u03C5\u03AF\u03C4\u03B5\u03C2 \u03BC\u03B1\u03C2 \u03B1\u03C0\u03CC \u03C4\u03B9\u03C2 \u03BA\u03B1\u03BB\u03CD\u03C4\u03B5\u03C1\u03B5\u03C2 \u03C4\u03B7\u03C2 \u0391\u03B8\u03B7\u03BD\u03AC\u03C2. \u039C\u03B5 \u03C7\u03CE\u03C1\u03BF \u03B3\u03B9\u03B1 \u03BC\u03B9\u03BA\u03C1\u03AD\u03C2 \u03B4\u03B5\u03BE\u03B9\u03CE\u03C3\u03B5\u03B9\u03C2 \u03AC\u03BB\u03BB\u03B1 \u03BA\u03B1\u03B9 \u03C7\u03CE\u03C1\u03BF \u03B3\u03B9\u03B1 \u03B3\u03C1\u03B1\u03C6\u03B5\u03AF\u03BF,\u03BF\u03B9 \u03C3\u03BF\u03C5\u03AF\u03C4\u03B5\u03C2 \u03BC\u03B1\u03C2 \u03C3\u03B1\u03C2 \u03C0\u03C1\u03BF\u03C3\u03C6\u03AD\u03C1\u03BF\u03C5\u03BD \u03BC\u03B9\u03B1 \u03CC\u03B1\u03C3\u03B7 \u03BE\u03B5\u03BA\u03BF\u03CD\u03C1\u03B1\u03C3\u03B7\u03C2 \u03BA\u03B1\u03B9 \u03C7\u03B1\u03BB\u03AC\u03C1\u03C9\u03C3\u03B7\u03C2 ");
        	textArea_2.setLineWrap(true);
        	textArea_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        	textArea_2.setBackground(new Color(47, 79, 79));
        	textArea_2.setBounds(1398, 495, 320, 193);
        	contentPane.add(textArea_2);
        	
        	

			pst2.close();
			rs2.close();
 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        
        
        
     //setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel_1, picker, picker.getEditor(), picker2, picker2.getEditor(), textField, textField_1, textField_2, textField_3, rooms, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, btnNewButton_1, label}));
	}
}
