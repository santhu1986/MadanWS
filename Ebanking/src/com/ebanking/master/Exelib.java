package com.ebanking.master;

public class Exelib {

	public static void main(String[] args) throws InterruptedException
	{
	
		Library LB=new Library();
		
		LB.OpenApp("http://122.175.8.158/ranford2");
		LB.Adminlgn("Admin","Testing@");
		LB.Role("teller","E");
	}

}
