package designpatterns.factory.abstractfactory;

import javax.xml.crypto.Data;

public class PostgreSQLDatabaseElements implements DatabaseElements {

    @Override
    public Query getQuery() {
        return new PostgreSQLQuery();
    }

    @Override
    public Transaction getTransaction() {
        return new PostgreSQLTransaction();
    }

    @Override
    public Connection getConnection() {
        return new PostgreSQLConnection();
    }
}
