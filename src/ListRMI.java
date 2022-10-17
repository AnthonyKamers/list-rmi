import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

public class ListRMI<E> extends UnicastRemoteObject implements ListInterface {
    LinkedList<E> list;

    public ListRMI() throws RemoteException {
        list = new LinkedList<>();
    }

    @Override
    public void add(int index, Object value) {
        list.add(index, (E) value);
    }

    @Override
    public E get (int index) {
        return list.get(index);
    }

    @Override
    public E remove(int index) {
        return list.remove(index);
    }

    @Override
    public int size() {
        return list.size();
    }
}
