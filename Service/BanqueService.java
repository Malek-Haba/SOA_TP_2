package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	public double conversion(double mt) {
		return mt;
	}

	Compte getCompte(int code) {
		int solde = 0;
		Date dateCreation = new Date();
		Compte compte = new Compte(code, solde, dateCreation);
		return compte;
	}

	List<Compte> getComptes() {
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1, 0, new Date()));
		comptes.add(new Compte(2, 0, new Date()));
		comptes.add(new Compte(3, 0, new Date()));
		return comptes;

	}

}
