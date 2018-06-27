package com.company;

public class StringDemo {
    public static String stringMerge(String[] words){
        String result = "";
        for(int i =0; i<words.length; i++){
            System.out.print(words[i]);
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(stringMerge(new String[]{"Hi","Guys"}));
        System.out.println(stringMerge(new String[]{"A","-","Z","abc"}));
    }
}
