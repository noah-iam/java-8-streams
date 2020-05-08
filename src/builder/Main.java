package builder;

 class Person {
    String name,street,city;
    String company,salary;

     @Override
     public String toString() {
        return "{ Person:" + name + ", Street: " + street
                + ", city: " + city + ", company: "+ company +
                ", salary: " + salary +" }";
     }
 }

class PersonBuilder {
    protected Person person = new Person();

    PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }
    PersonWorkBuilder work(){
        return new PersonWorkBuilder(person);
    }

    Person build(){
         return person;
    }
}

class PersonAddressBuilder extends PersonBuilder{

    PersonAddressBuilder(Person person){
       this.person = person;
    }
    PersonAddressBuilder at(String street){
       person.street = street;
       return this;
    }
    PersonAddressBuilder in(String city){
        person.city = city;
        return this;
    }
}

class PersonWorkBuilder extends PersonBuilder{

    PersonWorkBuilder(Person person){
        this.person = person;
    }
    PersonWorkBuilder at(String company){
        person.company = company;
        return this;
    }
    PersonWorkBuilder earn(String salary){
        person.salary = salary;
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new PersonAddressBuilder(new Person()).
                lives()
                    .at("Cyber Hub")
                    .in("Gurgaon")
                .work()
                    .at("Expedia")
                    .earn("123000").build();
        System.out.println(p.toString());
    }
}
