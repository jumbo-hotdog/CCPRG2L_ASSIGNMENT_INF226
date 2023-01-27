package Exercise4;

public class App {
    public static void main(String[] args) throws Exception {

    Person Me = new Person("Josh",19);
    Person Friend = new Person("Drei",19);
    Me.addFriend(Friend);

    Pet Dog = new Pet("Nikki",5,Me);
    Dog.showOwner();

    Person Classmate = new Person("Bianca",19);
    Person Classmate1 = new Person("Alliyah", 19);
    Person Classmate2 = new Person("Nivek", 19);

    Me.addClassmate(Classmate);
    Me.addClassmate(Classmate1);
    Me.addClassmate(Classmate2);

    Car sportsCar = new Car("Ferrari","red",Me);
    sportsCar.showOwner();

    }
}
