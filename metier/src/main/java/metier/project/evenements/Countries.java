package metier.project.evenements;

import java.util.ArrayList;

import lombok.Data;

/**
 * 
 *A shortcut for @ToString, @EqualsAndHashCode, 
 *@Getter on all fields, and @Setter on all non-final fields,
 * and @RequiredArgsConstructor
 *
 */
@Data
/**
 * 
 * Classe reprenant les caractéristiques principales d'un pays
 * 
 * @author Esposito Le Corre
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public class Pays {
	/**
	 * nom du pays
	 */
	private String nom;
	
	
	/**
	 * Ensemble de villes contenues dans le pays
	 */
	private ArrayList<Ville> villes;
	

	/**
	 * Ajouter une ville au pays
	 * @param ville
	 */
	void ajouterVille(Ville ville){
		this.villes.add(ville);
	}
	/**
	 * Supprimer une ville au pays
	 * @param ville
	 */
	void supprimerVille (Ville ville) {
		this.villes.remove(ville);
	}
}
