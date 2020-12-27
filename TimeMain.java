package com.company;
public class TimeMain {
    public static void main(String[] args){
        Time t1 =new Time(12,4,56);
        System.out.printf("%02d:",t1.getHour());
        System.out.printf("%02d:",t1.getMinute());
        System.out.printf("%02d%n", t1.getSecond());
        System.out.println(t1.toString());
        System.out.println(t1.nextSecond());
        System.out.println(t1.prevSecond());

    }
}
