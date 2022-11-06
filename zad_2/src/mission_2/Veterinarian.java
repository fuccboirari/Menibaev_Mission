package mission_2;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.printf("Name: %s, Food: %s, Location: %s%n",animal.getName(), animal.getFood(), animal.getLocation());
    }
}
