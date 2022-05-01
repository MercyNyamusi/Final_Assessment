
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection Conn =null;
			Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registartionsystem_javasummative", "root", "");
			System.out.println("Successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Problem: "+e.getMessage());
		}
	}

}
