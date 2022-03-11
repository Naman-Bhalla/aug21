package designpatterns.factory.normalfactory;

import javax.xml.crypto.Data;

public class MySQLDatabase implements Database {
    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public int getConnectionLimit() {
        return 0;
    }

    @Override
    public String getDescriptor() {
        return null;
    }

    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }
}
