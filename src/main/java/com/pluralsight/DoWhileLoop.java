package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        String name = "I love Java";
        do {
            System.out.println(name);
            count++;
        } while(count < 5);
    }
}
