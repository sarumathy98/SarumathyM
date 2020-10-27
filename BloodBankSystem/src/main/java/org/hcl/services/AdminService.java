package org.hcl.services;
import org.hcl.entities.User;


public interface AdminService {
	
        public void insertUser(User user);
		public User getUser(int userId, String password);
	}



