package SimpleTag;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class NobodyTagHandler extends SimpleTagSupport {
		
	public void doTag() throws JspException, IOException {
		
		getJspContext().getOut().println("<h3>[getJspContext().getOut().println()] ���<br/>");
		getJspContext().getOut().println("body �������� ����ϴ� Ŀ���� �±�1</h3><br/>");
		
		JspContext jspContext = getJspContext();
		jspContext.getOut().println("<h3>[jspContext.getOut().println()] ���<br/>");
		jspContext.getOut().println("body �������� ����ϴ� Ŀ���� �±�2</h3><br/>");
		
		JspWriter out = jspContext.getOut();
		out.println("<h3>[out.println()] ���<br/>");
		out.println("body �������� ����ϴ� Ŀ���� �±�3</h3>");
		
	}
}
