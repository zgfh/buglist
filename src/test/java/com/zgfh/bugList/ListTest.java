package com.zgfh.bugList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;


public class ListTest {
	@Test()
	public void test() {
		List<Integer> list=Collections.emptyList();
		list.add(2);
	}
	@Test(expected=UnsupportedOperationException.class)
	 public void test1(){
		Integer [] a={1,2};
		List<Integer> list=Arrays.asList(a);
		list.add(2);
	}
	public static void main(String[] args) {
		List<Integer> list=Collections.emptyList();
		list.add(2);
	}
	
}
