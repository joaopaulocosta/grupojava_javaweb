package br.com.grupojava.javaweb.exemplos;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/exemplo2")
public class Exemplo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		if(nome == null)
			nome = "Fulano";
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(nome != null)
			out.println("<h1>Ola "+ nome + " </h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	
	private static final long serialVersionUID = -84329670652232381L;
}
