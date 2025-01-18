class Person {
    private String name;
    private int age;

    // Parameterized constructor of person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor of person class
    public Person(Person another) {
        this.name = another.name;
        this.age = another.age;
    }
     // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Persons {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person(person1);
        person1.displayDetails();
        person2.displayDetails();
    }
}
