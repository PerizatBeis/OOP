package com.company;
public class TMain {
    public static void main(String[] args){
        TheAccount a1 = new TheAccount("workk", "Den");
        System.out.println(a1.credit(125));

        System.out.println(a1.toString());
        a1.debit(25);
        System.out.println(a1.toString());
        a1.debit(452);
        System.out.println(a1.toString());
        a1.transferTo(a1,45);
        System.out.println(a1.toString());
        TheAccount a2 = new TheAccount("hgyhg","Peppa",456);
        System.out.println(a2.toString());
        a2.transferTo(a2,45);
        System.out.println(a2.toString());

    }
}
