public abstract class Car {

    private String carBrand;
    private char carClass;
    private double carWeight;
    private Engine engine = new Engine();

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public char getCarClass() {
        return carClass;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public String getEngineManufacturer() {

        return engine.getManufacturer();
    }

    public void setEngineManufacturer(String engineManufacturer) {

        this.engine.setManufacturer(engineManufacturer);
    }

    public int getEnginePower() {

        return engine.getPower();
    }

    public void setEnginePower(int enginePower) {

        this.engine.setPower(enginePower);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {

        System.out.println("Поворот направо");
    }

    public void turnLeft() {

        System.out.println("Поворот налево");
    }
}
