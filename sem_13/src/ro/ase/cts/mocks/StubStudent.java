package ro.ase.cts.mocks;

import java.util.List;

import ro.ase.cts.junit.clase.IStudent;

public class StubStudent implements IStudent {

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return "Gigel";
	}

	@Override
	public void setNume(String nume) {
		
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		
	}

	@Override
	public float calculeazaMedie() {
		return 8.5f;
	}

	@Override
	public int getNota(int index) {
		return 8;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
