package ro.ase.cts.junit.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.junit.clase.Student;

public class StudentTeste {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Alice"; 
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
		
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		
		assertNotNull(student.getNote());
		assertNotNull(student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		
	}
	
	@Test
	public void testAdaugaNotaDimensiune() {
		Student student = new Student();
		
		student.adaugaNota(5);
		student.adaugaNota(7);
		assertEquals(2, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		
		student.adaugaNota(9);
		
		student.adaugaNota(8);
		
		assertEquals(8.5f, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testCalculeazaMedieCuONota() {
		Student student = new Student();
		
		student.adaugaNota(6);
		
		assertEquals(6, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		
		student.adaugaNota(9);
		student.adaugaNota(3);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		
		student.adaugaNota(9);
		student.adaugaNota(7);
		
		assertFalse(student.areRestante());
	}
}
