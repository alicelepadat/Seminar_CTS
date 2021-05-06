package ro.se.cts.chain.clase;

public class NotificatorSMS extends Notificator {

	@Override
	public void trimiteNotificare(Client client, String text) {
		if(client.getNrTelefon()!=null) {
			System.out.println("Trimitere SMS catre " + client.getNume() + ", mesaj: " + text);
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
