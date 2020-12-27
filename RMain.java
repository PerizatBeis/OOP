package com.company;

public class RMain {
    public static void main(String[] args){

        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle has length of "
                + r1.getLength() + " and width of " + r1.getWidth() + "its perimeter = " + r1.getPerimeter() + " and area = " + r1.getArea());
        Rectangle r2 = new Rectangle(1f,5f);
        System.out.println("The rectangle has length of "
                + r2.getLength() + " and width of " + r2.getWidth() + "its perimeter = " + r2.getPerimeter() + " and area = " + r2.getArea());
        Rectangle r3 = new Rectangle(2f,3f);
        System.out.println(r3.toString());
    }
}
