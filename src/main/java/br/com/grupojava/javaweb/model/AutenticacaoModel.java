package br.com.grupojava.javaweb.model;

import br.com.grupojava.javaweb.dao.UserDao;
import br.com.grupojava.javaweb.entity.User;

public class AutenticacaoModel {
	
	public boolean checaUser(String email, String password){
		UserDao userDao = new UserDao();
		try{
			User user =  userDao.getUserByEmail(email);
			if(user.getPassword().equals(password)){
				return true;
			}
		}catch(Exception e){
			return false;
		}
		return false;
	}
	
}
