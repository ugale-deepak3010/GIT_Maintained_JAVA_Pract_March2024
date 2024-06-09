package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myPackage.Model.CatalogItem;
import myPackage.Service.CatalogService;



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
		
		
		System.out.println("POST");

		CatalogService.addItem(new CatalogItem(request.getParameter("name"),
				request.getParameter("manufacturer"), request.getParameter("sku")));
		
		PrintWriter printWriter= response.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("<h3>Your Posted Data</h3>");
		
		printWriter.println("<h1>");
		printWriter.println(
				request.getParameter("name")+" "+
				request.getParameter("manufacturer")+ " "+ 
				request.getParameter("sku")					);
		printWriter.println("</h1>");
		printWriter.println("</body>");
		printWriter.println("</html>");
		
		response.setHeader("myheader", "myheaderValue");
		response.addCookie(new Cookie("myCookie", "MyCookieValue"));
		
		//doGet(request, response);
	}

}
