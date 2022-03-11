package designpatterns.factory.abstractfactory;

import javax.xml.crypto.Data;

public class MySQLDatabaseEleemnts implements DatabaseElements {

    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }

    @Override
    public Transaction getTransaction() {
        return new MySQLTransaction();
    }
}
