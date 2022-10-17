import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ListInterface<E> extends Remote {
    public void add(int index, E value);
    public E get (int index);
    public E remove(int index);
    public int size();
}
