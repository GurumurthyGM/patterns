package creational.builder;

import java.time.LocalDate;

/** When to Use
 * Object has many optional fields or configurations
 * Object construction is complex
 * You want immutability
 * You need different representations of the same object
 * Avoid telescoping constructors
 */

public class Person {
    // Fields are final for immutability
    private final String firstName;
    private final String midName;
    private final String lastName;
    private final LocalDate dob;
    private final String email;
    private final String phone;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.midName = builder.middleName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.email = builder.email;
        this.phone = builder.phone;
    }


    @Override
    public String toString() {
        return "Person: { firstName : " + firstName + ", midName : " + midName
                + ", lastName : " + lastName + ", dob : " + dob  + ", email : "
                + email + ", phone : " + phone + "}";

    }


    public static class PersonBuilder{
        private final String firstName;
        private String middleName;
        private String lastName;
        private LocalDate dob;
        private String email;
        private final String phone;

        public PersonBuilder(String firstName, String phone){
            if(firstName == null || phone == null){
                throw new IllegalArgumentException("firstName and phone cannot be null");
            }
            this.firstName = firstName;
            this.phone = phone;
        }

        public PersonBuilder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder dob(LocalDate dob){
            this.dob = dob;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


}
