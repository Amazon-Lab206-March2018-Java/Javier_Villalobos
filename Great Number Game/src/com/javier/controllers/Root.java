package com.javier.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Root
 */
@WebServlet("/")
public class Root extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if ( session.getAttribute("num")==null) {
			session.setAttribute("num",(int)(Math.random()*(100-1)+1));
		}
		System.out.println(session.getAttribute("num"));
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Home.jsp");
		view.forward(request, response);
	}


}
