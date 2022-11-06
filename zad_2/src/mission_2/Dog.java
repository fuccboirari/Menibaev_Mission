package mission_2;

public class Dog extends Animal {

    private String two;

    public Dog(String name, String food, String location) {super(name, food, location);}

    public Dog() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog животное спит");
    }
}
