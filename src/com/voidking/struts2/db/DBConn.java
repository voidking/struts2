package com.voidking.struts2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.voidking.struts2.model.Xsb;

public class DBConn {
	Connection conn;
	PreparedStatement pstmt;
	public DBConn(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/xscj","scott","tiger");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	// 添加学生
	public boolean save(Xsb xs){
		try{
			pstmt=conn.prepareStatement("insert into XSB(xh,xm,xb,cssj,zy_id,bz) values(?,?,?,?,?,?)");
			pstmt.setString(1, xs.getXh());
			pstmt.setString(2, xs.getXm());
			pstmt.setBoolean(3, xs.isXb());
			pstmt.setDate(4, xs.getCssj());
			pstmt.setInt(5, xs.getZy_id());
			pstmt.setString(6, xs.getBz());
			pstmt.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
