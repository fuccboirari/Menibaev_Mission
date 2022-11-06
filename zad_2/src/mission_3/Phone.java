package mission_3;

import java.util.Arrays;

class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.printf("\nName: %s", name);
    }

    public void receiveCall(String name, int number) {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Number: %d\n", number);
    }

    public void sendMessage(int... numbersPhone) {
        System.out.println(Arrays.toString(numbersPhone));
    }



    public void printConsole() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public static void printConsole(Phone... phones) {
        for ( Phone phone : phones ) {
            phone.printConsole();
        }
    }
}
