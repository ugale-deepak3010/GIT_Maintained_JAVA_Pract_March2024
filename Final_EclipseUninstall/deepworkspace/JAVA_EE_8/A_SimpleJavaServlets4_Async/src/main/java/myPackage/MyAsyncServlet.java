package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/MyAsyncServlet", asyncSupported = true)
public class MyAsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static int requestCounterByDeep = 0;

	public MyAsyncServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AsyncContext asyncContext = request.startAsync();
		
		asyncContext.start(new Runnable() {

			@Override
			public void run() {

				try {
					
					Thread.sleep(1000); 
					System.out.println("Printing the response");
					System.out.println("Response returned by: "+ Thread.currentThread().getName() );
					
					PrintWriter printWriter= response.getWriter();
					
					printWriter.append(getDeepkResponse());
					
					asyncContext.complete();

				} catch (Exception e) {}

			}
		});

		System.out.println("Request handled by: "+ Thread.currentThread().getName() );
	}

	public String getDeepkResponse() {

		requestCounterByDeep= requestCounterByDeep + 1;
		String res= "Count of request: "+ String.valueOf(requestCounterByDeep);
		
		
		return res ;
	}

}
