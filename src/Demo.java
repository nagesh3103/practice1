public class Demo {
    public Demo(int roll, String name) {
        this.rollNumber = roll;
        this.name = name;
    }

    public void test(){
        System.out.println("hello world");
    }
    int rollNumber;
    String name;

    public static void main(String[] args) {
Demo demo =new Demo(123,"sudheer");
demo.test();
        System.out.println(demo.rollNumber+"  "+demo.name);
    }


}