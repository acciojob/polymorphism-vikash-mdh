package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.Product(10, 20);
        int ans1 = p.Product(10,20,30);
        double ans3 = p.product(1.0,2.0);
        System.out.println(ans+" "+ ans1+" "+ans3);

    }
   static class Product{
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

}