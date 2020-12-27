package com.company;
public class TheAccount {
    private String id;
    private String name;
    private int balance = 0;

    public TheAccount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public TheAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        return balance = balance + amount;

    }
    public int debit(int amount){
        if(amount <= balance){
            return balance = balance - amount;
        }
        else
        {
            System.out.println("Amount exceeded");
            return balance;
        }
        //return balance;

    }

    public String toString() {
        return "TheAccount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    public int transferTo( TheAccount another,int amount){
        if(amount <= balance){
            return balance = balance + amount;
        }
        else
        {
            System.out.println("Amount exceeded");
            return balance;
        }
       // return balance;

    }


}
