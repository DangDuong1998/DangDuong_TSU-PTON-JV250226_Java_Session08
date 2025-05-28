package bt03;

public class Square implements Colorable{
    private double side;
    private String color;
    public Square(double side){
        this.side = side;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }
}
