import java.sql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Create a Connection */
		try{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pass="toor";
		Connection myConn= DriverManager.getConnection(url,user,pass);
		//thrown Exception SQLException ClassNotFoundException


		/* Create a Statement Which Help to Execute SQL queries */
		Statement mystatement =myConn.createStatement();
		/* Execute Query */
		ResultSet myRes= mystatement.executeQuery("select * from employee");
		/* Process the ResultSet */
		while(myRes.next())
		{
			System.out.println(myRes.getString("fist")+" "+myRes.getString("last"));
			System.out.println();
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
