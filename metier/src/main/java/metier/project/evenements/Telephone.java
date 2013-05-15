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
 * Classe représentant un numéro de téléphone d'une personne
 * @author Clo
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public class Telephone {
	/**
	 * Numéro privé
	 */
	private int numero;
	
	/**
	 * indicatif dépendant du pays ou de la région
	 */
	private String indicatif;
}
