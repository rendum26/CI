import java.rmi.*;

public interface StringConcat extends Remote {
    public String concat(String s1, String s2) throws RemoteException;
}