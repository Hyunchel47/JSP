package sec01.ex06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 주소창에서 Second로 안넘어가고 First5로 바로 직통된다 / 이전에 1~4는 Second로 넘어감

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/First6")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		// 추가
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		RequestDispatcher dispatch = request.getRequestDispatcher("Second6?name=kim");
		dispatch.forward(request, response);
	}

}
