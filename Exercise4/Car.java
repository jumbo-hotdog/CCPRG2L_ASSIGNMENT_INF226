package Exercise4;

public class Car {
    
        // ATTRIBUTES
        String brand;
        String color;
        Person owner;
    
        // CONSTRUCTORS
        Car(String carBrand, String carColor, Person ownerName) {
            this.brand = carBrand;
            this.color = carColor;
            this.owner = ownerName;
        }
    
        // METHOD
        void showOwner() {
            System.out.println("The " + this.color + " " + this.brand + " car is owned by " + owner.name + ".");
        }
    }

