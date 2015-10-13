package com.example.valentine.dailymotivaiton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Video extends AppCompatActivity {
String tag="Video";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag, "onCreate");
        setContentView(R.layout.activity_video);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//Add8cards

        MyAdapter adapter=new MyAdapter(new String[8]);

        recyclerView.setAdapter(adapter);
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

    public static class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
        private String[] mDataset;

        public static class ViewHolder extends RecyclerView.ViewHolder{
            public View view;
            public TextView title;

            public ViewHolder(View v){
                super(v);
                view=v;
                title=(TextView)v.findViewById(R.id.card_title);
            }
        }

        public MyAdapter(String[]myDataset){
            mDataset=myDataset;
        }

        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
            View cardview= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
            return new ViewHolder(cardview);

        }

        @Override

        public void onBindViewHolder(ViewHolder holder,int position){

            holder.title.setText("Card"+(position+1));

        }

        @Override

        public int getItemCount(){

            return mDataset.length;

        }
    }
}
