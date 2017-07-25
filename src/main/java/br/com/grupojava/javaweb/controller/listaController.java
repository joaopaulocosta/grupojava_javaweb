package br.com.grupojava.javaweb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.grupojava.javaweb.model.UsuariosModel;

@WebServlet(urlPatterns="/lista")
public class listaController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5255367197068863736L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuariosModel usuariosModel = new UsuariosModel();
		
		request.setAttribute("usuarios", usuariosModel.buscaUsuarios());
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/listaUsuarios.jsp");
		rd.forward(request, response);		
	}

}