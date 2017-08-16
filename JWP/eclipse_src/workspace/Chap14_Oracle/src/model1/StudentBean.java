package model1;
import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.*;
import javax.sql.DataSource;

public class StudentBean {
	
	private String studentId;
	private String studentName;
	private String studentEmail;
	private String studentTel;
	private String departmentId;
	
	public String getStudentId() { return studentId; }
	public void setStudentId(String studentId) { this.studentId = studentId; }

	public String getStudentName() { return studentName; }
	public void setStudentName(String studentName) { this.studentName = studentName; }
	
	public String getStudentEmail() { return studentEmail; }
	public void setStudentEmail(String studentEmail) { this.studentEmail = studentEmail; }
	
	public String getStudentTel() { return studentTel; }
	public void setStudentTel(String studentTel) { this.studentTel = studentTel; }
	
	public String getDepartmentId() { return departmentId; }
	public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
	
	public void selectStudent(String studentId) throws ServletException{
		
		
		DataSource ds;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbook", "jspbook", "jspbook");
			
			Context initContext = (Context)new InitialContext().lookup("java:comp/env/");
			ds = (DataSource)initContext.lookup("jdbc/oracle");
			conn = ds.getConnection();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM STUDENT WHERE STUDENT_ID = " + studentId );
			
			if (rs.next()){
				this.studentId = rs.getString("STUDENT_ID");
				this.studentName = rs.getString("STUDENT_NAME");
				this.studentEmail = rs.getString("STUDENT_EMAIL");
				this.studentTel = rs.getString("STUDENT_TEL");
				this.departmentId = rs.getString("DEPARTMENT_ID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e){
			throw new ServletException(e);
		} finally {
			try{
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e){}
		}		
	}
}
