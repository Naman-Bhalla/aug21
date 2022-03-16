package designpatterns.factory.abstractfactory;

// interface of ONLY factory methods
// abstract factory interface
public interface DatabaseElements {
    /**
     * Return an object of corresponding query in the
     * implementation. => Factory Method
     * @return
     */
    Query getQuery();

    Connection getConnection();

    Transaction getTransaction();
}

// Adapter
// Decorator
// Strategy
// Observer