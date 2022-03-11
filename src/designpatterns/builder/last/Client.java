package designpatterns.builder.last;

public class Client {
    public static void main(String[] args) {
        Student s;

        try {
            // new Student(18, "abc", "naman@scaler.com")
            s = Student.getBuilder()
                    .setAge(18)
                    .setPass("abc")
                    .setEmail("naman@scaler.com")
                    .setName("Naman")
                    .build();
        } catch (RuntimeException exception) {
            System.out.println("Some aruments invalid");
        }

//        Student b = Student.getBuilder()
//                .setAge(19)
//                .
        // Student.Builder

        s = Student.getBuilder().setAge(18).build();

    }
}
