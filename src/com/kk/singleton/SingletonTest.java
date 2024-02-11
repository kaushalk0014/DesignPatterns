package com.kk.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonClass instance1=SingletonClass.getInstance();
		SingletonClass instance2=SingletonClass.getInstance();
		
		
		System.out.println(instance1.hashCode()==instance2.hashCode());
	}
}
