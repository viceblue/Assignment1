package com.example.hzhu6.assignment1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FourplayerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourplayer);


        final Button opfbutton = (Button)findViewById(R.id.playeroneoffour);
        final Button tpfbutton = (Button)findViewById(R.id.playertwooffour);
        final Button thpfbutton = (Button)findViewById(R.id.playerthreeoffour);
        final Button fpfbutton = (Button)findViewById(R.id.playerfouroffour);


        final AlertDialog.Builder powin = new AlertDialog.Builder(FourplayerActivity.this);
        powin.setMessage("Player1 has won this game");
        powin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final AlertDialog.Builder ptwin = new AlertDialog.Builder(FourplayerActivity.this);
        ptwin.setMessage("Player2 has won this game");
        ptwin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final AlertDialog.Builder pthwin = new AlertDialog.Builder(FourplayerActivity.this);
        pthwin.setMessage("Player3 has won this game");
        pthwin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final AlertDialog.Builder pfwin = new AlertDialog.Builder(FourplayerActivity.this);
        pfwin.setMessage("Player4 has won this game");
        pfwin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });




        opfbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                powin.show();
                setResult(RESULT_OK);
            }
        });

        tpfbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                ptwin.show();
                setResult(RESULT_OK);
            }
        });

        thpfbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                pthwin.show();
                setResult(RESULT_OK);
            }
        });

        fpfbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                pfwin.show();
                setResult(RESULT_OK);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourplayer, menu);
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
}
