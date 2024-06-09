package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.RequestDispatcher;
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

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		CatalogService.addItem(new CatalogItem(request.getParameter("name"), request.getParameter("manufacturer"),
				request.getParameter("sku")));


		request.setAttribute("CaralogItem", CatalogService.getAllCatalogItems());

		response.setHeader("myheader", "myheaderValue");
		response.addCookie(new Cookie("myCookie", "MyCookieValue"));
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("list.jsp");
		requestDispatcher.forward(request, response);

		// doGet(request, response);
	}

}
