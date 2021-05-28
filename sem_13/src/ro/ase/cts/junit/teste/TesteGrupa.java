package ro.ase.cts.junit.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.junit.clase.Grupa;

public class TesteGrupa {

	@Test
	public void testConstructorNrGrupa() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testConstructorNrGrupaMinim() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorNrGrupaMaxim() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEroareConstructorGrupaMinim() {
		Grupa grupa = new Grupa(900);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEroareConstructorGrupaMaxim() {
		Grupa grupa = new Grupa(1200);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1080);
	}
}
