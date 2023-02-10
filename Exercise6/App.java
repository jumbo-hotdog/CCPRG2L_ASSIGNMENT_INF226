package Exercise6;

public class App {
    public static void main(String[] args) throws Exception {

        GroceryItem item1 = new Diaper();
        item1.name = "Pampers";
        item1.price = 1000;
        item1.showItemName();

        GroceryItem item2 = new Milk();
        item2.name = "Bear Brand";
        item2.price = 500;
        item2.showItemName();

        Cashier c1 = new Cashier();

        c1.checkOut(item1);
        c1.showItemPrice(item1);

        c1.checkOut(item2);
        c1.showItemPrice(item2);

        System.out.println();

        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        double totalAmount = 0.00;
        
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            System.out.println("Item price: " + itemArray[i].price);

            totalAmount = totalAmount + itemArray[i].price;
        }
        System.out.println("\nTotal amount: " + totalAmount);

        Dog myDog = new Dog();
        myDog.eat();
    }
}
