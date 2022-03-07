public class Client {


    public static void main(String[] args) {
        Animal a = new Animal();
        a = new Cat();
        a= new Dog();
        a.walk();
//        a.bark();
        // Dog IS-A animal
        // false: Animal IS-A dog
        a.age = 13;
        a.lifeSpan = 15;

        // Java: Every datatype has a default value
        // int -> 0
        // boolean -> false
        // object -> null

        Dog d = new Dog();
        d.walk();
        d.age = 10;
        d.lifeSpan = 14;

        Labrador lab = new Labrador();
        lab.walk();


    }
}

// Project Building -> Debugging
// 18 classes
// - Head First Design Patterns
// - Clean Code