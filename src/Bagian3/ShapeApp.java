package Bagian3;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectable = new Rectangle();
        System.out.println(rectable.getCorner());
        System.out.println(rectable.getParentCorner());
    }
}
