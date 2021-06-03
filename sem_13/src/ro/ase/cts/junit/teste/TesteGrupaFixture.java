package ro.ase.cts.junit.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;
import ro.ase.cts.junit.clase.Student;
import ro.ase.cts.junit.teste.categorii.IGetPromovabilitateCategory;
import ro.ase.cts.junit.teste.categorii.ITesteUrgenteCategory;

public class TesteGrupaFixture {
	private Grupa grupa;
	
	@Before
	public void setupGrupa() {
		grupa = new Grupa(1081);
		for(int i=0;i<400;i++) {
			IStudent student = new Student();
			student.adaugaNota(9);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<100;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout = 500)
	@Category({IGetPromovabilitateCategory.class, ITesteUrgenteCategory.class})
	public void testGetPromovabilitatePerformanta() {
		grupa.getPromovabilitate();
	}

}
