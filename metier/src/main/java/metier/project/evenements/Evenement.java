package metier.project.evenements;

import java.util.Collection;
import java.util.Date;

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
 * Classe permettant de gérer des evenements avec
 * une date d'évênement, sa récurrence,
 * son nom et les ressources employés par
 * cet évenement.
 * 
 * @author Esposito Le Corre
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public class Evenement {
	/**
	 * Date debut event
	 */
	private Date debut;
	
	/**
	 * Date de fin de l'event
	 */
	private Date fin;
	
	/**
	 * variable qui indique si l'evenement est récurrent ou non
	 */
	private Boolean recurrent;
	
	/**
	 * Réccurence indiquant la récurrence de l'évênement;
	 * Exemple "" tous les jours, toutes les semaines, tous les après midis 
	 * du 1er vendredi du chaque mois ..."
	 */
	private String reccurence;
	
	/**
	 * Nom de l'êvenement
	 */
	private String nom;
	
	/**
	 * ressources utilisées par l'évenement (personnes matériel)
	 */
	private Collection<Ressource> ressources;
	
	
	/**
	 * ajouter une ressource à un evênement
	 * @param ressource
	 */
	void ajouterRessource(Ressource ressource){
		this.ressources.add(ressource);
	}
	
	/**
	 * supprimer une ressource d'un evênement
	 * @param ressource
	 */
	void supprimerRessource (Ressource ressource) {
		this.ressources.remove(ressource);
	}
}
