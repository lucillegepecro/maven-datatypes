package metier.project.evenements;

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
 * Classe comportant les informations générales sur l'adresse
 * d'une personne.
 * 
 * @author Esposito Le Corre
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public class Adresse {

	/**
	 * lieu d'habitation
	 */
	private String lieu;
	
	/**
	 * numéro de téléphone personnel de la personne
	 */
	private Telephone tel;
	
	/**
	 * email personne de la personne
	 */
	private Email email;
	
	/**
	 * pays où se situe l'adresse
	 */
	private Pays pays;
}
