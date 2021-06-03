package ro.ase.cts.junit.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;
import ro.ase.cts.mocks.DummyStudent;
import ro.ase.cts.mocks.FakeStudent;
import ro.ase.cts.mocks.StubStudent;

public class TesteGrupaMock {

	@Test
	public void testAdaugaStudent() {
		IStudent student = new DummyStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		
		assertEquals("Adaugare student", 1, grupa.getStudenti().size());;
	}
	
	@Test
	public void testGetPromovabilitateStubStudent() {
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(new StubStudent());
		grupa.adaugaStudent(new StubStudent());
		
		assertEquals(1,  grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testGetPromovabilitateFakeStudent() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<8;i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}

}
