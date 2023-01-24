package ClassesAndObjects;

public class Weapon {
    String name;
    int damage;
    String rarity;

    void add (int addedDamage) {
        int newDamage = this.damage + addedDamage;

        System.out.println(addedDamage + " damage has been added. Total damage is " + newDamage + ".");

        this.damage = newDamage;
    }

    String showNameandRarity () {
        return "Weapon name: " + name + "\n" + "Rarity: " + rarity;
    }
}
