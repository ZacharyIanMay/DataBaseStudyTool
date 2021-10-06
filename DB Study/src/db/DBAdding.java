package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAdding {

	private static String Url = "jdbc:mysql://studytooldb.cocfzrdakcvx.us-west-1.rds.amazonaws.com:3306/Japanese?useSSL=false";

	// For testing connection to the database
	public static void main(String[] args)
	{
		try /*(Connection con = DriverManager.getConnection(Url); Statement s = con.createStatement();)*/
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(Url, "admin", "JavaTest");
			if(con != null)
			{
				System.out.println("Connection good");
			}
			/** Generic Query Structure
			String query = "";
			ResultSet r = s.executeQuery(query);
			
			// Print results from select statement
			while(r.next())
			{
				System.out.println(r.getString(1));
			}
			*/
			con.close();
		} catch (SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static boolean addWord(String word)
	{
		// TODO: Create format for words to be added
		// TODO: Add parsing to determine the word type
		// TODO: Split word adding into different sub methods for each type of word
		// TODO: Add try connection to the server
		return false;
	}
}
