package com.company;

public class IMain {
    public static void main(String[] args){
        InvoiceItem i1 = new InvoiceItem("clmlkkk","apple", 12, 4.5);
        System.out.println(i1.getTotal());
        System.out.println(i1.toString());
        i1.setUnitPrice(5.5);
        i1.setQty(5);
        System.out.println(i1.getTotal());
        System.out.println(i1.toString());
    }
}
