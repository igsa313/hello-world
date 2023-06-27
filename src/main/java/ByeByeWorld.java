import java.util.Date;

public class ByeByeWorld {
    public static void main(String[] args) {
        Date currentTime = new Date();
        System.out.println("The current time is : " + currentTime);

        Crater greeter = new Crater();
        System.out.println(greeter.sayHello());
    }
}
