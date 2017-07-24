package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;
import board.command.*;


public class BoardFrontControllerShell extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontControllerShell() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmdURI = requestURI.substring(contextPath.length());
		
		BoardCmd cmd = null;
		String viewPage = null;
		
		// �� ��� ��ȸ ó��
		if(cmdURI.equals("/boardList.bbs")){}

		// �� �ۼ� ȭ�� ����
		if(cmdURI.equals("/boardWriteForm.bbs")){}
		
		// �� �ۼ� ó��
		if(cmdURI.equals("/boardWrite.bbs")){}
		
		// �� ���� ó��
		if(cmdURI.equals("/boardRead.bbs")){}
		
		// �� ���� ��й�ȣ Ȯ�� ȭ�� ����
		if(cmdURI.equals("/boardUpdatePassword.bbs")){}
		
		// �� ���� ��й�ȣ Ȯ�� ó��
		if(cmdURI.equals("/boardUpdateCheck.bbs")){}
		
		// �� ���� ��й�ȣ ���� ȭ�� ����
		if(cmdURI.equals("/boardUpdateError.bbs")){}
		
		// �� ���� ȭ�� ����
		if(cmdURI.equals("/boardUpdateForm.bbs")){}
		
		// �� ���� ó��
		if(cmdURI.equals("/boardUpdate.bbs")){}
		
		// �� ���� ��й�ȣ Ȯ�� ȭ�� ����
		if(cmdURI.equals("/boardDeletePassword.bbs")){}
		
		// �� ���� ��й�ȣ Ȯ�� ó��
		if(cmdURI.equals("/boardDeleteCheck.bbs")){}
		
		// �� �ۼ� ��й�ȣ ���� ȭ�� ����
		if(cmdURI.equals("/boardDeleteError.bbs")){}
		
		// �� ���� ó��
		if(cmdURI.equals("/boardDelete.bbs")){}
		
		// �� �˻� ó��
		if(cmdURI.equals("/boardSearch.bbs")){}
		
		// ��� �ۼ� ȭ�� ����
		if(cmdURI.equals("/boardReplyForm.bbs")){}
		
		// ��� �ۼ� ó��
		if(cmdURI.equals("/boardReply.bbs")){}
	
		RequestDispatcher dis = request.getRequestDispatcher(viewPage);
		dis.forward(request, response);
	}
}
