public class Car {
    private String name;
    private int horsePower;
    private boolean isElectric;
    private char carClass;
    private float engineCapacity;
    private Car previousModel;

    public Car(String name, int horsePower, boolean isElectric, char carClass, float engineCapacity, Car previousModel) {
        this.name = name;
        this.horsePower = horsePower;
        this.isElectric = isElectric;
        this.carClass = carClass;
        this.engineCapacity = engineCapacity;
        this.previousModel = previousModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public char getCarClass() {
        return carClass;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car getPreviousModel() {
        return previousModel;
    }

    public void setPreviousModel(Car previousModel) {
        this.previousModel = previousModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", isElectric=" + isElectric +
                ", carClass=" + carClass +
                ", engineCapacity=" + engineCapacity +
                ", previousModel=" + previousModel +
                '}';
    }
}
