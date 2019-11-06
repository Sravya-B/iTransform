package com.sravya.springAOP01;

public class App 
{
    public static void main( String[] args )
    {
   ProxyInternetAccess proxy=new ProxyInternetAccess();
   proxy.internetAccessTo("java.com");
   proxy.internetAccessTo("angular.com");
    }
}
