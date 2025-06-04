package day13_SQL_JDBCconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class JDBC_Connector_Class {

	public static void main(String[] args) throws SQLException 
	{
		//Providing Connection details:
		String db_url = "jdbc:mysql://localhost:3306";
		String Username = "root";
		String Password = "root";
		
		//Establish the connection (Connect using Java):
		Connection connection = DriverManager.getConnection(db_url, Username, Password);
		
		//Perform Operations:
		
		//Step 1: Create Statement:
		String Create_DB = "create database Employee_JDB";
		String Use_DB = "use Employee_JDB";
		String CreateTable = "create table EmpTable_JDB(empcode int, empname varchar(10), empage int, esalary int)";
		String insert = "insert into EmpTable_JDB(empcode, empname, empage, esalary) values (101, 'Jenny', 25, 10000), (102, 'Jacky', 30, 20000), (103, 'Joe', 20, 40000), (104, 'John', 40, 80000), (105, 'Shameer', 25, 90000)";
		String select = "select * from EmpTable_JDB";
		
		//Step 2: Execute the Statement:
		Statement smt = connection.createStatement(); 
		smt.execute(Create_DB);
		smt.execute(Use_DB);
		smt.execute(CreateTable);
		smt.executeUpdate(insert);
		ResultSet result = smt.executeQuery(select);
		
		while(result.next())
		{
			System.out.println(result.getInt("empcode")+"||"+result.getString("empname")+"||"+ result.getInt("empage")+"||"+ result.getInt("esalary"));
		}
		
		// Step 4: Close the connection
		connection.close();
		
	}

}
