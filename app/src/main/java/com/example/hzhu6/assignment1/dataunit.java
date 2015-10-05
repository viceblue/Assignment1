package com.example.hzhu6.assignment1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hzhu6 on 10/3/15.
 */
public class dataunit {//data unit is the data that going to be stored in file
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
    }//these adders allows modifications from outside of the class, but in a pre-defined way, safe

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
    }// these getters are just getters, I used magic to generated them

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

    private ArrayList<Double> cloneAL(int n){
        ArrayList<Double> T = new ArrayList<Double>();
        if(single_result.size()>n) {
            for (int i = 0; i < n; i++) {
                T.add(single_result.get(n - i));           //clone a double array of single_result
            }
            return T;
        }else{
            return single_result;
        }
    }
//some function for static data
    public double lasttenmax() {
        if(cloneAL(10).size()!=0) {
            return Collections.max(cloneAL(10));
        }else{
            return 0;
        }
    }

    public double lasthandredmax() {
        if(cloneAL(100).size()!=0) {
            return Collections.max(cloneAL(100));
        }else{
            return 0;
        }
    }

    public double lasttenmin() {
        if(cloneAL(10).size()!=0) {
            return Collections.min(cloneAL(10));
        }else{
            return 0;
        }
    }

    public double lasthandredmin() {
        if(cloneAL(100).size()!=0) {
            return Collections.min(cloneAL(100));
        }else{
            return 0;
        }
    }

    public double lasttenaverage() {
        double sum=0;
        int n = cloneAL(10).size();
        if(n!=0) {
            for (int i = 0; i < n; i++) {
                sum += cloneAL(10).get(i);
            }
            return sum / n;
        }else{
            return 0;
        }
    }

    public double lasthandredaverage() {
        double sum=0;
        int n = cloneAL(100).size();
        if(n!=0) {
            for (int i = 0; i < n; i++) {
                sum += cloneAL(100).get(i);
            }
            return sum / n;
        }else{
            return 0;
        }
    }

    public double lasttenmedian() {
        ArrayList<Double> T = cloneAL(10);
        Collections.sort(T);
        int n = T.size();
        if(n!=0) {
            if ((n)%2 == 0) {
                return (T.get((n/2)-1) + T.get((n/2)))/2;
            } else {
                return T.get((n/2));
            }
        }else{
            return 0;
        }
    }

    public double lasthandredmedian() {
        ArrayList<Double> T = cloneAL(100);
        Collections.sort(T);
        int n = T.size();
        if(n!=0) {
            if ((n)%2 == 0) {
                return (T.get((n/2)-1) + T.get((n/2)))/2;
            } else {
                return T.get((n/2));
            }
        }else{
            return 0;
        }
    }

    public dataunit() {//defult constructor
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
