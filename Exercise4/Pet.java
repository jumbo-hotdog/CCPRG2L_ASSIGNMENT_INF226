package Exercise4;

public class Pet {

    // ATTRIBUTES
    int age;
    String name;
    Person owner;

    // CONSTRUCTORS
    Pet(String petName, int petAge, Person ownerName) {
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;
    }

    // METHOD
    void showOwner() {
        System.out.println("My name is " + this.name + ". My owner's name is " + owner.name + ".");
    }
}
