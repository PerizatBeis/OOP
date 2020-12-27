package com.company;
public class BMain {
    public static void main(String[] args){
        Ball b1=new Ball(14882,2155,75,4,8);

        System.out.println(b1.toString());
        b1.move();
        System.out.println(b1.toString());

        b1.reflectHorizontal();
        System.out.println(b1.toString());
        System.out.println(b1.getxDelta());
        b1.reflectVertical();
        System.out.println(b1.toString());

    }
}
