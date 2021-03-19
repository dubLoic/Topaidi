package fr.epsi.entite;

import java.io.Serializable;

public class CommentaireId implements Serializable{

	private static final long serialVersionUIS = 1L;
	
	private Long utilisateur;
	private Long idee;
	
	public CommentaireId() {
		
	}

	public long getUtilisateurId() {
		return utilisateur;
	}

	public void setUtilisateurId(long utilisateurId) {
		this.utilisateur = utilisateurId;
	}

	public long getIdeeId() {
		return idee;
	}

	public void setIdeeId(long ideeId) {
		this.idee = ideeId;
	}
	
	public int hashCode() {
		return(int)this.utilisateur.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof CommentaireId)) return false;
		CommentaireId pk = (CommentaireId) obj;
		return pk.idee.equals(this.idee) && pk.utilisateur.equals(this.utilisateur);
	}
}
