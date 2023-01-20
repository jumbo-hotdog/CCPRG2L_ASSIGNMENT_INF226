package ClassesAndObjects;

public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.attack();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.attack();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.attack();

        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 10;
        archer.intelligence = 5;
        archer.name = "Venti";
        archer.sayMyName();
        archer.attack();

        Weapon sword = new Weapon();

        sword.name = "Alhaitham";
        sword.damage = 8;
        sword.rarity = "Epic";
        sword.add(5);
        sword.add(5);
        System.out.println(sword.weaponInfo());

    }
}
