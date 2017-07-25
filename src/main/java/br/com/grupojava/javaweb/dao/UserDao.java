package br.com.grupojava.javaweb.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


import br.com.grupojava.javaweb.entity.User;
import br.com.grupojava.javaweb.util.JPAUtil;


public class UserDao {
	
	  private EntityManager manager;

	
	public UserDao() {
	    manager = new JPAUtil().getEntityManager();
	  }
	
	public void addUser(User user) {
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();

    }

    public void addUserCriteria(User user) {
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();

    }
	
	public void deleteUser(int userId) {
        manager.getTransaction().begin();
        manager.createQuery("Delete User where id = '" + userId + "'").executeUpdate();
        manager.getTransaction().commit();
	}
	
	public void updateUser(User user) {
		manager.getTransaction().begin();
		manager.merge(user);
	    manager.getTransaction().commit();

    }
	
	public List<User> getAllUsers() {
		List<User> users = null;
		try {
        manager.getTransaction().begin();
         users = (List<User>) manager.createQuery("from User").getResultList();
		}catch(Exception e){
			e.printStackTrace();
		}
        return users;
    }
	
	
	
	@SuppressWarnings("finally")
	public User getUserByEmail(String email) {
		User user = null;
		try {
			manager.getTransaction().begin();
			user = manager.createQuery("From User where email = '"  + email + "'", User.class)
					.getSingleResult();
			manager.getTransaction().commit();
		}catch(NoResultException e){
			System.out.println("Nenhum usuário encontrado");
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			return user;
		}
    }
	
	
	public void close() {
		manager.close();
	  }
	
}