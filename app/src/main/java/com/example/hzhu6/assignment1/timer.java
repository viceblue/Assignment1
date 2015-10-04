package com.example.hzhu6.assignment1;

/**
 * Created by hzhu6 on 10/3/15.
 */
public class timer {
    private double starttime;
    private int    player_num;

    public timer(int player_num) {
        this.starttime = 0;
        this.player_num = player_num;
    }

    public timer() {
        this.starttime = 0;
        this.player_num = 0;
    }



    public void startTimer(){
        starttime=System.currentTimeMillis();
    }

    public double endTimer(){
        return (System.currentTimeMillis()-this.starttime);
    }

}
