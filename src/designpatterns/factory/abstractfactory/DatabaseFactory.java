package designpatterns.factory.abstractfactory;

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

// Abstract Factory and Facotry Methods: Getting correct type
// of internal attribute
// Factory: Get correct class out of all the subclasses