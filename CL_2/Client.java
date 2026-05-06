import java.rmi.*;

public class Client {
    public static void main(String args[]) {
        try {
            StringConcat obj = (StringConcat) Naming.lookup("rmi://localhost/StringService");

            String result = obj.concat("Ayush ", "Waghchoure");

            System.out.println("Concatenated String: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}