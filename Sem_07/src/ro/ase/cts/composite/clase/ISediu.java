package ro.ase.cts.composite.clase;

public interface ISediu {
	void afiseazaDescriere();
	void adaugaNod(ISediu sediu) throws Exception;
	void stergeNod(ISediu sediu) throws Exception;
	ISediu getNod(int poz) throws Exception;
}
