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
 * 
 * Classe étant l'email d'une personne. Cet email comporte un nom
 * un domaine et une extension
 * 
 * @author Esposito Le Corre
 *
 */
public class Email {
	/**
	 * nom de l'email caractérisant un individu
	 */
	private String nom;
	
	/**
	 * variable caractérisant le nom de domaine
	 * (exemple hotmail, gmail, yahoo....)
	 */
	private String domaine;
	
	/**
	 * Chaine de caractère caractérisant l'extension .fr .com .uk ...
	 */
	private String extension;
}
