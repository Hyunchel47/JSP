package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetServletContext
 */
@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// getServletContext 객체 가져오기
		ServletContext context = getServletContext();
		
		List member = new ArrayList();
		member.add("조현철");
		member.add(23);
		
		// ServletContext 객체에 데이터를 바인딩
		context.setAttribute("member", member);
		
		out.print("<html><body>");
		out.print("조현철 23");
		out.print("</body></html>");
	}

}
