package constructorChaining;

public class ABCCarTest {
    public static void main(String[] args) {
        ABCCar ref1 = new ABCCar("blue","black","alloy","");
        ABCCar ref2 = new ABCCar("blue","black","alloy");
        System.out.println(ref1);
        System.out.println(ref2);
    }
}
