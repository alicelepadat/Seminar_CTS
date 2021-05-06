package ro.se.cts.chain.main;

import ro.se.cts.chain.clase.*;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Ion", null, null);
		Client client2 = new Client("Ana", "07238654", null);
		Client client3 = new Client("Maria", "07333", "maria@gmail.com");
		
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		notificatorSMS.setSuccesor(notificatorEmail);
		notificatorSMS.trimiteNotificare(client2, "Mesaj");
	}
}
