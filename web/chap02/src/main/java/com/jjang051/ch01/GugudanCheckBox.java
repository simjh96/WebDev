package com.jjang051.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GugudanCheckBox")
public class GugudanCheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GugudanCheckBox() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String select[] = request.getParameterValues("gugudan");
		int danCount = 0;
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<thead>");
		out.println("<tr>");
		for (int j = 0; j < select.length; j++) {
			int dan = Integer.parseInt(select[j]);
			out.println("<td>" + dan + "단</td>");
		}
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		for (int i = 1; i < 10; i++) {
			out.println("<tr>");
			for (int j = 0; j < select.length; j++) {
				int dan = Integer.parseInt(select[j]);
				out.println("<td>" + dan + " X " + i + " = " + dan * i + "</td>");
			}
			out.println("</tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("<a href='javascript:history.back();'>돌아가기</a>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
