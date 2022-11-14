package com.demo;

public class Calculation {
	
	//TDD -> Test driven development, using J-Unit/Mockito
	//TDD works in 3 phases 
	/*
	 * - Red phase
	 * - Green phase 
	 * - Re-factoring phase
	 */
	
	public int add(int x, int y) {
		
		return x + y;
	}

	public int substraction(int x, int y) {
		
		return x - y;
	}
	
	public int multiplication(int x, int y) {
		
		return x * y;
	}
	
	public int divide(int x, int y) {
		
		return x / y;
	}
	
	
	public boolean check(int x, int y) {
		
		if(x > y)
			return true;
		
		return false;
	}
}
