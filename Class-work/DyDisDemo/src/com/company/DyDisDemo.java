package com.company;
class Sup{
    void who(){
        System.out.println("who(); in sup");
    }
}
class Sub1 extends Sup{
    void who(){
        System.out.println("who(); in Sub1");

    }
    class Sub2 extends Sup{
        void who(){
            System.out.println("who(); in Sub2");

        }

        public class DyDisDemo {

            public static void main(String[] args) {
                // write your code here

                Sup superob = new Sup();
                Sub1 subObj1 = new Sub1();
                Sub1 subObj2 = new Sub2();


            }
        }

