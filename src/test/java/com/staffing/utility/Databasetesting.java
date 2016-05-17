package com.staffing.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Databasetesting 
{
	@Test
	public void dbconn() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
	String db=databaseconn("select * from employee_contacts where employee_contact_id = 7" , "ename");
	System.out.println(db);
	}	
	
	
	
	public String databaseconn(String query , String columnlabel) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
		Connection conn=null;
		String result=null;
		String finalresult = null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="staffingxpert1";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="";
	//	String query="select * from employee_contacts order by employee_contact_id desc limit 1";
	//	String columnlabel="employee_contact_id";
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		PreparedStatement psmt=conn.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for (int i = 1; i <= rs.findColumn(columnlabel); i++)
			{
				result=rs.getString(i);
				finalresult=finalresult+"  "+result;
			}
		}
		return finalresult;
	}
}