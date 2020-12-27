package com.company;
public class DMain {
    public static void main(String[] args){
        Date d1 = new Date(5,4,1998);
        System.out.printf("%02d/",d1.getDay());
        System.out.printf("%02d/",d1.getMonth());
        System.out.printf("%02d%n", d1.getYear());

    }
}
