package no.dependency.injection;
/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication {
	// classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
	// Isso leva à "dependência codificada"
	private MessageService messageService;

	public void setMessageService(MessageService messageService){
		this.messageService = messageService;
	}

	public void processMessages(String msg, String rec){
		//aqui teríamos algumas mensagens de validação, manipulação da lógica, etc.
		this.messageService.sendMessage(msg, rec);
	}

}
