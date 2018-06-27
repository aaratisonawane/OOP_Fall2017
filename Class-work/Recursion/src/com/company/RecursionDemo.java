package com.company;

public class RecursionDemo {
   static int factorial(int n){
        System.out.println("factorial: " +n);
        if(n==1)
            return  1;
       int  result = n * factorial(n-1);
        System.out.println("res =" + result);

       return  result;
    }
    static int fib(int n){
        System.out.println("fib: "+n);
        if (n<3)
            return  1;
        return fib (n-1) + fib(n-2);

    }
    static  int sumUpto(int n ){
//        int sum =0;
//        for(int i=0; i<= n; i++)
//            sum = sum +i;
//        return sum;
        if(n ==1)
            return  1;
        return n + sumUpto(n-1);


    }
    static  int sumFromto(int a, int b){
//        int sum = 0;
//        for(int i=a; i<= b; i++)
//        sum = sum + i;
//     return sum;
//return sumUpto(b)-sumUpto(a-1);
  //      if(a==b) return b;
        if(a>b) return 0 ;
  return a + sumFromto(a+1,b);


    }
   static void printAlphabetsTo(char ch) {

           System.out.println(ch);

    }


//
//    }

    public static void main(String[] args) {
	// write your code here
        //System.out.println((factorial(4)));
        System.out.println((fib(4)));
        //System.out.println((sumUpto(5)));
       // System.out.println((sumFromto(2, 5)));
        System.out.println(printAlphabetsTo());




    }
}
