package ro.ase.cts.junit.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;
import ro.ase.cts.junit.clase.Student;

public class TesteGrupaPromovabilitate {

	@Test
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
	public void testGetPromovabilitateEroare() {
		Grupa grupa = new Grupa(1080);
		
		grupa.getPromovabilitate();
	}

}
