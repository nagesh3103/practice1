package constructorChaining;

public class ABCCar {
    private String color;
    private String dashBoard;
    private String wheel;
    private String engine;

    @Override
    public String toString() {
        return "ABCCar{" +
                "color='" + color + '\'' +
                ", dashBoard='" + dashBoard + '\'' +
                ", wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public ABCCar(String color, String dashBoard, String wheel){
        this(color,dashBoard,wheel,"2000");
    }
    public ABCCar(String color,String dashBoard,String wheel,String engine){
        this.color=color;
        this.dashBoard=dashBoard;
        this.wheel=wheel;
        this.engine=engine;
    }

    public String getColor() {
        return color;
    }

    public String getDashBoard() {
        return dashBoard;
    }

    public String getWheel() {
        return wheel;
    }

    public String getEngine() {
        return engine;
    }
}
