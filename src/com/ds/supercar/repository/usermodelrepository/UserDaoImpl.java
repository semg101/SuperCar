package com.ds.supercar.repository.usermodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.supercar.model.usermodel.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int save(User user)throws Exception {
		
		return (Integer)ht.save(user);
	}

	@Override
	public boolean update(User user)throws Exception {
		ht.update(user);
		return true;
	}

	@Override
	public boolean delete(User user)throws Exception {
		ht.delete(user);
		return true;
	}

	@Override
	public User find(int id)throws Exception {
		
		return (User)ht.get(User.class, id);
	}

	@Override
	public List<User> findAll()throws Exception {
		@SuppressWarnings("unchecked")
		List<User> list = ht.find("from User");
		return list;
	}

}
