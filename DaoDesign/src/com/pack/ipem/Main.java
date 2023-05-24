package com.pack.ipem;

import com.pack.ipem.Dao.UserDao;
import com.pack.ipem.Dao.impl.UserDaoImpl;
import com.pack.ipem.bean.User;

public class Main {

	public static void main(String[] args) {
		
		User u1 = new User(100,"rajkiran",79000,986758594L);
		System.out.println(u1);
		UserDao dao = new UserDaoImpl();
				dao.addUser(u1);
				dao.addUser(new User(101,"raj",53000,7495946L));
				dao.addUser(new User(102,"vidhi",50400,7495946L));
				dao.addUser(new User(103,"ritika",52000,7495946L));
				
				dao.showAllUsers();
				System.out.println("-----------------------------------------------");
				
				dao.updateUser(new User(106,"moti",68000,9689698493L));
				dao.showAllUsers();
				
				System.out.println("-----------------------------------------------");
				
				dao.deleteUser(102);
				dao.showAllUsers();

	}

}
