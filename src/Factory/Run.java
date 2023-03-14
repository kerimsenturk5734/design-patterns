package Factory;

public class Run {
    public static void main(String[] args) {
        AbstractConnector connector=ConnectorFactory
                .getInstance(SERVER_TYPE.MYSQL,"northwind","deneme123","123456","127.0.0.1",8080);

        connector.open();
        connector.close();

        connector=ConnectorFactory
                .getInstance(SERVER_TYPE.SQLSERVER,"northwind","deneme123","123456","127.0.0.1",8080);

        connector.open();
        connector.close();

    }
}
