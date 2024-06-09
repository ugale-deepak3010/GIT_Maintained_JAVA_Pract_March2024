package myPackage;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


//		Filter always execute first before loading request to Servlets

@WebFilter(dispatcherTypes = { DispatcherType.REQUEST }, urlPatterns = { "/*" })
public class MyFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public MyFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// place your code here
		
		System.out.println("Filter loaded First!");
		
		HttpServletRequest httpServletRequest= (HttpServletRequest) request;
		
		System.out.println(" You have sent header ");
		
		httpServletRequest.getHeaderNames().asIterator().forEachRemaining(name->{
			System.out.print("\n"+name+" = ");
			System.out.print(httpServletRequest.getHeader(name));
		});
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
