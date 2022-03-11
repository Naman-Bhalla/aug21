package designpatterns.factory.normalfactory;

public class DatabaseFactory {
    public static Database getDatabaseForConfigValue(String configValue) {
        if (configValue.equals("postgre")) {
            return  new PostgreSQLDatabase();
        }

        if (configValue.equals("mysql")) {
            return new MySQLDatabase();
        }

        return null;
    }
}
