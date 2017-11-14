package com.company;


import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        Scanner sf = new Scanner(new File("scores.txt"));
        School[] schools = new School[434];

        String first = "";
        String second = "";
        String third = "";

        School sfirst = new School(null,"0","0","0");
        School ssecond = new School(null,"0","0","0");
        School sthird = new School(null,"0","0","0");

        sf.nextLine();

        int index = -1;
        while (sf.hasNext()){
            String line = sf.nextLine();
            String[] text = line.split("\t");

            if(text.length > 19){
                schools[++index] = new School(text[1], text[18], text[19], text[20]);
                //System.out.println(schools[index].schoolName + ": " + schools[index].getScore());
            }
        }
        sf.close();

        for (School s: schools){

            if (!(s.equals(null)))
                System.out.println(s.schoolName);


        }

        System.out.println("First: " + sfirst.schoolName + "\n" +
                "Second: " + ssecond.schoolName + "\n" +
                "Third: " + sthird.schoolName);
    }
}

//school name index 1
// 16 | 17 | 18