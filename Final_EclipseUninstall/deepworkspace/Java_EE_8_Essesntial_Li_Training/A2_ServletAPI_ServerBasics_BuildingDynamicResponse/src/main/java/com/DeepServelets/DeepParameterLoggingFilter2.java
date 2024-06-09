package com.DeepServelets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class DeepParameterLoggingFilter2
 */
@SuppressWarnings("serial")
@WebFilter("/*")
public class DeepParameterLoggingFilter2 extends jakarta.servlet.http.HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public DeepParameterLoggingFilter2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		request.getParameterMap().entrySet().stream().forEach(parmeter->{
			System.out.println(String.format("%s = %s", parmeter.getKey(), parmeter.getValue()[0]));
		});
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
