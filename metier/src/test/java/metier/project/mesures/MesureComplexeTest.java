package metier.project.mesures;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MesureComplexeTest {

	static MesureComplexe mc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mc = new MesureComplexe();
	}

	@Test
	public void conversiontestTemperatures() {
		assertEquals(273.15,mc.conversion(0, "C", "K"),0.1);
	}

	@Test
	public void conversiontestMonnaieEur() {
		assertEquals(0.7646,mc.conversionMonnaie(1, "USD", "EUR"),0.1);
	}
	@Test
	public void conversiontestMonnaieVanatuIles() {
		assertEquals(119.486,mc.conversionMonnaie(1.308, "USD", "VUV"),0.1);
	}
	@Test
	public void conversiontestMonnaieAustralia() {
		assertEquals(3009.617,mc.conversionMonnaie(34.00, "AUD", "VUV"),0.1);
	}
}
