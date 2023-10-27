package Service;

import java.util.Date;

public class Compte {
	private int code;
	private int solde;
	private Date dateCreation;
	public Compte(int code, int solde, Date dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public int getCode() {
		return this.code;
	}
	public int getSolde() {
		return this.solde;
	}
	public Date getDateCreation() {
		return this.dateCreation;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}