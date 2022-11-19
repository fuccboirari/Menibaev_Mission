public class SportCar extends Car {

    private int topSpeed;

    public int getTopSpeed() {

        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {

        this.topSpeed = topSpeed;
    }

    public void start() {

        System.out.println("SportCar поехал");
    }

    public void stop() {

        System.out.println("SportCar остановился");
    }

    public void printInfo() {
        System.out.println("Производитель: " + this.getCarBrand());
        System.out.println("Класс автомобиля: " + this.getCarClass());
        System.out.println("Вес автомобиля, т.: " + this.getCarWeight());
        System.out.println("Мощность мотора, л.с.: " + this.getEnginePower());
        System.out.println("Производитель мотора: " + this.getEngineManufacturer());
        System.out.println("Максимальная скорость, км/ч: " + this.getTopSpeed());
    }
}
