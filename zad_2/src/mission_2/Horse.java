package mission_2;

public class Horse extends Animal {

    private String three;

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    public Horse() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse животное спит");
    }
}
