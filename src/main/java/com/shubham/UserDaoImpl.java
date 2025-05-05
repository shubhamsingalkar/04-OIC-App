package com.shubham;

public class UserDaoImpl implements IUserDao{

	public UserDaoImpl() {
		
		System.out.println("Inside the UserdaoImpl constructor...");
		
	}
	
	@Override
	public String findName(int id) {
		
		if(id == 100) {
			return "Raju";
		} 
		else if (id == 101){
			return "Rani";
		}
		else
		return null;
	}

}
