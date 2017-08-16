<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%@ page import="javax.naming.*" %>    
<%@ page import="javax.sql.*" %>   

<%
DataSource ds;
Connection conn = null;

try {

	//Class.forName("oracle.jdbc.driver.OracleDriver");
	Context initContext = (Context)new InitialContext().lookup("java:comp/env/");
	ds = (DataSource)initContext.lookup("jdbc/oracle");
	conn = ds.getConnection();

	//conn = DriverManager.getConnection("jdbc:oracle:thin:jspbook/jspbook@localhost:1521:XE");

	if (conn != null) {

		out.println("오라클 서버 연결 성공!");

	}

} catch (Exception e) {

	e.printStackTrace();
}finally {

    try{

       if(conn!=null)

          conn.close();

    }catch(SQLException se){

       se.printStackTrace();

    }
}
%>    





