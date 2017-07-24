package SimpleTag;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class AttributeTagHandler extends SimpleTagSupport{
	
	private String msg="";
	
	public void setMsg (String msg){
		this.msg = msg;
	}

	public void doTag() throws JspException, IOException {
		
		JspContext jspContext = getJspContext();
		JspWriter out = jspContext.getOut();
		JspFragment body = getJspBody();
		
		if ( msg.equals("welcome") ){		
			out.print("<h3>[");
			body.invoke(out);
			out.print("]�� ȯ���մϴ�!</h3>");
		} else if ( msg.equals("time") ){
			Date today = new Date();
			SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
			SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
			out.print("<h3>[");
			getJspBody().invoke(null);
			out.print("]�� ���� ��¥�� �ð��� " + date.format(today) + " " + time.format(today) + "�Դϴ�.</h3>");
		} else {
			out.print("<h3>[");
			body.invoke(out);
			out.print("]�� msg �Ӽ��� �������� �ʾҽ��ϴ�.</h3>");
		}
	}
	
}
