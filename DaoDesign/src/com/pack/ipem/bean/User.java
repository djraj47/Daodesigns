package com.pack.ipem.bean;

public class User {

	private int id;
	private String name;
	private double Salary;
	private long phoneno;
	
	public User() { }
	public User(int id, String name, double salary, long phoneno) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.phoneno = phoneno;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Salary= $ " + Salary + ", phoneno=" + phoneno + "]";
	}
	
	
	

}
