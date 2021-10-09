package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Worlddetails
 */
@WebServlet("/Worlddetails")

public class Worlddetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/world_details")
	
	private DataSource datasource;
Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			con=datasource.getConnection();
			String sql="select * from country;";
			pstmt=con.prepareStatement(sql);
		rs=	pstmt.executeQuery();
		
		while(rs.next()){
			
			System.out.println(rs.getString("name"));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
