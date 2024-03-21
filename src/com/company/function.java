package com.company;
import java.util.Scanner;
public class function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(add(5,4));
        System.out.println(add("Hello","World"));
    }
    static int add(int a,int b)
    {
        return a+b;
    }
    static String add(String a,String b)
    {
        return a+" "+b;
    }
}



