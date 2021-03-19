package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entite.Utilisateur;
import fr.epsi.service.UtilisateurService;

@WebServlet("/user")
public class UtilisateurServlet  extends HttpServlet{

	@EJB
	private UtilisateurService service;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		Utilisateur p = new Utilisateur();
		p.setId(Long.parseLong(req.getParameter("UserID")));
		p.setEmail(req.getParameter("UserMail"));
		HttpSession session = req.getSession();
		session.setAttribute("UserID", p.getId());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/listIdee.jsp").forward(req, resp);
	}
}
