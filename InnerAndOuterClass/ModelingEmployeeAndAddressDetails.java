/*Assignment 02 :
---------------
Title :- Modeling Employee and Address Details

Create a BLC class Address

Fields :-
------------
Implement a class with private fields for street and city.

Constructor :-
--------------
Provide a constructor to initialize these fields.

getter() & toString() method :-
-------------------------------
Implement getter methods and a toString() method to display the address.

Create another BLC class Person.


Fields :-
--------
Implement a class with private fields for name and an Address object.

Constructor :-
--------------
Provide a constructor to initialize name and address.

method getPersonDetails()
--------------------------
Implement a method to display the person's name and address.

Create an ELC class called Test

Implement a main method :-
---------------------------
-> Instantiate an Address object with sample data.
-> Instantiate a Person object using the Address object created earlier.
-> Print the person's details using the method in the Person class.*/

void main() {
    String street = IO.readln("Enter Street: ");
    String city = IO.readln("Enter City: ");
    String name = IO.readln("Name: ");

    Address address = new Address(street, city);
    Person person = new Person(name, address);

    person.getPersonalDetails();

}

class Address{
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + getStreet() + '\'' +
                ", city='" + getCity() + '\'' +
                '}';
    }
}

class Person{
    private String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void getPersonalDetails(){
        IO.println("Name: "+name+" Address: "+address);
    }
}

