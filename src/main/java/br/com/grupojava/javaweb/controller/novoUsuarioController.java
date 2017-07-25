package br.com.grupojava.javaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.grupojava.javaweb.model.UsuariosModel;

@WebServlet(urlPatterns="/novoUsuario")
public class novoUsuarioController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5255367197068863736L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UsuariosModel usuarioModel = new UsuariosModel();
		usuarioModel.novoUsuario(name, password, email);

		response.sendRedirect(request.getContextPath()+"/lista");		
	}

}