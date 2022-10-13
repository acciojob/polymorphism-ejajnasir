package com.driver;

public class Main {
static class Product{
    Product(){

    }
    public int product(int x,int y)
    {
        return x*y;
    }
    public int product(int x,int y,int z)
    {
        return x*y*z;
    }
    public double product(double x,double y)
    {
        return x*y;
    }
}
public static void main(String args[])
{
    Product p = new Product();
    p.product(4,3);
    p.product(4,3,5);
    p.product(4.0,3.0);

}
}
