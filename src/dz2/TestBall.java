package dz2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.1, 2.5);
        Ball b2 = new Ball();
        Ball b3 = new Ball(5.0, 7.0);
        b2.setX(5.0);
        b3.setXY(1.8,7.0);
        System.out.println(b1.toString());
        b1.Move(5.8,8.9);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
