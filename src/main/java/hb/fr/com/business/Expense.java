package hb.fr.com.business;


import java.time.LocalDate;
import java.util.Objects;

public class Expense {
	String nom;
	int montant;
	LocalDate date;
	
	// Default Constructor
	
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(String nom, int montant, LocalDate date) {
		super();
		this.nom = nom;
		this.montant = montant;
		this.date = date;
	}
	
	//Get & Setter

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	//HashCode & Equals
	
	@Override
	public int hashCode() {
		return Objects.hash(date, montant, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expense other = (Expense) obj;
		return Objects.equals(date, other.date) && montant == other.montant && Objects.equals(nom, other.nom);
	}
	
	//ToString

	@Override
	public String toString() {
		return "Expense [nom=" + nom + ", montant=" + montant + ", date=" + date + "]";
	}
}
