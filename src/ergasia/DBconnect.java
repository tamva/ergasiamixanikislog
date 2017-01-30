package ergasia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class DBconnect {
	Connection conn = null;
	

	public static  Connection dbConnector() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
			String connectionUser = "root";
			String connectionPass = "1111";
			
			Connection conn = DriverManager.getConnection(connectionUrl,connectionUser,connectionPass);
			
			
			return conn;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
