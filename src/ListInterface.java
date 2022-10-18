import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ListInterface extends Remote {
    public void add(int index, int value) throws RemoteException;
    public int get (int index) throws RemoteException;
    public int remove(int index) throws RemoteException;
    public int size() throws RemoteException;
}
