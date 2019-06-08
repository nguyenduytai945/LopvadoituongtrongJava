public class xaydunglopFan {
    final static int Slow = 1;
    final static int Medium = 2;
    final static int Fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    xaydunglopFan(){
        speed = Slow;
        on= false;
        radius = 5;
        color = "green";
    }
    public void  setSpeed(int speed){
        this.speed = speed;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getSpeed(){
        String spd = "";
        switch (speed){
            case Slow: spd = "Slow";
            case Medium: spd ="Medium";
            case Fast: spd = "Fast";
        }
        return  spd;
    }
    public boolean isOn(){
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public String toString(){
        if(on==true){
            return " Fan speed: " + getSpeed() + ". Color: " + color +
                    ". Radius: " + radius + "Fan: On";
        }
        else{
            return "Fan color: " + color + ". Radius: " + radius +
                    "Fan: Off";
        }
    }
    public static void main(String[] args) {
        final int Slow = 1;
        final int Medium = 2;
        final int Fast = 3;

        xaydunglopFan fan1 = new xaydunglopFan();
        fan1.setSpeed(Fast);
        fan1.setRadius(10);
        fan1.setColor("pink");
        fan1.turnOn();

        xaydunglopFan fan2 = new xaydunglopFan();
        fan2.setSpeed(Medium);
        fan2.setRadius(5);
        fan2.setColor("green");
        fan2.turnOff();

        System.out.println("Fan1:" + fan1.toString());
        System.out.println("Fan2:" + fan2.toString());
    }
}
