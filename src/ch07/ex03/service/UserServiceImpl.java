package ch07.ex03.service;

import ch07.ex03.dao.UserDao;
import ch07.ex03.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public User getUser() {
		return userDao.selectUser();
		
	}
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
	
	@Override
	public void fixUser(User user) {
		userDao.updateUser(user);
	}
	
	@Overrida
	public void delUser(User user) {
		userDao.deleteUser(user);
	}
}
