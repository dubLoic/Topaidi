package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Utilisateur;

public interface UtilisateurDao {
	void createUtilisateur(Utilisateur p);
	Utilisateur getUtilisateur(Long id);
	List<Utilisateur> getUtilisateurList();
}
