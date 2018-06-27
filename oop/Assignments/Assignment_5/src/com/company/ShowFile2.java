package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) {
                    if (i == 'e') {
                        System.out.print('E');
                    } else {
                        System.out.print((char) i);
                    }
                }
            } while (i != -1);
            fin.close();
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
        } catch (IOException exc) {
            System.out.println("IOException happened");
        }
    }
}
