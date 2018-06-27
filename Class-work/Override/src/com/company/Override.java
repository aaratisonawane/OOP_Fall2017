package com.company;

class A{
    int i, j;
    A(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("i and j: "+ i + " "+ j);
    }

}

class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void show(){
        System.out.println("k: "+ k);
    }
}

public class Override {

    public static void main(String[] args) {
	// write your code here
        A obj = new A(1,2);
        obj.show();



    }
}
