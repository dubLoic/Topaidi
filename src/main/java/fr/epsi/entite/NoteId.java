package fr.epsi.entite;

import java.io.Serializable;

public class NoteId implements Serializable{

	private static final long serialVersionUIS = 1L;
	
	private Long utilisateur;
	private Long idee;
	
	public NoteId() {
		
	}
	
	public NoteId(Long utilisateur, Long idee) {
		this.utilisateur = utilisateur;
		this.idee = idee;
	}

	public long getUtilisateurId() {
		return utilisateur;
	}

	public void setUtilisateurId(Long utilisateurId) {
		this.utilisateur = utilisateurId;
	}

	public long getIdeeId() {
		return idee;
	}

	public void setIdeeId(Long ideeId) {
		this.idee = ideeId;
	}
	
	public int hashCode() {
		return(int)this.utilisateur.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof NoteId)) return false;
		NoteId pk = (NoteId) obj;
		return pk.idee.equals(this.idee) && pk.utilisateur.equals(this.utilisateur);
	}
}
