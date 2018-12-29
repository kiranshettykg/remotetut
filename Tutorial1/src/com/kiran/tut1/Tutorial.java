package com.kiran.tut1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test");
		System.out.println("Test");
		Tutorial tt = new Tutorial();
		int val = tt.myFunc();
		System.out.println("Test" + val);
		Collection<String> it = new ArrayList<>();
		it.add("Test1");
		it.add("Test2");
		it.add("Test3");
		for (Iterator<String> iterator = it.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		for(String s : it) {
			System.out.println(s);
		}
		
	}

	private int myFunc() {
		
		 int a;
		 System.out.println("Testing");
		 return 10;
	}
	private int age;
	private String name;
	private String address;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

}
