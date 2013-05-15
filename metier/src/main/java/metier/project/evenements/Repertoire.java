package metier.project.evenements;

import java.util.Collection;

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
 * Classe représentant un répertoire
 * 
 * @author Esposito Le Corre
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public class Repertoire {

	/**
	 * Nom du répertoire
	 */
	private String nom;
	
	/**
	 * Ensemble de personnes du répertoire
	 */
	private Collection<Personne> personnes;
	
	/**
	 * Ajouter une personne au répertoire
	 * @param personne
	 */
	void ajouterPersonne(Personne personne){
		this.personnes.add(personne);
	}
	
	/**
	 * Supprimer une personne du répertoire
	 * @param personne
	 */
	void supprimerPersonne (Personne personne) {
		this.personnes.remove(personne);
	}
}


