package fr.epsi.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@IdClass(CommentaireId.class)
public class Commentaire {
	
	
	private String commentaire;
	
	@Id
	@ManyToOne
	private Utilisateur utilisateur;
	
	@Id
	@ManyToOne
	private Idee idee;
	
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
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
