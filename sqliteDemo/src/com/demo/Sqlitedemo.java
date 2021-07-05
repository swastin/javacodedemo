package com.demo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sqlitedemo 
{
	public final static String BASE_URL=Paths.get("").toAbsolutePath().toString();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			Class.forName("org.sqlite.JDBC");
		    Connection  c = DriverManager.getConnection("jdbc:sqlite:"+BASE_URL+"\\src\\sqlite\\company.db");
		    System.out.print(c);
		    PreparedStatement pstmt =c.prepareStatement("select * from company") ;
		    ResultSet rs = pstmt.executeQuery();
		    while(rs.next()) {
		    	int id = rs.getInt("id");
		         String  name = rs.getString("name");
		         int age  = rs.getInt("age");
		         String  address = rs.getString("address");
		         float salary = rs.getFloat("salary");
		         
		         System.out.println( "ID = " + id );
		         System.out.println( "NAME = " + name );
		         System.out.println( "AGE = " + age );
		         System.out.println( "ADDRESS = " + address );
		         System.out.println( "SALARY = " + salary );
		         System.out.println();	
		    	
		    }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
	}

}
