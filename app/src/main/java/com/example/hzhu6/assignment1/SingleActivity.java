package com.example.hzhu6.assignment1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SingleActivity extends ActionBarActivity {
    private boolean isclicked = false;
    private save_loadsystem singleresult = new save_loadsystem(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //int flag =0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        final timer singletimer = new timer(1);



        final Button buzzbutton = (Button)findViewById(R.id.singlebuzz);
        final TextView singlemode_display= (TextView)findViewById(R.id.singletext);
        singlemode_display.setText("press button to start");
        //intro alertdialog
        AlertDialog.Builder intro = new AlertDialog.Builder(SingleActivity.this);
        intro.setMessage("Once you click 'okay', game start. click start button to start, click again to stop");
        intro.setNegativeButton("okay", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        intro.show();
        //end intro alertdialog

        Random rand = new Random();

        int  n = rand.nextInt(1990) + 10;

        final CountDownTimer ctime = new CountDownTimer(n , 10) {

                            public void onTick(long millisUntilFinished) {
                                //singlemode_display.setText("seconds remaining: " + millisUntilFinished / 100);
                            }

                            public void onFinish() {
                                singlemode_display.setText("click now");
                                singletimer.startTimer();
                            }

        };




        buzzbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something

                    if (isclicked == false) {
                        singlemode_display.setText("0");
                        ctime.start();
                        isclicked = true;

                        buzzbutton.setText("STOP!");
                    } else {
                        if(singlemode_display.getText()!="click now"){
                            ctime.cancel();
                            singlemode_display.setText("too early");
                            isclicked = false;

                        }else {
                            double endtime = singletimer.endTimer();
                            isclicked = false;
                            singlemode_display.setText(Double.toString(endtime));
                            singleresult.loadFromFile(SingleActivity.this);
                            singleresult.getalldata().getSingle_result().add(endtime);
                            singleresult.saveInFile(SingleActivity.this);
                        }
                        buzzbutton.setText("RESTART");
                    }

                setResult(RESULT_OK);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public String gettext(){
        return "start";
    }
}
