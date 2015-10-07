package com.example.valentine.dailymotivaiton;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
String tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Log.i(tag, "onCreate");
        TabHost tabHost=getTabHost();

        TabHost.TabSpec tab1=tabHost.newTabSpec("tab1");
        tab1.setIndicator("Audio");
        Intent i1=new Intent(MainActivity.this,Audio.class);
        tab1.setContent(i1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("tab2");
        tab2.setIndicator("Video");
        Intent i2=new Intent(MainActivity.this,Video.class);
        tab2.setContent(i2);

        TabHost.TabSpec tab3=tabHost.newTabSpec("tab3");
        tab3.setIndicator("Quotes");
        Intent i3=new Intent(MainActivity.this,Qoutes.class);
        tab3.setContent(i3);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag, "onResume");
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
}
