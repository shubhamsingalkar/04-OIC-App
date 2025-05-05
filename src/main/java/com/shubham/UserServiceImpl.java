package com.shubham;

public class UserServiceImpl implements IUserService {

	
	private IUserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("Inside UserServiceImpl constructor 0-parameterized constructor");
	}
	
	
	public UserServiceImpl(IUserDao userDao) {  //Constructor injection...
		
		System.out.println("Inside UserServiceImpl parameterized constructor...");
		
		this.userDao = userDao;
	}
	
	
	@Override
	public String getName(int id) {
		
		String name = userDao.findName(id);
		
		return name;
	}

}
