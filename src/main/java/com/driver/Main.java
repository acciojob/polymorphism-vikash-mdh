package com.driver;

public class Main {
    public static class Product{
        public int Product(int x, int y) {
            return x*y;
        }
        public int Product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }


    public static void main(String[] args) {
        Product p = new Product();
       double ans = p.product(15.1, 15.2);
       int ans1 = p.Product(10,20);
       int ans3 = p.Product(10,20,30);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans3);

    }


}