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
import android.widget.Toast;

import java.util.Random;

public class SingleActivity extends ActionBarActivity {
    private boolean isclicked = false;
    private save_loadsystem singleresult = new save_loadsystem(this);
    private Random rand = new Random();
    private int  n;

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




        n = rand.nextInt(1990) + 10; //get a random latency number




        buzzbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                final CountDownTimer ctime = new CountDownTimer(n , 10) {//set up count down timer

                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        singlemode_display.setText("click now");// if count down timer successfully finished, tell user to click, and start to calculate time difference
                        singletimer.startTimer();
                    }

                };

                if (isclicked == false) {// one button two action, use isclicked as flag
                        singlemode_display.setText(" ");
                        ctime.start();
                        isclicked = true;

                        buzzbutton.setText("STOP!");
                    } else {
                        if(singlemode_display.getText()!="click now"){//camplain when I have not told you to click
                            ctime.cancel();
                            singlemode_display.setText("too early");
                            isclicked = false;

                        }else {
                            double endtime = singletimer.endTimer();//successful movement. recourd data
                            isclicked = false;
                            n = rand.nextInt(1990) + 10;
                            singlemode_display.setText(Double.toString(endtime)+"ms");
                            singleresult.loadFromFile(SingleActivity.this);
                            singleresult.getalldata().addtosingle(endtime);
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
