package com.dhiraj.beans;

public class Student
{
	private String Name;
	private int RollNo;
	private String Email;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		this.RollNo = rollNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	
	
	public void Display()
	{
		System.out.println("Name: " + Name);
		System.out.println("RollNo: " + RollNo);
		System.out.println("Email: " + Email);
	}
	
}