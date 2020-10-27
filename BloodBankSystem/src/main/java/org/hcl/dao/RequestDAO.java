package org.hcl.dao;
import org.hcl.entities.User;

public interface RequestDAO {
	public  Integer insert (User user);
	public User getIdAndPassword(int userId,String password);
	
	

}



