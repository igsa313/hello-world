public class Bike {
    String name;
    int prodYear;
    boolean isElectric;
    char bikeClass;
    float bicycleframe;
    boolean isKids;
    int wheelSize;
    char bikeGender;
    float bikePrice;
    Bike previousModel;



    public Bike(String name, int prodYear, boolean isElectric, char bikeClass, float bicycleframe, boolean isKids, int wheelSize, char bikeGender, float bikePrice, Bike previousModel) {
        this.name = name;
        this.prodYear = prodYear;
        this.isElectric = isElectric;
        this.bikeClass = bikeClass;
        this.bicycleframe = bicycleframe;
        this.isKids = isKids;
        this.wheelSize = wheelSize;
        this.bikeGender = bikeGender;
        this.bikePrice = bikePrice;
        this.previousModel = previousModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public char getbikeClass() {
        return bikeClass;
    }

    public void setbikeClass(char bikeClass) {
        this.bikeClass = bikeClass;
    }

    public float getbicycleframe() {
        return bicycleframe;
    }

    public void setBicycleframe(float bicycleframe) {
        this.bicycleframe = bicycleframe;
    }
    public boolean setisKids() {
        return isKids;
    }

    public void setisKids(boolean isKids) {
        this.isKids = isKids;
    }
    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }
    public char getBikeGender() {
        return bikeGender;
    }

    public void setBikeGender(char bikeGender) {
        this.bikeGender = bikeGender;
    }
    public float getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(float bikePrice) {
        this.bikePrice = bikePrice;
    }
    public Bike getPreviousModel() {
        return previousModel;
    }

    public void setPreviousModel(Bike previousModel) {
        this.previousModel = previousModel;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", prodYear=" + prodYear +
                ", isElectric=" + isElectric +
                ", bikeClass=" + bikeClass +
                ", bicycleframe=" + bicycleframe +
                ", isKids=" + isKids +
                ", wheelSize=" + wheelSize +
                ", bikeGender=" + bikeGender +
                ", bikePrice=" + bikePrice +
                ", previousModel=" + previousModel +
                '}';
    }
}
