package myPackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServletClass")
public class MyServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServletClass() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		Map<String, String[]> parameterMap= request.getParameterMap();
		
		//http://localhost:8080/HelloJSP/myServletClass?name=deepak-ugale,Manali-rahangdhale&relation=Love
		// name =  [deepak-ugale,Manali-rahangdhale]
		//  relation =  [Love]
		parameterMap.forEach((key,value)->System.out.println("  "+key+" =  "+Arrays.toString(value)));

		response.getWriter().append("Served at: ")
					.append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
