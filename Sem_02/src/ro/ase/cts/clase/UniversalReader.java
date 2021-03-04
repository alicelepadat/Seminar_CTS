package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.readers.Reader;

public class UniversalReader {

	// TODO punct de legatura intre readere
	public static List<Aplicant> readAplicants(Reader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants();
	}
}
