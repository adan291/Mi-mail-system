
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    //Emisor
    private String from;
    //Receptor
    private String to;
    //mensaje
    private String message;
    //Assunto
    private String subject;

   /**
    * Constructor para objetos de la clase mailitem
   */
   public MailItem(String from,String to,String message, String subject)
   {
       this.from = from;
       this.to = to;
       this.message = message;
       this.subject = subject;
   }

   /**
     * Devuelve el emisor
     */
    public String getFrom()
    {
        return from;
    }
    
    /**
     * Devuelve al receptor
     * 
     */
    public String getTo()
    {
       return to;
    }
    
     /**
     * Devuelve el emisor
     */
    public String getSubject()
    {
        return subject;
    }
 
    /**
     * Entrega o da el mensaje
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Pone el texto from, to , mensaje y con ellos
     * quien es el receptor emisor y cual es el
     * mensaje
     */
    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}
