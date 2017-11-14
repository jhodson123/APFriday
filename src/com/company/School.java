package com.company;

/**
 * Created by jh424 on 11/10/17.
 */
public class School {


    public String schoolName;
    public int mathScore = 0;
    public int readingScore  = 0;
    public int writingScore = 0;

    public School(String name, String mScore, String rScore, String wScore){


        schoolName = name;
        if (!(rScore.equals(""))) {

            readingScore = Integer.parseInt(rScore);

            mathScore = Integer.parseInt(mScore);

            writingScore = Integer.parseInt(wScore);
        }
    }

    public int getScore(){

        int score;

        score = readingScore + mathScore + writingScore;

        return score;
    }
}
