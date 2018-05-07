package com.javier.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PlayAgain
 */
@WebServlet("/PlayAgain")
public class PlayAgain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("won");
		session.setAttribute("show", "none");
		session.removeAttribute("result");
		session.setAttribute("num",(int)(Math.random()*(100-1)+1));
		response.sendRedirect("/Great_Number_Game/");
	}


}
