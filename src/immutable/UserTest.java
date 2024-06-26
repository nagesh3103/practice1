package immutable;

public class UserTest {
    public static void main(String[] args) {
        User ref1 = new User("raj","raj123","abcd");
        User ref2 = new User("raj","raj123","abcd","developer");
        System.out.println(ref1);
        System.out.println(ref2);
    }
}
