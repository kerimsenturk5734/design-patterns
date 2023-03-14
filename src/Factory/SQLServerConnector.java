package Factory;

class SQLServerConnector extends AbstractConnector{
    protected SQLServerConnector(String databaseName, String username, String password, String IP, int port) {
        super(databaseName, username, password, IP, port);
    }

    @Override
    public boolean open() {
        String connStr="Server="+getIP()+"Port="+getPort()+";Database="+getDatabaseName()+";Uid="+getUsername()+";Pwd="+getPassword()+";";
        System.out.println("SQL Server Bağlantı Açıldı");
        System.out.println(this);
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("SQL Server Bağlantı Kapatıldı");
        return true;
    }
}
