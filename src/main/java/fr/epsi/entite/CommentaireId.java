package fr.epsi.entite;

import java.io.Serializable;

public class CommentaireId implements Serializable{

	private static final long serialVersionUIS = 1L;
	
	private Long utilisateurId;
	private Long ideeId;
	
	public CommentaireId() {
		
	}

	public long getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	public long getIdeeId() {
		return ideeId;
	}

	public void setIdeeId(long ideeId) {
		this.ideeId = ideeId;
	}
	
	public int hashCode() {
		return(int)this.utilisateurId.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof CommentaireId)) return false;
		CommentaireId pk = (CommentaireId) obj;
		return pk.ideeId.equals(this.ideeId) && pk.utilisateurId.equals(this.utilisateurId);
	}
}
