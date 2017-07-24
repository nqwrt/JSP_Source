package SimpleTag;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class WithbodyTagHandler extends SimpleTagSupport{

	public void doTag() throws JspException, IOException {
		
		JspContext jspContext = getJspContext();
		JspWriter out = jspContext.getOut();
		JspFragment body = getJspBody();
		
		out.print("<h3>[");
		body.invoke(out);
		out.print("]�� ȯ���մϴ�!</br>");
		
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		out.print("[");
		getJspBody().invoke(null);
		out.print("]�� ���� ��¥�� �ð��� " + date.format(today) + " " + time.format(today) + "�Դϴ�.</h3>");
		
	}
	
}
