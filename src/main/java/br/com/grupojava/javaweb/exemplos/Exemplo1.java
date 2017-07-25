package br.com.grupojava.javaweb.exemplos;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/exemplo1")
public class Exemplo1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello World!</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1474066958168023013L;

}
