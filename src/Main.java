/**
 * @param args
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Dog DogClass = new Dog();

        DogClass.setName("Fred");
        DogClass.setAge(12);
        DogClass.setRace("BullDog");

        System.out.println("The dog status: " + "Name: " + DogClass.getName() + " Age: " + DogClass.getAge() + " Race: " + DogClass.getRace());
    }
}
