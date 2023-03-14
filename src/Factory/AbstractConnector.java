package Factory;

public abstract class AbstractConnector {
    private String databaseName;
    private String username;
    private String password;
    private String IP;
    private int port;

    protected AbstractConnector(String databaseName, String username, String password, String IP, int port) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
        this.IP = IP;
        this.port = port;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public abstract boolean open();
    public abstract boolean close();

    @Override
    public String toString() {
        return "AbstractConnector{" +
                "databaseName='" + databaseName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", IP='" + IP + '\'' +
                ", port=" + port +
                '}';
    }
}
