package com.example.hzhu6.assignment1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TwoplayerActivity extends ActionBarActivity {
    private save_loadsystem tworesults = new save_loadsystem(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer);

        final Button optbutton = (Button)findViewById(R.id.playeroneoftwo);
        final Button tptbutton = (Button)findViewById(R.id.playertwooftwo);
        final TextView aaa= (TextView)findViewById(R.id.xxx);


        final AlertDialog.Builder powin = new AlertDialog.Builder(TwoplayerActivity.this);
        powin.setMessage("Player1 has won this game");
        powin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final AlertDialog.Builder ptwin = new AlertDialog.Builder(TwoplayerActivity.this);
        ptwin.setMessage("Player2 has won this game");
        ptwin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        optbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                powin.show();
                tworesults.loadFromFile(TwoplayerActivity.this);
                tworesults.getalldata().addOneoftwo();
                tworesults.saveInFile(TwoplayerActivity.this);
                setResult(RESULT_OK);
            }
        });

        tptbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                ptwin.show();
                tworesults.loadFromFile(TwoplayerActivity.this);
                tworesults.getalldata().addTwooftwo();
                tworesults.saveInFile(TwoplayerActivity.this);
                setResult(RESULT_OK);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_twoplayer, menu);
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
