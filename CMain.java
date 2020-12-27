package com.company;

public class CMain {
    public static void main(String[] args) {

        Circle2 c1 = new Circle2();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea() + " and circumference of " + c1.getCircumference());
        Circle2 c2 = new Circle2(5.5);
        System.out.println(c2);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea() + " and circumference of " + c2.getCircumference());


    }
}
