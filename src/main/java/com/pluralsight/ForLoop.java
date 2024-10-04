package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
            //r for rocket of course
        int r = 10;
        while (r > 0) {
            System.out.println(r);
            r--;
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
