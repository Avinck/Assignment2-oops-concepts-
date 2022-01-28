public class Shape {
    public static void main(String[] args) {
        Shapes r = new Rectangle();
        r.draw();
    }
}
    abstract class Shapes{
    abstract void draw();
    }
    class Rectangle extends Shapes{
    void draw(){
        System.out.println("Rectangle");
    }
    }
    class line extends Shapes{
    void draw(){
        System.out.println("line");
    }
    }
    class cube extends Shapes{
    void draw(){
        System.out.println("cube");
    }
    }
