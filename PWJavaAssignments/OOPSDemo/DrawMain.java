package test;

interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class DrawMain {
    public static void main(String[] args) {
        Drawable circle = new Circle1();
        circle.draw();

        Drawable rectangle = new Rectangle1();
        rectangle.draw();
    }
}

