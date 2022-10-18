import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server<E> {
    public Server() {
        try {
            Naming.rebind("ListRMI", new ListRMI());
        } catch (MalformedURLException | RemoteException e) {
            System.out.println("It wasn't possible to start ListRMI - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
