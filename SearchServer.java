import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SearchServer {

    public static void main(String args[])
    {
        try
        {
            // Create an object of the interface
            // implementation class
            Search obj = new SearchQuery();


            LocateRegistry.createRegistry(1900);


            Naming.rebind("rmi://localhost:1900"+
                    "/find_bini",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}

