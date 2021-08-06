package Controller;
import Model.PhongBan;
import java.sql.*;
import java.util.ArrayList;

public class JDBC {
	Connection conn1 = null;
	Statement stm = null;
	ResultSet rs = null;
	
	public Connection connection() {
	     try {
	            String url1 = "jdbc:mysql://localhost:3306/bkacad";
	            String user = "root";
	            String password = "";

	            conn1 = DriverManager.getConnection(url1, user, password);
	            if (conn1 != null) {
	                System.out.println("Connected");
	            }

	        } catch (SQLException ex) {
	            System.out.println("An error occurred. Maybe user/password is invalid");
	            ex.printStackTrace();
	        }
	     return conn1;
	}
	public void close() {
		if(conn1 != null) {
			try {
				conn1.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
	}


public ArrayList<PhongBan> getAllPb() throws SQLException {
    ArrayList<PhongBan> pb = new ArrayList<PhongBan>();
    Connection conn = connection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM `phongban`");
    while (rs.next()) {
        int a= rs.getInt(1);
        String b= rs.getString(2);
        PhongBan arr = new PhongBan(a,b);
        pb.add(arr);
    }
    close();
return pb;
}
}
