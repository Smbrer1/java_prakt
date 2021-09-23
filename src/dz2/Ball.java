package dz2;

public class Ball {
    private Double x;
    private Double y;

    public Ball(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setXY(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public void Move(Double xDisp, Double yDisp) {
        this.x = x + xDisp;
        this.y = y + yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
