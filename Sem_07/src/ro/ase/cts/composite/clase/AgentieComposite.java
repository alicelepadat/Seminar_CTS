package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite implements ISediu {
	
	private List<ISediu> listaSedii;

	
	public AgentieComposite() {
		super();
		listaSedii = new ArrayList<>();
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Descriere agentie");
		
		for(ISediu sediu : listaSedii) {
			sediu.afiseazaDescriere();
		}
	}

	@Override
	public void adaugaNod(ISediu sediu) {
		listaSedii.add(sediu);
	}

	@Override
	public void stergeNod(ISediu sediu) {
		listaSedii.remove(sediu);
		
	}

	@Override
	public ISediu getNod(int poz) {
		return listaSedii.get(poz);
	}

}
