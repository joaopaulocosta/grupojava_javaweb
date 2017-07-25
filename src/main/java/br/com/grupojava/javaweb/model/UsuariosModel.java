package br.com.grupojava.javaweb.model;

import java.util.List;

import br.com.grupojava.javaweb.dao.UserDao;
import br.com.grupojava.javaweb.entity.User;

public class UsuariosModel {
	
	public List<User> buscaUsuarios(){
		UserDao userDao = new UserDao();
		return userDao.getAllUsers();
	}
	
	public boolean novoUsuario(String name, String password, String email){
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		try{
			UserDao userDao = new UserDao();
			userDao.addUser(user);
		}catch(Exception e){
			System.out.println("Erro ao incluir novo Usuario: " + e);
			return false;
		}
		
		return true;
	}
}
