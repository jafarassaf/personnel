package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import personnel.*;

class testLigue {
	GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();

	@Test
	void createLigue() throws SauvegardeImpossible {
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom());
	}

	@Test
	void addEmploye() throws SauvegardeImpossible {
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty",
				LocalDate.of(2023, 12, 01), LocalDate.of(2024, 12, 01));
		assertEquals(employe, ligue.getEmployes().first());
	}

	@Test // test lorsqu'on supprimer un employé (ne devrait plus être présent après le remove() donc assertFalse)
	void removeEmploye() throws SauvegardeImpossible {
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty", LocalDate.of(2023, 12, 01), LocalDate.of(2024, 12, 01));
		
		assertTrue(ligue.getEmployes().contains(employe));
		
		ligue.remove(employe);
		
		assertFalse(ligue.getEmployes().contains(employe));
	}
}

