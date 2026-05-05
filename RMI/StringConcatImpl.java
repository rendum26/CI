import java.rmi.*;
import java.rmi.server.*;

public class StringConcatImpl extends UnicastRemoteObject implements StringConcat {

    public StringConcatImpl() throws RemoteException {
        super();
    }

    public String concat(String s1, String s2) throws RemoteException {
        return s1 + s2;
    }
}