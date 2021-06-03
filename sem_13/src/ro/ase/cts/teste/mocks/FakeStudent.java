package ro.ase.cts.teste.mocks;

import java.util.List;

import ro.ase.cts.junit.clase.IStudent;

public class FakeStudent implements IStudent {

	private String numeStudent;
	private List<Integer> listaNote;
	private float medie;
	private int nota;
	private boolean areRestante;
	
	

	public void setNumeStudent(String numeStudent) {
		this.numeStudent = numeStudent;
	}

	public void setListaNote(List<Integer> listaNote) {
		this.listaNote = listaNote;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void setAreRestante(boolean areRestante) {
		this.areRestante = areRestante;
	}

	@Override
	public String getNume() {
		return numeStudent;
	}

	@Override
	public void setNume(String nume) {
		setNumeStudent(nume);
	}

	@Override
	public List<Integer> getNote() {
		return listaNote;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return medie;
	}

	@Override
	public int getNota(int index) {
		return nota;
	}

	@Override
	public boolean areRestante() {
		return areRestante;
	}

}
