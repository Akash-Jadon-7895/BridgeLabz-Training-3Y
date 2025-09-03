public class Circle {
    int radius;
    Circle(){

    }
    Circle(int radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle();
        circle2.radius = 10;
        System.out.println("Circle 1 radius: " + circle1.radius);
        System.out.println("Circle 2 radius: " + circle2.radius);
    }
}
