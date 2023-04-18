package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void init() {
		System.out.println("init 메서드 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 전송 시 인코딩 작업 생략 - Filter로 처리.
		// request.setCharacterEncoding("utf-8");
		// response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// getParmeter() 메서드를 이용하여 전송된 회원 정보를 가져온다.
		String user_name = request.getParameter("user_name");
		String user_pwd = request.getParameter("user_pwd");
		
		// hidden 태그로 전송된 값을 가져온다.
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_hp");
		
		// 브라우저로 결과 출력.
		String data = "안녕하세요!<br>" + user_name + "님 환영합니다.<br><br>";
		data += "<html><body>";
		data += "아이디 : " + user_name + "<br>";
		data += "비밀번호 : " + user_pwd + "<br>";
		data += "주소 : " + user_address + "<br>";
		data += "email : " + user_email + "<br>";
		data += "휴대전화 : " + user_hp;
		data += "</body></html>";
		out.print(data);
	}

}
