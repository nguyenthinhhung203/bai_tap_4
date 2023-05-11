package day4.bt4;

public class HinhChuNhat implements GeometricObject{

    private double width ;
    private double length ;


    public HinhChuNhat(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2 ;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "width=" + width +
                ", length=" + length +
                ", DienTich = " + getArea() +
                ", ChuVi = " + getPerimeter() +
                '}';
    }
}
