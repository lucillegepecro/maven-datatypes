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
 * Classe représentant une personne
 * 
 * @author Esposito Le Corre
 *
 */
public class Personne extends Ressource{
	/**
	 * Ensemble des adresses d'une personne
	 */
	private ArrayList<Adresse> adresses;
	
	/**
	 * Age de la personne 
	 */
	
	private int age;
	/**
	 * Ajouter une adresse à l'individu
	 * @param adresse
	 */
	void ajouterAdresse(Adresse adresse){
		this.adresses.add(adresse);
	}
	
	/**
	 * Supprimer l'adresse de l'individu
	 * @param adresse
	 */
	void supprimerAdresse (Adresse adresse) {
		this.adresses.remove(adresse);
	}
}
