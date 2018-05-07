package com.javier.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javier.web.models.Player;
import com.javier.web.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewPlayer.jsp");
        view.forward(request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();		
		Player newPlayer = new Player(request.getParameter("first_name"), request.getParameter("last_name"), Integer.parseInt(request.getParameter("age")));
		Team currentTeam = (Team) session.getAttribute("currentTeam");
		ArrayList<Player> list = currentTeam.getPlayers();
		list.add(newPlayer);
		currentTeam.setPlayers(list);
		session.setAttribute("players", currentTeam.getPlayers());
		System.out.println(currentTeam.getPlayers());
		
		response.sendRedirect("/Team_Roster/");
	}

}
