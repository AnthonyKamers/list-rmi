import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    Scanner in;
    ListInterface<Integer> list;

    public Client() {
        in = new Scanner(System.in);

        try {
            list = (ListInterface<Integer>) Naming.lookup("rmi://127.0.0.1/ListRMI");
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void execute() {
        String command;
        int index;
        int value;

        System.out.println("""
        Type a command:
            - add <index> <value>
            - get <index>
            - remove <index>
            - size
        """);

        while (true) {
            try {
                command = in.next();
                boolean mustBreak = false;

                switch (command) {
                    case "add" -> {
                        index = in.nextInt();
                        value = in.nextInt();
                        list.add(index, value);
                        System.out.println("Item has been added\n");
                    }
                    case "get" -> {
                        index = in.nextInt();
                        System.out.println("Get: " + list.get(index) + "\n");
                    }
                    case "remove" -> {
                        index = in.nextInt();
                        System.out.println("Item has been removed: " + list.remove(index) + "\n");
                    }
                    case "size" -> System.out.println("List size: " + list.size() + "\n");
                    default -> mustBreak = true;
                }

                if (mustBreak) {
                    System.out.println("Exiting program\n");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Something wrong happened: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.execute();
    }
}
