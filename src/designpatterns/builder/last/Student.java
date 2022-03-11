package designpatterns.builder.last;

import java.security.InvalidParameterException;

public class Student {
    private String name;
    private String email;
    private String phone;
    private String pass;
    private String address;
    private int age;

    private Student() {}

    private Student(Builder builder) {
        this.address = builder.address;
        this.age = builder.age;
        this.email = builder.email;
        this.name = builder.name;
        this.pass = builder.pass;
        this.phone = builder.phone;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String email;
        private String phone;
        private String pass;
        private String address;
        private int age;

        private Builder() {}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPass(String pass) {
            this.pass = pass;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student validateAndBuild() throws RuntimeException {
            if (this.age < 18) {
                throw new InvalidParameterException();
            }

            return new Student(this);
        }

        public Student build() {
            return new Student(this);
        }
    }
}


// Student.Builder