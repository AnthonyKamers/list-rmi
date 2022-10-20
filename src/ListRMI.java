import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

public class ListRMI<E> extends UnicastRemoteObject implements ListInterface<E> {
    LinkedList<E> list;

    public ListRMI() throws RemoteException {
        list = new LinkedList<>();
    }

    @Override
    public void add(int index, E value) throws RemoteException {
        list.add(index, value);
    }

    @Override
    public E get (int index) throws RemoteException {
        return list.get(index);
    }

    @Override
    public E remove(int index) throws RemoteException {
        return list.remove(index);
    }

    @Override
    public int size() throws RemoteException {
        return list.size();
    }
}
