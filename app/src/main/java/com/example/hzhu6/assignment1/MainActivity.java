package com.example.hzhu6.assignment1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button singlebutton = (Button) findViewById(R.id.singleplayer);
        Button multibutton = (Button) findViewById(R.id.multiplayer);
        Button staticsbutton = (Button) findViewById(R.id.statics);

        singlebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                singlemode(v);//click the button and leads to the activity
            }
        });


        multibutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                multimode(v);//click the button and leads to the activity
            }
        });

        staticsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                statics(v);//click the button and leads to the activity
            }
        });










    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void singlemode(View view){
        Intent intent = new Intent(this, SingleActivity.class);
        startActivity(intent);
    }

    public void multimode(View view){
        Intent intent = new Intent(this, MultipleActivity.class);
        startActivity(intent);
    }

    public void statics(View view){
        Intent intent = new Intent(this, StaticsActivity.class);
        startActivity(intent);
    }

}
