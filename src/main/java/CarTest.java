public class CarTest {
    public static void main(String[] args) {
        Car previousModel = new Car("Volvo XC40", 180, false, 'C', 1.6f, null);
        Car c = new Car("Volvo XC60", 250, false, 'D', 2.0f, previousModel);
        System.out.println(c);
    }
}
