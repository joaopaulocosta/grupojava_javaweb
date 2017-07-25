package br.com.grupojava.javaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/")
public class indexController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5255367197068863736L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
