package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();
        
        Person person1 = new Person("Giorgi", "Kharatishvili", "12345");
        Person person2 = new Person("Maia", "Imedashvili", "67890");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Staff after adding:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }

        factory.deletePerson(person1);

        System.out.println("Staff after deleting Giorgi Kharatishvili:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }
    }
}