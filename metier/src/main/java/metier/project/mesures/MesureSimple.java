package metier.project.mesures;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MesureSimple extends Mesure{

	@Override
	/**
	Conversion simple : unite en puissance de 10
		ex : masses, longueurs, ...
*/

    public double conversion (double valeur, String uniteE, String uniteS) {
	
		// récuperation du fichier de properties monFic.properties pour la conversion des date
		 final String UNITES_FILE = "src/unite.properties";
		 Properties properties=null;
		    
		  
		    InputStream stream = null;
		    if(properties==null){
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
		
		// récupération des valeurs correspondant aux unités
		String valeurE = properties.getProperty(uniteE + "-" + uniteS);
		
		
		// calculs ...

		pivot = valeur * Double.parseDouble(valeurE);
		
	
		
		return pivot;
	
    }

}
