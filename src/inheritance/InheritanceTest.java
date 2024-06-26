package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        HelloWorldService helloWorldService = new HelloWorldService();
        String greet = helloWorldService.sayHi();

        System.out.println(greet);

        ArunHelloWorldService arunHelloWorldService = new ArunHelloWorldService();
        String arunGreet = arunHelloWorldService.sayHi();

        System.out.println(arunGreet);
    }
}
