package com.company;
class FailSoftArray{
    int a[];
    int size;
    int errval;
    public FailSoftArray(int size, int errval){
        this.size = size;
        a = new int[size];
        this.errval = errval;
    }
    int get (int index){
        if(index >=0 && index < size)
        return  a[index];
        else return errval;
    }
    int set (int index, int val) {
        if(index >=0 && index < size)
            a[index] = val;
        return val;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        FailSoftArray sample = new FailSoftArray(5,-1);
        int i;
        for(i=0; i< 10; i++)
            sample.set(i, 10*i+1);
        for(i=0; i< 10; i++)
            System.out.println("sample [" + i + "]= " +sample.get(i));

    }
}
