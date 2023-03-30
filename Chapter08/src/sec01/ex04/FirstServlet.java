package sec01.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/First4")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		// 추가
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		//response.addHeader("Refresh", "1;url=Second3");
		response.sendRedirect("Second4?name=kim");
		
		//out.print("<script type = 'text/javascript'>");
		//out.print("location.href='Second3';");
		//out.print("</scriot>");
	}

}
