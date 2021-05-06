package ro.se.cts.chain.clase;

public class NotificatorEmail extends Notificator {

	@Override
	public void trimiteNotificare(Client client, String text) {
		if(client.getEmail()!=null) {
			System.out.println("Trimitere email catre " + client.getNume() + ", mesaj: " + text);
		}
		else {
			if(super.getSuccesor()!=null) {
				super.getSuccesor().trimiteNotificare(client, text);
			}
			else {
				System.out.println("Domnule manager, nu avem date de contact pentru clientul " + client.getNume());
			}
		}
	}
	
}
