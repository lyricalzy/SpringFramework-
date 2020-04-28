package com.mega.mvc03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Me extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET요청 들어왔음.");
		PrintWriter out =response.getWriter();
		out.println("GET received!!!!!");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		out.println("your name: " + name);
		out.println("your age: " + age);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST요청 들어왔음.");
		PrintWriter out =response.getWriter();
		out.println("POST received!!!!!");
		String name = request.getParameter("name");
		out.println("your name: " + name);
		String home = request.getParameter("home");
		out.println("your home: " + home);
	}

}
