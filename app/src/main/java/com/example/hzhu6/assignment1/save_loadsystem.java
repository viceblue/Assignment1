package com.example.hzhu6.assignment1;

import android.app.Activity;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by hzhu6 on 10/3/15.
 */
public class save_loadsystem{

    private static final String FILENAME = "file.sav";
    private dataunit alldata = new dataunit();


    public dataunit getalldata() {
        return alldata;
    }

    public save_loadsystem(Context context) {
        //this.loadFromFile(context);
    }

    public void cleardata(){
        alldata.clear();
    }


    public void  loadFromFile(Context context) {
        //ArrayList<String> tweets = new ArrayList<String>();
        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            Gson gson = new Gson();
            Type listType = new TypeToken<dataunit>() {}.getType();
            //take from https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/Gson.html
            alldata =gson.fromJson(in, listType);



        } catch (FileNotFoundException e) {
            alldata = new dataunit();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //return tweets.toArray(new String[tweets.size()]);
    }
    public void saveInFile(Context context) {//somthing wrong happens here
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME,
                    0);
            OutputStreamWriter writer= new OutputStreamWriter(fos);
            Gson gson =new Gson();
            gson.toJson(this.alldata, writer);
            writer.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
