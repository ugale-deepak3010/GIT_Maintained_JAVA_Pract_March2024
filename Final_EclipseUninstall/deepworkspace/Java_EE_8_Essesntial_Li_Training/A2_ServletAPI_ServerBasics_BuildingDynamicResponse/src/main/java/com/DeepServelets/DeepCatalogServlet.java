package com.DeepServelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeepCatalogServlet
 */
@WebServlet("/DeepCatalogServlet")
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

		// System.out.println(name);

		DeepCatalog.addItem(new DeepCatalogItem(name, manufacturer, sku));

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border=\"1\" >");

		for (DeepCatalogItem item : DeepCatalog.getItems()) {
			out.println("<tr>");

			out.print("<td>");
			out.print(item.getName());
			out.print("</td>");

			out.print("<td>");
			out.print(item.getManufacturer());
			out.print("</td>");

			out.print("<td>");
			out.print(item.getSku());
			out.print("</td>");

			out.println("</tr>");
		}

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}
