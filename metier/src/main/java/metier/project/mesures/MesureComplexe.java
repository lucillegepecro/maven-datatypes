package metier.project.mesures;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class MesureComplexe extends AbstractMesure {

	/**
	 * Conversion complexes ex : temperature, angle, ...
	 */

	public double conversion(double valeur, String uniteE, String uniteS) {

		// récuperation du fichier de properties monFic.properties pour la
		// conversion des date
		final String UNITES_FILE = "src/uniteComplexe.properties";
		Properties properties = null;

		InputStream stream = null;
		if (properties == null) {
			try {
				properties = new Properties();
				properties.load(new FileInputStream(UNITES_FILE));

			} catch (final Exception exp) {
                            exp.getStackTrace();
			} finally {
				try {
					if (stream != null) {
						stream.close();
					}
				} catch (final IOException e) {
                                    e.getStackTrace();
				}
			}
		}

		// résultat de la conversion
		double res = 0;

	

		// récupération des valeurs correspondant aux unités
		String valeurE = properties.getProperty(uniteE);

		String valeurS = properties.getProperty(uniteS);

		// calculs ...
		

		if (uniteE.equals("C") && uniteS.equals("K")) {	
			res = valeur + Double.parseDouble(valeurE);
			System.out.println(Double.parseDouble(valeurE));
		}
		if (uniteE.equals("K") && uniteS.equals("C")) {	
			res = valeur + Double.parseDouble(valeurE);
		}
		if (uniteE.equals("F") && uniteS.equals("K")) {	
			res = (valeur + Double.parseDouble(valeurE))/1.8;
		}
		if (uniteE.equals("K") && uniteS.equals("F")) {	
			res = valeur*1.8 - Double.parseDouble(valeurS);
		}
	

		return res;
	}

	public double conversionMonnaie(double valeur, String deviseEntree, String deviseSortie) {
		final String UNITES_FILE = "src/devises.properties";
		Properties properties = null;

		InputStream stream = null;
		if (properties == null) {
			try {
				properties = new Properties();
				properties.load(new FileInputStream(UNITES_FILE));
			} catch (final Exception exp) {
                            exp.getStackTrace();
			} finally {
				try {
					if (stream != null) {
						stream.close();
					}
				} catch (final IOException e) {
                                    e.getStackTrace();
				}
			}
		}

		// variable faisant la transition entre unité de base et unité voulue
		double pivot;

		// résultat de la conversion
		double res;

		// récupération des valeurs correspondant aux unités
		String valeurE = properties.getProperty(deviseEntree);
		
		String valeurS = properties.getProperty(deviseSortie);

		// calculs ...

		pivot = valeur * Double.parseDouble(valeurE);

		res = pivot*Double.parseDouble(valeurS);
		
		return res;

	}

}
