package com.example.hzhu6.assignment1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MultipleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
        Button two_button = (Button) findViewById(R.id.twoplayer);
        Button three_button = (Button) findViewById(R.id.threeplayer);
        Button four_button = (Button) findViewById(R.id.fourplayer);

        two_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                twomode(v);//click the button and leads to the activity
            }
        });


        three_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                threemode(v);//click the button and leads to the activity
            }
        });

        four_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                fourmode(v);//click the button and leads to the activity
            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_multiple, menu);
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

    public void twomode(View view){
        Intent intent = new Intent(this, TwoplayerActivity.class);
        startActivity(intent);
    }

    public void threemode(View view){
        Intent intent = new Intent(this, ThreeplayerActivity.class);
        startActivity(intent);
    }

    public void fourmode(View view){
        Intent intent = new Intent(this, FourplayerActivity.class);
        startActivity(intent);
    }







}
