package databaseAccessObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connection {
	public static Connection connect() throws Exception
	{
	try
	{
	String connectionURL = "jdbc:mysql://localhost:3306/external_metrics_push?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	Connection connection = null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection = DriverManager.getConnection(connectionURL, "root", "uvmxu624GJK6DXMS@");
	return connection;
	}
	catch (SQLException e)
	{
	throw e;
	}
	catch (Exception e)
	{
	throw e;
	}
	}
}
