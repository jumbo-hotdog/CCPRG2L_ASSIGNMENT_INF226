package Exercise5;

public class App {
    public static void main(String[] args) throws Exception {

        Person me = new Person();

        me.setName("Jo");

        System.out.println(me.getName());

        Son myself = new Son();
        
        System.out.println(myself.surname);
        
        myself.showSurname();
    }
    
}
