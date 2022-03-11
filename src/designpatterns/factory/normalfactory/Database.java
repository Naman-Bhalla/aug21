package designpatterns.factory.normalfactory;

public interface Database {

    String getUrl();
    int getConnectionLimit();
    String getDescriptor();

    /**
     * Return an object of corresponding query in the
     * implementation. => Factory Method
     * @return
     */
    Query getQuery();

//    Connection getConnection();
//
//    Transaction getTransaction();

}
