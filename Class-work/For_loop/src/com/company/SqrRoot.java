package com.company;

public class SqrRoot{

    public static void main(String[] args) {
        int num;
        double sroot, rerr;
        for(num=1; num<100; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " +num + "= " + sroot);
            //compute rounding error
            rerr = num - (sroot*sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}
