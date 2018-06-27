package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            System.out.println("copy from the input file to the output file....");
            do {
                i = fin.read();
                if (i != -1){
                    System.out.print((char) i);
                    fout.write(i);
                }
            }while (i != -1);
            System.out.println("\nDone copying file");
            fin.close();
            fout.close();
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
        } catch (IOException exc) {
            System.out.println("IOException happened");
        }

    }
}
