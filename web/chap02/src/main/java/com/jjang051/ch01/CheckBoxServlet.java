package com.jjang051.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckBoxServlet")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CheckBoxServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String items[] = request.getParameterValues("item");
		out.println("<html>");
		out.println("<body>");
		if(items==null) {
			out.println("<p>선택한게 하나도 없어요.</p>");
		} else {
			out.println("<p>당신이 선택한 항목입니다.</p>");
			out.println("<ul>");
			for(int i=0;i<items.length;i++) {
				out.println("<li>"+items[i]+"</li>");
			}
			out.println("</ul>");
		}
		out.println("<a href='javascript:history.back();'>돌아가기</a>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
