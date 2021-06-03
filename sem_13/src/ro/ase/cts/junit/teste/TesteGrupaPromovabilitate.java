package ro.ase.cts.junit.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;
import ro.ase.cts.junit.clase.Student;
import ro.ase.cts.junit.teste.categorii.IGetPromovabilitateCategory;
import ro.ase.cts.junit.teste.categorii.ITesteUrgenteCategory;

public class TesteGrupaPromovabilitate {

	@Test
	@Category(IGetPromovabilitateCategory.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<10;i++) {
			IStudent student = new Student();
			student.adaugaNota(6);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.66f, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category({IGetPromovabilitateCategory.class, ITesteUrgenteCategory.class})
	public void testPromovabilitateMinima() {
		Grupa grupa = new Grupa(1070);
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category(IGetPromovabilitateCategory.class)
	public void testPromovabilitateMaxima() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(8);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	@Category(IGetPromovabilitateCategory.class)
	public void testGetPromovabilitateEroare() {
		Grupa grupa = new Grupa(1080);
		
		grupa.getPromovabilitate();
	}

}
