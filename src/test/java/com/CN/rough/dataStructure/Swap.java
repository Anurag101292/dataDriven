package com.CN.rough.dataStructure;

public class Swap
{
    int a, b;

    public void swapNum(Swap stn)
    {
     //   int temp;
       // temp = stn.a;
       // stn.a = stn.b;
      //  stn.b = temp;
        //Another approach
        stn.a=stn.a+stn.b;
        stn.b=stn.a-stn.b;
        stn.a=stn.a-stn.b;
    }
    public static void main(String args[])
    {
        Swap sn= new Swap();
        int a=2,b=3;
        sn.a =a;
        sn.b =b;
        sn.swapNum(sn);
        System.out.println("After swapping: a= " + sn.a + ", b= " + sn.b);
    }
}