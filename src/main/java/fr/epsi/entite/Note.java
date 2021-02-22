package fr.epsi.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(NoteId.class)
public class Note {

	private Double top;
	private Double flop;
	
	@Id
	@ManyToOne
	private Utilisateur utilisateur;
	
	@Id
	@ManyToOne
	private Idee idee;

	public Double getTop() {
		return top;
	}

	public void setTop(Double top) {
		this.top = top;
	}

	public Double getFlop() {
		return flop;
	}

	public void setFlop(Double flop) {
		this.flop = flop;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Idee getIdee() {
		return idee;
	}

	public void setIdee(Idee idee) {
		this.idee = idee;
	}
}
