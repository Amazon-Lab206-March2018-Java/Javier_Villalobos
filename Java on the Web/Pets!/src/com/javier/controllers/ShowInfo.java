package com.javier.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javier.models.Cat;
import com.javier.models.Dog;

@WebServlet("/showinfo")
public class ShowInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight = Double.parseDouble(request.getParameter("weight"));
		String animal = request.getParameter("animal");
		if (animal == "cat") {
			Cat cat = new Cat(name, breed, weight);
			request.setAttribute("affection", cat.showAffection());
		}
		else {
			Dog dog = new Dog(name, breed,weight);
			request.setAttribute("affection", dog.showAffection());
		}
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/showinfo.jsp");
        view.forward(request, response);
		
	}

}
