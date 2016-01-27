package com.zgfh.bugList;

public class TryCatch {

	static void test1() {
		throw new RuntimeException("my error");
		
	}
	static void test2(){
		try {
			test1();
		} catch (NullPointerException e) {
			System.err.println("i get null rr");
		} catch (Exception e) {
			//@xx
			System.err.println("i get null my error");
			throw new RuntimeException("my error");
		}
		System.err.println("test2");
		
	}
	public static void main(String[] args) {
		test1();
		System.err.println("main");
	}
}
