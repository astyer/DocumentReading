package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        Scanner sf = new Scanner(new File("MyData.txt"));

        int maxIndex = -1;
        String text [] = new String [1000];
        while(sf.hasNext())
        {
            maxIndex++;
            text[maxIndex] = sf.nextLine();
        }
        sf.close();

        for(int i = 0; i <= maxIndex; i++)
        {
            System.out.println(text[i]);
        }
    }
}
