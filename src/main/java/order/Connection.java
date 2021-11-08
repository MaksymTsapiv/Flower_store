package order;

public class Connection {
    private static Connection thisConnection = new Connection();
    private Connection() {

    }
    public static Connection getConnection() {
        return thisConnection;
    }
}