package com.DeepServelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeepCatalogServlet
 */
@WebServlet(urlPatterns = "/DeepCatalogServlet", asyncSupported = true)
public class DeepCatalogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeepCatalogServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("MyHeader", "MyHeaderValue");
		response.addCookie(new Cookie("MyCookie", "MyCookieValue"));

		String name = request.getParameter("name");
		String manufacturer = request.getParameter("manufacturer");
		String sku = request.getParameter("sku");

		DeepCatalog.addItem(new DeepCatalogItem(name, manufacturer, sku));
		
		request.setAttribute("items", DeepCatalog.getItems());
		
		//request.setAttribute("name", name);
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("hello.jsp");
		requestDispatcher.forward(request, response);

	}

}
