package com.maeh.first;

public class ShowPropertis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(
				System.getProperty("java.library.path"));
	}

}
