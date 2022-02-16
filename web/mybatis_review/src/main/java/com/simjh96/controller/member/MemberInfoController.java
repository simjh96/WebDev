package com.simjh96.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simjh96.model.MemberDao;

/**
 * Servlet implementation class MemberInfoController
 */
@WebServlet("/member/MemberInfo.do")
public class MemberInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
		MemberDao memberDao = new MemberDao();
		request.setAttribute("memberDto", memberDao.getSelectOne(id));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/member/member_info.jsp");
		dispatcher.forward(request, response);
	}

}
