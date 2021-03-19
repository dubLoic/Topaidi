package fr.epsi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class AccueilServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(req, resp);
	}
}
