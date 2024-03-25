package no.dependency.injection;

public class ClientTest {
	public static void main(String[] args) {

		String mensagem = "Ola Alex! Mostra um exemplo de DI.";
		String email = "alex@ifpb.edu.br";
		String telefone = "83988889999";

		MyApplication app = new MyApplication();

		// Configurando EmailService
		MessageService emailService = new EmailService();
		app.setMessageService(emailService);
		app.processMessages(mensagem, email);

		// Configurando SMSservice
		MessageService smsService = new SMSservice();
		app.setMessageService(smsService);
		app.processMessages(mensagem, telefone);
	}
}
