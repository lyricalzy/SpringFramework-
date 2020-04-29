package com.mega.mvc04;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Speak implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		
		
		
		
		
		
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("mvc04 컨텍스트 시작됨");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("mvc04 컨텍스트 끝남");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
	}

}
