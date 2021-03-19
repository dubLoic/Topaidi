package fr.epsi.controller;

import java.io.IOException;
import java.util.Date;
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
import fr.epsi.service.IdeeService;


@WebServlet("/idee")
public class IdeeServlet extends HttpServlet{

	@EJB
	private IdeeService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		HttpSession session = req.getSession();
		if(session.getAttribute("userID") != null) {
			if(req.getParameter("action").equals("create"))
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/createIdee.jsp").forward(req, resp);
			else if (req.getParameter("action").equals("list")){
				List<Idee> ideeList = service.getIdeeList();
				req.setAttribute("ideeList", ideeList);
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/listeIdee.jsp").forward(req, resp);
			}
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(req, resp);
		}
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		HttpSession session = req.getSession();

		Idee p = new Idee();
		Utilisateur user = new Utilisateur();
		
		user.setId((Long)session.getAttribute("userID"));
		p.setTitre(req.getParameter("titre"));
		p.setDescription(req.getParameter("description"));
		p.setDatePoste(req.getParameter("datep"));
		p.setCategorie(req.getParameter("categorie"));
		p.setImage(req.getParameter("image"));
		service.createIdee(p);
		resp.sendRedirect(req.getContextPath() + "/idee?action=list");
		//this.getServletContext().getRequestDispatcher("/WEB-INF/pages/listeIdee.jsp").forward(req, resp);
	}
}
