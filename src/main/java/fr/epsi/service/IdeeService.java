package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;

public interface IdeeService {
	void createIdee(Idee p);
	Idee getIdee(Long id);
	List<Idee> getIdeeList();
}
