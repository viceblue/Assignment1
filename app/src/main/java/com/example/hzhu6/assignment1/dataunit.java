package com.example.hzhu6.assignment1;

import java.util.ArrayList;

/**
 * Created by hzhu6 on 10/3/15.
 */
public class dataunit {
    private ArrayList<Double> single_result= new ArrayList<Double>();
    private int oneoftwo = 0;
    private int twooftwo = 0;
    private int oneofthree = 0;
    private int twoofthree = 0;
    private int threeofthree = 0;
    private int oneoffour = 0;
    private int twooffour = 0;
    private int threeoffour = 0;
    private int fouroffour = 0;

    public void addtosingle(double n){
        single_result.add(n);
    }


    public void addOneoftwo() {
        oneoftwo++;
    }

    public void addTwooftwo() {
        twooftwo++;
    }

    public void addOneofthree() {
        oneofthree++;
    }

    public void addTwoofthree() {
        twoofthree++;
    }

    public void addThreeofthree() {
        threeofthree++;
    }

    public void addOneoffour() {
        oneoffour++;
    }

    public void addTwooffour() {
        twooffour++;
    }

    public void addThreeoffour() {
        threeoffour++;
    }

    public void addFouroffour() {
        fouroffour++;
    }

    public int getOneoftwo() {
        return oneoftwo;
    }

    public int getTwooftwo() {
        return twooftwo;
    }

    public int getOneofthree() {
        return oneofthree;
    }

    public int getTwoofthree() {
        return twoofthree;
    }

    public int getThreeofthree() {
        return threeofthree;
    }

    public int getOneoffour() {
        return oneoffour;
    }

    public int getTwooffour() {
        return twooffour;
    }

    public int getThreeoffour() {
        return threeoffour;
    }

    public int getFouroffour() {
        return fouroffour;
    }

    public ArrayList<Double> getSingle_result() {
        return single_result;
    }

    public dataunit() {
        single_result= new ArrayList<Double>();
        oneoftwo = 0;
        twooftwo = 0;
        oneofthree = 0;
        twoofthree = 0;
        threeofthree = 0;
        oneoffour = 0;
        twooffour = 0;
        threeoffour = 0;
        fouroffour = 0;
    }

    public void clear(){
        single_result= new ArrayList<Double>();
        oneoftwo = 0;
        twooftwo = 0;
        oneofthree = 0;
        twoofthree = 0;
        threeofthree = 0;
        oneoffour = 0;
        twooffour = 0;
        threeoffour = 0;
        fouroffour = 0;
    }
}
