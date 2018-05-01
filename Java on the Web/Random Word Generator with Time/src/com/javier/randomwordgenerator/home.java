package com.javier.randomwordgenerator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("counter")==null) {
			session.setAttribute("counter", 0);
		}
		else {
			int num= (int) session.getAttribute("counter");
			session.setAttribute("counter", num+1);
		}
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Home.jsp");
        view.forward(request, response);

        
	}

}
