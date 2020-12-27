package com.company;

public class EMain {
    public static void main(String[] args){
        Employee e1 = new Employee(1,"Perizat","Beisenova", 13542);
        System.out.println(e1.toString());
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.getName());
        System.out.println(e1.raiseSalary(57));

    }

}
