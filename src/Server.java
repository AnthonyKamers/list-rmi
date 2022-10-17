import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public Server() {
        try {
            Naming.rebind("ListRMI", new ListRMI<Integer>());
        } catch (MalformedURLException | RemoteException e) {
            System.out.println("It wasn't possible to start ListRMI");
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
