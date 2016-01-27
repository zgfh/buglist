package com.zgfh.bugList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongTest {

	@Test
	public static void testName() throws Exception {
		Long a=1L;
		Long b=1L;
		assertTrue(a== b);
		a=a.longValue()+100;
		b=b.longValue()+100;
		assertTrue(a== b);
		
		a=a.longValue()+200;
		b=b.longValue()+200;
		
		assertFalse(a== b);//不等了。。。！！！
		assertTrue(a.longValue()== b.longValue());
		
	}
	
}
