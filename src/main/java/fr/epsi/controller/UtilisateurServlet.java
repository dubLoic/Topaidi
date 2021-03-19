package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Utilisateur;
import fr.epsi.service.UtilisateurService;

@WebServlet("/user")
public class UtilisateurServlet  extends HttpServlet{

	@EJB
	private UtilisateurService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		List<Utilisateur> userList = service.getUtilisateurList();
		req.setAttribute("userList", userList);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/createUtilisateur.jsp").forward(req, resp);
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		Utilisateur p = new Utilisateur();
		p.setEmail(req.getParameter("identifiant"));
		p.setPassword(req.getParameter("password"));
		
		service.createUtilisateur(p);
		
		HttpSession session = req.getSession();
		session.setAttribute("userID", p.getId());
		resp.sendRedirect(req.getContextPath() + "/idee?action=list");
		//this.getServletContext().getRequestDispatcher("/WEB-INF/pages/listeIdee.jsp").forward(req, resp);
	}
}
