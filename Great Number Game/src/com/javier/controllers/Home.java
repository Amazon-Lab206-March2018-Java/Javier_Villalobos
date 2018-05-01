package com.javier.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/guess")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int num = Integer.parseInt(request.getParameter("number"));
		if(num<(int)session.getAttribute("num")) {
			session.setAttribute("result", "Too low" );
		}
		if(num == (int)session.getAttribute("num")) {
			session.setAttribute("won","won");
			session.setAttribute("show","block");
			session.setAttribute("result", session.getAttribute("num") +" was the number" );
		}
		if(num>(int)session.getAttribute("num")) {
			session.setAttribute("result", "Too high" );
		}
		response.sendRedirect("/Great_Number_Game/");			
	}

}
