package metier.project.evenements;


import lombok.Data;

/**
 * 
 * A shortcut for @ToString, @EqualsAndHashCode,
 * 
 * @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor
 * 
 */
@Data
/**
 * Ressource appartenant à un évênement
 * 
 * @author Esposito Le Corre
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public class Ressource {

	/**
	 * nom de la ressource
	 */
	private String nom;
	
	/**
	 * La ressource est louee ou non
	 */
    private Boolean loue;
	/**
	 *creneau de location. La ressource est loue
	 */
	public void LouerCreneau() {
		this.loue=true;
	}

	/**
	 * on libere le creneau
	 */
	public void libererCreneau() {
		this.loue=false;
	}
}
