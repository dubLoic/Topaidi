package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Idee;

public interface IdeeDao {
	void createIdee(Idee p);
	Idee getIdee(Long id);
	List<Idee> getIdeeList();
}
