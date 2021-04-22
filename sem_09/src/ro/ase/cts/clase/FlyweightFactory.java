package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, IFlyweight> client;

	public FlyweightFactory() {
		this.client = new HashMap<>();
	}

	public IFlyweight getFlyweight(String nrTelefon) {
		if(!this.client.containsKey(nrTelefon)) {
			this.client.put(nrTelefon, new Client("", nrTelefon, ""));
		}
		return this.client.get(nrTelefon);
	}
}
