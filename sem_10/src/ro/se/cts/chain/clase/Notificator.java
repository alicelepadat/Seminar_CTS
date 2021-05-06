package ro.se.cts.chain.clase;

public abstract class Notificator {
	private Notificator succesor;
	
	public Notificator getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}

	public abstract void trimiteNotificare(Client client, String text);
}
