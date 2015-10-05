package com.example.hzhu6.assignment1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThreeplayerActivity extends ActionBarActivity {
    private save_loadsystem threeresults = new save_loadsystem(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threeplayer);

        final Button opthbutton = (Button)findViewById(R.id.playeroneofthree);
        final Button tpthbutton = (Button)findViewById(R.id.playertwoofthree);
        final Button thpthbutton = (Button)findViewById(R.id.playerthreeofthree);

        final AlertDialog.Builder powin = new AlertDialog.Builder(ThreeplayerActivity.this);//set up wining info
        powin.setMessage("Player1 has won this game");
        powin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final AlertDialog.Builder ptwin = new AlertDialog.Builder(ThreeplayerActivity.this);//set up wining info
        ptwin.setMessage("Player2 has won this game");
        ptwin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final AlertDialog.Builder pthwin = new AlertDialog.Builder(ThreeplayerActivity.this);//set up wining info
        pthwin.setMessage("Player3 has won this game");
        pthwin.setNegativeButton("restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        opthbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                powin.show();
                threeresults.loadFromFile(ThreeplayerActivity.this);
                threeresults.getalldata().addOneofthree();           //load old data, add one to wining count, save back to file
                threeresults.saveInFile(ThreeplayerActivity.this);
                setResult(RESULT_OK);
            }
        });

        tpthbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                ptwin.show();
                threeresults.loadFromFile(ThreeplayerActivity.this);
                threeresults.getalldata().addTwoofthree();//load old data, add one to wining count, save back to file
                threeresults.saveInFile(ThreeplayerActivity.this);
                setResult(RESULT_OK);
            }
        });

        thpthbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                pthwin.show();
                threeresults.loadFromFile(ThreeplayerActivity.this);
                threeresults.getalldata().addThreeofthree();//load old data, add one to wining count, save back to file
                threeresults.saveInFile(ThreeplayerActivity.this);
                setResult(RESULT_OK);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_threeplayer, menu);
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
