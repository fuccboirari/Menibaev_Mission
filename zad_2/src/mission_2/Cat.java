package mission_2;

public class Cat extends Animal {

    private String one;

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    public Cat() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat животное спит");
    }
}
