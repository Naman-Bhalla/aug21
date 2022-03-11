package designpatterns.factory.abstractfactory;

public class CLient {
    public static void main(String[] args) {
        String databaseConfig = "postgre";
        Database db = DatabaseFactory.getDatabaseForConfigValue(
                databaseConfig
        );

        Query query = db.getDatabaseElements().getQuery();
        query.execute();
//
//        if (databaseConfig == "postgre") {
//            db = new PostgreSQLDatabase();
//        } else if (databaseConfig == "mysql") {
//
//        }
    }
}
