import java.rmi.*;
public class ClientRequest
{
    public static void main(String args[])
    {
        String answer,value="Bini Here";
        try
        {
            // lookup method to find reference of remote object
            Search access =
                    (Search)Naming.lookup("rmi://localhost:1900"+
                            "/find_bini");
            answer = access.query(value);
            System.out.println("Article on " + value +
                    " " + answer+" at GeeksforGeeks");
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}