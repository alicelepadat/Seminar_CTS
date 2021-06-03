package ro.ase.cts.junit.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.teste.categorii.IConstructorCategory;

public class TesteGrupaConstructor {
	
	
	@Test
	@Category(IConstructorCategory.class)
	public void testConstructorNrGrupa() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	}

	@Test
	@Category(IConstructorCategory.class)
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	@Category(IConstructorCategory.class)
	public void testConstructorNrGrupaMinim() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	@Category(IConstructorCategory.class)
	public void testConstructorNrGrupaMaxim() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(IConstructorCategory.class)
	public void testEroareConstructorGrupaMinim() {
		Grupa grupa = new Grupa(900);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(IConstructorCategory.class)
	public void testEroareConstructorGrupaMaxim() {
		Grupa grupa = new Grupa(1200);
	}
	
	@Test(timeout = 500)
	@Category(IConstructorCategory.class)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1080);
	}

}
