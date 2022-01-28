package com.Capgemini;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getSalary();
        Manager m = new Manager();
        e.getSalary();
        Labour 1 = new Labour();
        e.getSalary();
    }
}
    class Employee{
    Scanner input = new Scanner(System.in);
    int s = 20000;
    void getSalary(){
        System.out.println("salary is the Employee is:"+ s);
     }
    }
    class Manager extends Employee{
        Scanner input = new Scanner(System.in);
        void getSalary(){
            System.out.println("Enter the incentives:");
            int i = input.nextInt();
            System.out.println("total salary of Manager is:"(super.s+i));
        }
    }
    class labour extends Employee{
    Scanner input = new Scanner(System.in);
    void getSalary(){
        System.out.println("Enter the extra time of labour in month:");
        int i = input.nextInt();
        int x = super.s/12;
        int y = x*1;
        System.out.println("Total salary of labour is:"+(super.s+y));
    }
    }
