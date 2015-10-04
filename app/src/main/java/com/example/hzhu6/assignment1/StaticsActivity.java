package com.example.hzhu6.assignment1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StaticsActivity extends ActionBarActivity {
    private save_loadsystem staticdata = new save_loadsystem(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statics);

        final Button clearbutton = (Button)findViewById(R.id.clear);
        final Button emailbutton = (Button)findViewById(R.id.email);

        final TextView staticlayout= (TextView)findViewById(R.id.staticsdisplay);
        staticdata.loadFromFile(StaticsActivity.this);
        staticlayout.setText("Single player results " +
                        "player1 in 2-player " + Integer.toString(staticdata.getalldata().getOneoftwo()) + "\n" +
                        "player2 in 2-player " + Integer.toString(staticdata.getalldata().getTwooftwo()) + "\n" +
                        "player1 in 3-player " + Integer.toString(staticdata.getalldata().getOneofthree()) + "\n" +
                        "player2 in 3-player " + Integer.toString(staticdata.getalldata().getTwoofthree()) + "\n" +
                        "player3 in 3-player " + Integer.toString(staticdata.getalldata().getThreeofthree()) + "\n" +
                        "player1 in 4-player " + Integer.toString(staticdata.getalldata().getOneoffour()) + "\n" +
                        "player2 in 4-player " + Integer.toString(staticdata.getalldata().getTwooffour()) + "\n" +
                        "player3 in 4-player " + Integer.toString(staticdata.getalldata().getThreeoffour()) + "\n" +
                        "player4 in 4-player " + Integer.toString(staticdata.getalldata().getFouroffour()) + "\n"
        );

        clearbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {// new added
                //do something
                setResult(RESULT_OK);
                staticdata.cleardata();
                staticdata.saveInFile(StaticsActivity.this);
                staticlayout.setText("Single player results " +"\n"+
                                "player1 in 2-player " + Integer.toString(staticdata.getalldata().getOneoftwo()) + "\n" +
                                "player2 in 2-player " + Integer.toString(staticdata.getalldata().getTwooftwo()) + "\n" +
                                "player1 in 3-player " + Integer.toString(staticdata.getalldata().getOneofthree()) + "\n" +
                                "player2 in 3-player " + Integer.toString(staticdata.getalldata().getTwoofthree()) + "\n" +
                                "player3 in 3-player " + Integer.toString(staticdata.getalldata().getThreeofthree()) + "\n" +
                                "player1 in 4-player " + Integer.toString(staticdata.getalldata().getOneoffour()) + "\n" +
                                "player2 in 4-player " + Integer.toString(staticdata.getalldata().getTwooffour()) + "\n" +
                                "player3 in 4-player " + Integer.toString(staticdata.getalldata().getThreeoffour()) + "\n" +
                                "player4 in 4-player " + Integer.toString(staticdata.getalldata().getFouroffour()) + "\n"
                );
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_statics, menu);
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
