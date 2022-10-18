import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

public class ListRMI extends UnicastRemoteObject implements ListInterface {
    LinkedList<Integer> list;

    public ListRMI() throws RemoteException {
        list = new LinkedList<>();
    }

    @Override
    public void add(int index, int value) throws RemoteException {
        list.add(index, value);
    }

    @Override
    public int get (int index) throws RemoteException {
        return list.get(index);
    }

    @Override
    public int remove(int index) throws RemoteException {
        return list.remove(index);
    }

    @Override
    public int size() throws RemoteException {
        return list.size();
    }
}
