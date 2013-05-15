package metier.project.mesures;

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
 * Classe réprésentant une mesure
 * @author Esposito Le Corre
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
public abstract class Mesure {

	private double quantite;
	

	public double conversion(double valeur, String uniteE, String uniteS) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
