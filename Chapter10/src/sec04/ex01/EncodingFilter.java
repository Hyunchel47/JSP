package sec04.ex01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
	ServletContext context;
	
    public EncodingFilter() {
        super();
    }

	public void destroy() {
		System.out.println("destroy 호출");
	}

	// doFilter 메서드는 FilterChain 타입인 chain을 세번째 매개변수로 가짐.
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter 호출");
		// 한글 인코딩 설정.
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		// 다음 필터로 넘겨주는 작업.
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 인코딩.............");
		// context = fConfig.getServletContext();
	}

}
