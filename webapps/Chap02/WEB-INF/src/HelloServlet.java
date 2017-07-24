import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>								");
		out.println("<head>								");
		out.println("	<title>Hello, Servlet!</title>	");
		out.println("</head>							");
		out.println("<body>								");
		out.println("	<h2>Hello Servlet!</h2><br/>	");
		out.println("</body>							");
		out.println("</html>							");
	}
}