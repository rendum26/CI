import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String args[]) {
        try {
            StringConcatImpl obj = new StringConcatImpl();

            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://localhost/StringService", obj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}