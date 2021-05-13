package ro.ase.cts.observer.clase;

public class Manager extends ManagerSalaDeSport {

	public Manager() {
		super();
	}
	
	public void anuntaMeci(String tip) {
		super.notificaObservatori("Va avea loc un meci de " + tip);
	}
	
}
