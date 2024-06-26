package inheritance;

public class ArunHelloWorldService extends HelloWorldService{

    public String sayHi(){
        return super.sayHi()+" Arun";
    }

}
