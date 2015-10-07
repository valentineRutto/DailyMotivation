package com.example.valentine.dailymotivaiton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Video extends Activity {
String tag="Video";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag, "onCreate");
        setContentView(R.layout.activity_video);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag, "onRestart");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(tag, "onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag, "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(tag, "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag, "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video, menu);
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
