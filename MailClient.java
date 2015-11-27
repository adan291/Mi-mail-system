
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    private MailServer server;
    private String user;
    

    /**
     * Constructor para objetos de la calse mailclient
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }

    /**
     * Metodo para devolver mail.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Decir o no si hay mail.
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No hay nuevos mails.");
        }
        else {
            item.print();
        }
    }
    
    /**
     * Metodo que permite escribir un mensaje al usuario 
     * Email enviado que pasa por 
     * el servidor .
     * 
     */
    public void sendMailItem(String to, String subject, String message)
    {
        MailItem item = new MailItem(user, to, subject, message);
        server.post(item);
    }
    
    public void howManyMailItems()
    {
        int contador = server.howManyMailItems(user);
        System.out.println("Correos pendientes:" + contador);
    }
    
    public void getNextMailItemAndSendAutomatic()
    {
       
     
            
    }
}
