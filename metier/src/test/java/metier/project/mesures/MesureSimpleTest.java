package metier.project.mesures;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class MesureSimpleTest {
	static MesureSimple mc = new MesureSimple();
	

	@Test
	public void conversionGtoKgtest() {
	 assertEquals(0.001, mc.conversion( 1.00,"g","Kg"), 0.1);
	}
	
	@Test
	public void conversionKgtogtest () {
		assertEquals(1000.0, mc.conversion( 1.00,"Kg","g"), 0.1);
	
	}
	
	@Test
	public void conversionKgtoGtest2 () {
		assertEquals(2020.0, mc.conversion( 2.02,"Kg","g"), 0.1);
	
	}
	
	@Test
	public void conversionltomLtest2 () {
		assertEquals(2020.0, mc.conversion( 2.02,"L","mL"), 0.1);
	}
	
	@Test
	public void conversionltomLCentimetre () {
		assertEquals(100, mc.conversion( 1,"m","cm"), 0.1);
	}
	
	@Test
	public void conversionlitresTest () {
		assertEquals(10, mc.conversion( 1,"L","dL"), 0.1);
	}
}
