package com.zgfh.bugList;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogBack{
	protected  final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void test() throws Exception {
		if(logger.isDebugEnabled()){
			logger.debug("test:"+"aaa");
		}
		System.out.println("ok");
		logger.info("test:"+"aaa");
		logger.info("test:{}","aaa");
		logger.info("test:{}{}{}","aaa","bbb");
		logger.info("test:{}{}{}","aaa","bbb","ccc","ddd","");
		/*
		[main] INFO com.zzg.wechat.util.TestLogBack - test:aaa
		[main] INFO com.zzg.wechat.util.TestLogBack - test:aaabbb{}
		[main] INFO com.zzg.wechat.util.TestLogBack - test:aaabbbccc
		*/
	}
}
