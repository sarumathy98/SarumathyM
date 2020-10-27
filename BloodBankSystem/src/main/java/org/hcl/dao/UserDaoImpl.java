package org.hcl.dao;

import java.util.List;


import org.hcl.entities.User;
import org.hcl.entities.BloodGroup;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired	
	SessionFactory factory;

	public Integer insert(User user){
		Session session= factory.openSession();
		Integer id=(Integer)session.save(user);
		session.close();
		return id;
	}
	@Override
	public User getIdAndPassword(int userId, String password)
	{
		Session session = factory.openSession();
		Criteria crit = session.createCriteria(User.class);
		Criterion idd= Restrictions.eq("id",userId);
		Criterion pwd =Restrictions.eq("passWord",password);
		Criterion condition=Restrictions.and(idd,pwd);
		crit.add(condition);
		List<User> ans= crit.list();
	    return ans.get(0);
		
	}
}
	