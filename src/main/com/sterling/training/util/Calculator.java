package com.sterling.training.util;

public class Calculator implements CalcInterface{

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a-b;
	}

	public int multiplication(int a, int b) {
		return a+b;
	}

	public int divison(int a, int b) throws Exception {
		return a/b;
	}

	public boolean equalIntegers(int a, int b) {
		if(a ==b )
			return true;
		return false;
	}

}
