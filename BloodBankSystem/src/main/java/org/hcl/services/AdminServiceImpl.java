package org.hcl.services;


	import org.hcl.dao.UserDao;
	import org.hcl.entities.User;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	@Service
	public class AdminServiceImpl implements AdminService {
		@Autowired
		UserDao userdao;

		@Override
		public void insertUser(User user) {
			// TODO Auto-generated method stub
			userdao.insert(user);

		}
		@Override
		public User getUser(int userId, String password)
		{
			User user= userdao.getIdAndPassword(userId, password);
			return user;
		}

	}


