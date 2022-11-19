public class Lorry extends Car {

    private double tonnage;

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void start() {

        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {

        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Производитель: " + this.getCarBrand());
        System.out.println("Класс автомобиля: " + this.getCarClass());
        System.out.println("Вес автомобиля, т.: " + this.getCarWeight());
        System.out.println("Мощность мотора, л.с.: " + this.getEnginePower());
        System.out.println("Производитель мотора: " + this.getEngineManufacturer());
        System.out.println("Грузоподъемность, т.: " + this.getTonnage());
    }

//    private String carBrand;
//    private char carClass;
//    private double carWeight;
//    private Engine engine;
}
