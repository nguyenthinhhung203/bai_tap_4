package day4.bt4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> hinh = new ArrayList<>();
        Circle circle = new Circle(4);
        Circle circle1 = new Circle(6);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(4 ,6);
        HinhChuNhat hinhChuNhat1 = new HinhChuNhat(3,6);

        hinh.add(circle);
        hinh.add(circle1);
        hinh.add(hinhChuNhat1);
        hinh.add(hinhChuNhat);


        for (GeometricObject h : hinh) {
            System.out.println(h);
        }


    }
}
