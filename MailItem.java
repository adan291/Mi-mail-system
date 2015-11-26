
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

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String froms,String tos,String messages)
    {
        from = froms;
        to = tos;
        message = messages;
    }

   /**
     * getter
     */
    public String getFrom()
    {
        return from;
    }
    
    /**
     * getter
     */
    public String getTo()
    {
       return to;
    }
    
    /**
     * getter
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * print
     */
    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }
}
