package no.dependency.injection;

public class ClientTest {
	public static void main(String[] args) {

		MyApplication app = new MyApplication();

		// Configurando EmailService
		MessageService emailService = new EmailService();
		app.setMessageService(emailService);
		app.processMessages("Ola Alex! Mostra um exemplo de DI.", "alex@ifpb.edu.br");

		// Configurando SMSservice
		MessageService smsService = new SMSservice();
		app.setMessageService(smsService);
		app.processMessages("Ola Alex! Mostra um exemplo de DI.", "alex@ifpb.edu.br");
	}
}
