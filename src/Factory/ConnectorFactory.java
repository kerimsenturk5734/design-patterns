package Factory;

public class ConnectorFactory {
    public static AbstractConnector getInstance(SERVER_TYPE serverType,String databaseName, String username, String password, String IP, int port){
        switch (serverType){
            case MYSQL: return new MySQLConnector(databaseName, username, password, IP, port);
            case SQLSERVER: return new SQLServerConnector(databaseName, username, password, IP, port);
            default: return null;
        }
    }
}

enum SERVER_TYPE{
    MYSQL,SQLSERVER
}
