package com.ranajit;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        swap_num();
    }
    static int a, b;
    public static void swap_num(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("before swap the number "+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap the number "+a+" "+b);
        input.close();
    }

}
