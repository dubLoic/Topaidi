package fr.epsi.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import fr.epsi.dao.UtilisateurDao;
import fr.epsi.dao.UtilisateurDaoImpl;
import fr.epsi.entite.Utilisateur;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class UtilisateurServiceImpl implements UtilisateurService {

	@PersistenceContext
	private EntityManager em;

	@Resource
	private UserTransaction utx;
	
	public void createUtilisateur(Utilisateur p) {
		UtilisateurDao dao = new UtilisateurDaoImpl(em, utx);
		dao.createUtilisateur(p);
	}

	public Utilisateur getUtilisateur(Long id) {
		UtilisateurDao dao = new UtilisateurDaoImpl(em, utx);
		return dao.getUtilisateur(id);
	}

	public List<Utilisateur> getUtilisateurList() {
		UtilisateurDao dao = new UtilisateurDaoImpl(em, utx);
		return dao.getUtilisateurList();
	}

}
