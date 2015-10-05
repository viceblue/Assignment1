package com.example.hzhu6.assignment1;

/**
 * Created by hzhu6 on 10/3/15.
 */
public class timer {//a class to set up timer for single activity using
    private double starttime;
    private int    player_num;

    public timer(int player_num) {//constructor, incase of record mutiple time
        this.starttime = 0;
        this.player_num = player_num;
    }

    public timer() {//default constructor
        this.starttime = 0;
        this.player_num = 0;
    }



    public void startTimer(){
        starttime=System.currentTimeMillis();
    }

    public double endTimer(){
        return (System.currentTimeMillis()-this.starttime);
    }//return the time difference

}
