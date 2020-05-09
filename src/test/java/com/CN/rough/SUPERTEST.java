package com.CN.rough;

public class SUPERTEST extends DATTEST {

	
	SUPERTEST(int l){
		super(l);
		System.out.println("Calling DATTEST CONSTRUCTOR");
		}
public static void main(String[] args) {
		
		
SUPERTEST S=new SUPERTEST(25);
DATTEST D= new SUPERTEST(3);
	}
}
