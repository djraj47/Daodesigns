package com.pack.ipem.Dao.impl;
import java.util.ArrayList;
import com.pack.ipem.bean.User;
import com.pack.ipem.Dao.UserDao;

public class UserDaoImpl implements UserDao{
	
	private ArrayList<User> users = new ArrayList<>();

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println("User added Successfully !!");
		
	}
	 public void showAllUsers() {
		 for(int i = 0 ; i<users.size();i++) 
		 {
			 User user = users.get(i);
			 System.out.println(user);
		 }
	 }
	@Override
	public void updateUser(User newuser) {
		boolean found = false;
		 for(int i = 0 ; i<users.size();i++) 
		 {
			 User user = users.get(i);
			if(user.getId()==newuser.getId()) {
				
				users.set(i,newuser);
				found = true;
				break;
			}
		 }
		 if(!found) {
			 System.out.println("NO user Found");
		 }
		
		
	}
	@Override
	public void deleteUser(int id) {
		
	boolean found = true;
//		users.removeIf((user)->user.getId()==id);
		for (int i = 0; i < users.size(); i++) {

			 User user = users.get(i);
			if(user.getId()==id) {
				
				users.remove(i);
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("NO user Found");
		}
		
		
	}
	@Override
	public void findUserById(int id)
	{
		boolean found = false;
		for (int i = 0; i < users.size(); i++)
		{
			User user = users.get(i);
			if(user.getId()==id) 
			{
				System.out.println("User Details Found");
				System.out.println(user);
				found=true;
				break;
			}
		}
		if(found == false) 
		{
			System.out.println("NO User Details Found");
		}
		
	}
	@Override
	public void findUserByName(String name) {
		boolean found = false;
		for (int i = 0; i < users.size(); i++)
		{
			User user = users.get(i);
			if(user.getName()==name) 
			{
				System.out.println("User Details Found");
				System.out.println(user);
				found=true;
				break;
			}
		}
		if(found == false) 
		{
			System.out.println("NO User Details Found");
		}
		
	}
	


	

}
