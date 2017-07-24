

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConditionServlet
 */
@WebServlet("/ConditionServlet")
public class ConditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		String method = request.getParameter("method");
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Condition Servlet</title>");
		out.println("	</head>");
		out.println("	<body>");
		if ( method == null ){
			out.println("	<h2> ���� �׸��� �����ϴ�. </h2><hr/>");
		} else if ( method.equals("get") ){
			out.println("	<h2> get ��� </h2><hr/>");
			out.println("		get ����� �� ������ �������� �������� ������ �� �ּ� URL�� �����Ͽ� ȣ���ϴ� ����Դϴ�.");
		} else if ( method.equals("post") ){
			out.println("	<h2> post ��� </h2><hr/>");
			out.println("		post ����� �� ������ �������� �������� ������ HTTP ��û �޽����� ÷���ϴ� ���·� �����ϴ� ����Դϴ�.");
		}	
		out.println("	</body>");
		out.println("</html>");
	}

}
